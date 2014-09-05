package com.statelessSoftware.forecast.client.models;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map.Entry;
import java.util.TimeZone;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class ForecastDeserializer implements JsonDeserializer<Forecast>
{
	/* (non-Javadoc)
	 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Forecast deserialize(JsonElement json, Type type,
			JsonDeserializationContext context) throws JsonParseException
	{
		Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
			.registerTypeAdapter(Alert.class, new AlertDeserializer())
			.registerTypeAdapter(DataBlock.class, new DataBlockDeserializer())
			.registerTypeAdapter(DataPoint.class, new DataPointDeserializer())
			.create();

		Forecast forecast = gson.fromJson(json, type);
		JsonObject responseObj = json.getAsJsonObject();

		forecast.setAlerts(gson.fromJson(responseObj.get("alerts"), Alert[].class));
		forecast.setCurrently(gson.fromJson(responseObj.get("currently"), DataPoint.class));
		forecast.setDaily(gson.fromJson(responseObj.get("daily"), DataBlock.class));
		forecast.setHourly(gson.fromJson(responseObj.get("hourly"), DataBlock.class));
		forecast.setLatitude(new Double(responseObj.get("latitude").getAsDouble()));
		forecast.setLongitude(new Double(responseObj.get("longitude").getAsDouble()));
		forecast.setMinutely(gson.fromJson(responseObj.get("minutely"), DataBlock.class));
		forecast.setOffset(responseObj.get("offset").getAsInt());
		forecast.setTimezone(TimeZone.getTimeZone(responseObj.get("timezone").getAsString()));
//		forecast.setxForecastApiCalls(xForecastApiCalls); // They don't seem to actually send this back.

		if (responseObj.get("flags") != null)
		{
			JsonObject flags = responseObj.get("flags").getAsJsonObject();
			Type listOfStringsType = new TypeToken<List<String>>(){}.getType();
			forecast.setSources((List<String>) gson.fromJson(flags.get("sources"), listOfStringsType));
			forecast.setUnits(Units.valueOf(flags.get("units").getAsString().toUpperCase()));

			for (Entry<String, JsonElement> entry : flags.entrySet())
			{
				String key = entry.getKey();
				JsonElement value = entry.getValue();

				if (key.endsWith("-stations")) {
					forecast.getStations().put(key.substring(0, key.lastIndexOf("-")), (List<String>) gson.fromJson(value, listOfStringsType));
				}
			}
		}

		return forecast;
	}
}
