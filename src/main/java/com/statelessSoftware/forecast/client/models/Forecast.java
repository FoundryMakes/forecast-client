package com.statelessSoftware.forecast.client.models;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;


/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class Forecast
{
	private Double latitude;

	private Double longitude;

	private TimeZone timezone;

	private int offset;

	private Map<String, List<String>> stations = new HashMap<String, List<String>>();

	private List<String> sources; // flags.sources

	private Units units; // flags.units

	private DataPoint currently;

	private DataBlock minutely;

	private DataBlock hourly;

	private DataBlock daily;

	private List<Alert> alerts;

	// flags.darksky-unavailable TODO: Implement this once I can see it happen :)

	// flags.metno-license  TODO: Implement this once I can see it happen :)


	/**
	 * The number of API calls made today.
	 */
	private Integer xForecastApiCalls;


	/**
	 * @return the latitude
	 */
	public Double getLatitude()
	{
		return latitude;
	}


	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude)
	{
		this.latitude = latitude;
	}


	/**
	 * @return the longitude
	 */
	public Double getLongitude()
	{
		return longitude;
	}


	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude)
	{
		this.longitude = longitude;
	}


	/**
	 * @return the timezone
	 */
	public TimeZone getTimezone()
	{
		return timezone;
	}


	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(TimeZone timezone)
	{
		this.timezone = timezone;
	}


	/**
	 * @return the offset
	 */
	public int getOffset()
	{
		return offset;
	}


	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset)
	{
		this.offset = offset;
	}


	/**
	 * @return the currently
	 */
	public DataPoint getCurrently()
	{
		return currently;
	}


	/**
	 * @param currently the currently to set
	 */
	public void setCurrently(DataPoint currently)
	{
		this.currently = currently;
	}


	/**
	 * @return the minutely
	 */
	public DataBlock getMinutely()
	{
		return minutely;
	}


	/**
	 * @param minutely the minutely to set
	 */
	public void setMinutely(DataBlock minutely)
	{
		this.minutely = minutely;
	}


	/**
	 * @return the hourly
	 */
	public DataBlock getHourly()
	{
		return hourly;
	}


	/**
	 * @param hourly the hourly to set
	 */
	public void setHourly(DataBlock hourly)
	{
		this.hourly = hourly;
	}


	/**
	 * @return the daily
	 */
	public DataBlock getDaily()
	{
		return daily;
	}


	/**
	 * @param daily the daily to set
	 */
	public void setDaily(DataBlock daily)
	{
		this.daily = daily;
	}


	/**
	 * @return the alerts
	 */
	public List<Alert> getAlerts()
	{
		return alerts;
	}


	/**
	 * @param alerts the alerts to set
	 */
	public void setAlerts(List<Alert> alerts)
	{
		this.alerts = alerts;
	}


	/**
	 * @param alerts
	 */
	public void setAlerts(Alert[] alerts)
	{
		this.alerts = alerts != null ? Arrays.asList(alerts) : null;
	}


	/**
	 * @return the xForecastApiCalls
	 */
	public Integer getxForecastApiCalls()
	{
		return xForecastApiCalls;
	}


	/**
	 * @param xForecastApiCalls the xForecastApiCalls to set
	 */
	public void setxForecastApiCalls(Integer xForecastApiCalls)
	{
		this.xForecastApiCalls = xForecastApiCalls;
	}


	/**
	 * @return the sources
	 */
	public List<String> getSources()
	{
		return sources;
	}


	/**
	 * @param sources the sources to set
	 */
	public void setSources(List<String> sources)
	{
		this.sources = sources;
	}


	/**
	 * @return the units
	 */
	public Units getUnits()
	{
		return units;
	}


	/**
	 * @param units the units to set
	 */
	public void setUnits(Units units)
	{
		this.units = units;
	}


	/**
	 * @return the stations
	 */
	public Map<String, List<String>> getStations()
	{
		return stations;
	}


	/**
	 * @param stations the stations to set
	 */
	public void setStations(Map<String, List<String>> stations)
	{
		this.stations = stations;
	}
}
