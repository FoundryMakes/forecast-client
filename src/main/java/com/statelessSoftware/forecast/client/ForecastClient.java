package com.statelessSoftware.forecast.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.statelessSoftware.forecast.client.exceptions.ForecastException;
import com.statelessSoftware.forecast.client.models.Blocks;
import com.statelessSoftware.forecast.client.models.Forecast;
import com.statelessSoftware.forecast.client.models.ForecastDeserializer;
import com.statelessSoftware.forecast.client.models.Units;


/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class ForecastClient
{
	public static final String BASE_API_URL = "https://api.forecast.io/forecast/";

	public static final Units DEFAULT_UNITS = Units.US; // Sorry non-US folks. :)

	public static final String CLIENT_VERSION = "0.1";

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

	protected String apiKey;


	/**
	 * @param apiKey
	 */
	public ForecastClient(String apiKey)
	{
		if (apiKey == null) {
			throw new ForecastException("You must set a valid API Key.");
		}

		this.apiKey = apiKey;
	}


	/**
	 * @param latitude
	 * @param longitude
	 * @return
	 */
	public Forecast fetchForecast(Double latitude, Double longitude)
	{
		return fetchForecast(latitude, longitude, (Date) null);
	}


	/**
	 * @param latitude
	 * @param longitude
	 * @param exclude
	 * @return
	 */
	public Forecast fetchForecast(Double latitude, Double longitude, Blocks... exclude)
	{
		return fetchForecast(latitude, longitude, (Date) null, (Units) null, exclude);
	}


	/**
	 * @param latitude
	 * @param longitude
	 * @param date
	 * @return
	 */
	public Forecast fetchForecast(Double latitude, Double longitude, Date date)
	{
		return fetchForecast(latitude, longitude, date, (Units) null, (Blocks[]) null);
	}


	/**
	 * @param latitude
	 * @param longitude
	 * @param date
	 * @param exclude
	 * @return
	 */
	public Forecast fetchForecast(Double latitude, Double longitude, Date date, Blocks... exclude)
	{
		return fetchForecast(latitude, longitude, date, (Units) null, exclude);
	}


	/**
	 * @param latitude
	 * @param longitude
	 * @param date
	 * @param units
	 * @param exclude
	 * @return
	 */
	public Forecast fetchForecast(Double latitude, Double longitude, Date date, Units units, Blocks... exclude)
	{
		String jsonString = fetch(apiKey, latitude, longitude, date, units, exclude);

		Gson gson = new GsonBuilder()
			.registerTypeAdapter(Forecast.class, new ForecastDeserializer())
			.create();

		Forecast response = gson.fromJson(jsonString, Forecast.class);
		return response;
	}


	/**
	 * @param apiKey
	 * @param latitude
	 * @param longitude
	 * @param time
	 * @param units
	 * @param exclude
	 * @return
	 */
	private static String fetch(String apiKey, Double latitude, Double longitude,
			Date time, Units units, Blocks... exclude)
	{
		StringBuilder path = new StringBuilder("/forecast/" + apiKey + "/" + latitude + "," + longitude);

		if (time != null) 
		{
			// TODO: Do something with the timezone here
			path.append("," + dateFormat.format(time));
		}

		Map<String, String> parameters = new HashMap<String, String>();

		if (units != null)
		{
			parameters.put("units", units.toString().toLowerCase());
		}

		if (exclude != null && exclude.length > 0)
		{
			StringBuffer excludeStr = new StringBuffer();

	        for (Blocks block : exclude)
	        {
	        	if (excludeStr.length() > 0)
	        	{
	        		excludeStr.append(",");
	        	}

	        	excludeStr.append(block.toString().toLowerCase());
	        }

			parameters.put("exclude", excludeStr.toString());
		}

		HttpURLConnection connection = null; 

		try
		{
			URL url = new URL("https", "api.forecast.io", path.toString() + (parameters.size() > 0 ? "?" + Utilities.getQueryString(parameters) : ""));
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Host", "api.forecast.io");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Accept-Charset", "UTF-8");
			connection.setRequestProperty("User-Agent", String.format("Stateless Software Forecast Client/%s", ForecastClient.CLIENT_VERSION));
			connection.setUseCaches(false);

			int responseCode = connection.getResponseCode();

			if (responseCode >= 200 && responseCode < 300)
			{
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String inputLine;

				StringBuilder response = new StringBuilder();

				while ((inputLine = in.readLine()) != null)
				{
					response.append(inputLine);
				}

				in.close();

				return response.toString();
			}
			else
			{
				throw new ForecastException("The forecase API returned something other than a success HTTP Status: " + responseCode);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (connection != null)
			{
				connection.disconnect();
			}
		}

		return null;
	}
}
