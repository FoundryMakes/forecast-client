package com.statelessSoftware.forecast.client;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.statelessSoftware.forecast.client.models.Blocks;
import com.statelessSoftware.forecast.client.models.Forecast;
import com.statelessSoftware.forecast.client.models.Units;

import static org.junit.Assert.*;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class ForecastClientTest
{
	private static String apiKey = "2a51368bbf25fab02d9c0d41aa00b132";

	private static Double minneapolisLatitude;
	private static Double minneapolisLongitude;

	private static Double sanDiegoLatitude;
	private static Double sanDiegoLongitude;

	private static Double nycLatitude;
	private static Double nycLongitude;


	/**
	 * 
	 */
	@Before
	public void setUp() {
		apiKey = "2a51368bbf25fab02d9c0d41aa00b132";

		minneapolisLatitude = new Double(44.9776535);
		minneapolisLongitude = new Double(-93.263954);

		sanDiegoLatitude = new Double(32.8245525);
		sanDiegoLongitude = new Double(-117.0951632);

		nycLatitude = new Double(40.7056308);
		nycLongitude = new Double(-73.9780035);
	}


	/**
	 * 
	 */
	@Test
	public void testLatLong()
	{
		assertNotNull(apiKey);

		ForecastClient client = new ForecastClient(apiKey);

		Forecast minneapolisForecast = client.fetchForecast(minneapolisLatitude, minneapolisLongitude);
		assertNotNull(minneapolisForecast);
		assertEquals(minneapolisLatitude, minneapolisForecast.getLatitude());
		assertEquals(minneapolisLongitude, minneapolisForecast.getLongitude());

		Forecast sanDiegoForecast = client.fetchForecast(sanDiegoLatitude, sanDiegoLongitude);
		assertNotNull(sanDiegoForecast);
		assertEquals(sanDiegoLatitude, sanDiegoForecast.getLatitude());
		assertEquals(sanDiegoLongitude, sanDiegoForecast.getLongitude());

		Forecast nycForecast = client.fetchForecast(nycLatitude, nycLongitude);
		assertNotNull(nycForecast);
		assertEquals(nycLatitude, nycForecast.getLatitude());
		assertEquals(nycLongitude, nycForecast.getLongitude());
	}


	@Test
	public void testLatLongDate()
	{
		assertNotNull(apiKey);

		ForecastClient client = new ForecastClient(apiKey);

		// We have to trim off milliseconds since Forecast doesn't use that resolution.
		Date tomorrow = new Date(((new Date().getTime() / 1000) * 1000) + 86400000);

		Forecast forecast = client.fetchForecast(minneapolisLatitude, minneapolisLongitude, tomorrow);
		assertNotNull(forecast);
		assertEquals(forecast.getCurrently().getTime(), tomorrow);
	}


	@Test
	public void testLatLongBlocks()
	{
		assertNotNull(apiKey);

		ForecastClient client = new ForecastClient(apiKey);

		Forecast forecast = client.fetchForecast(minneapolisLatitude, minneapolisLongitude, Blocks.ALERTS, Blocks.HOURLY, Blocks.FLAGS);
		assertNotNull(forecast);
		assertNull(forecast.getAlerts());
		assertNull(forecast.getHourly());
		assertNull(forecast.getUnits()); // Units is one of the flags :)
	}


	@Test
	public void testLatLongDateUnits()
	{
		assertNotNull(apiKey);

		ForecastClient client = new ForecastClient(apiKey);

		Forecast forecast = client.fetchForecast(minneapolisLatitude, minneapolisLongitude, new Date(), Units.CA);
		assertNotNull(forecast);
		assertEquals(Units.CA, forecast.getUnits());
	}


	@Test
	public void testLatLongDateUnitsBlocks()
	{
		assertNotNull(apiKey);

		ForecastClient client = new ForecastClient(apiKey);

		Forecast forecast = client.fetchForecast(minneapolisLatitude, minneapolisLongitude, new Date(), Units.SI, Blocks.ALERTS, Blocks.CURRENTLY, Blocks.MINUTELY);
		assertNotNull(forecast);
		assertEquals(Units.SI, forecast.getUnits());
		assertNull(forecast.getAlerts());
		assertNull(forecast.getCurrently());
		assertNull(forecast.getMinutely());
	}
}
