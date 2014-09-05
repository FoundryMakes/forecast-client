package com.statelessSoftware.forecast.client.models;

import java.util.Date;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class DataPoint
{
	private Long time;
	private String summary;
	private String icon;
	private Long sunriseTime;
	private Long sunsetTime;
	private Integer moonPhase;
	private Integer nearestStormDistance;
	private Integer nearestStormBearing;
	private Integer precipIntensity; // inches of liquid water per hour
	private Integer precipIntensityMax;
	private Long precipIntensityMaxTime;
	private Float precipProbability;
	private String precipType;
	private Float precipAccumulation;
	private Float temperature;
	private Float temperatureMin;
	private Long temperatureMinTime;
	private Float temperatureMax;
	private Long temperatureMaxTime;
	private Float apparentTemperature;
	private Float apparentTemperatureMin;
	private Long apparentTemperatureMinTime;
	private Float apparentTemperatureMax;
	private Long apparentTemperatureMaxTime;
	private Float dewPoint;
	private Float windSpeed;
	private Integer windBearing;
	private Float cloudCover;
	private Float humidity;
	private Float pressure;
	private Float visibility;
	private Float ozone;


	/**
	 * @return the time
	 */
	public Date getTime()
	{
		return time != null ? new Date(time.longValue() * 1000) : null;
	}


	/**
	 * @param time
	 */
	public void setTime(Long time)
	{
		this.time = time;
	}


	/**
	 * @return the summary
	 */
	public String getSummary()
	{
		return summary;
	}


	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary)
	{
		this.summary = summary;
	}


	/**
	 * @return the icon
	 */
	public String getIcon()
	{
		return icon;
	}


	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon)
	{
		this.icon = icon;
	}


	/**
	 * @return the sunriseTime
	 */
	public Date getSunriseTime()
	{
		return sunriseTime != null ? new Date(sunriseTime.longValue() * 1000) : null;
	}


	/**
	 * @param sunriseTime the sunriseTime to set
	 */
	public void setSunriseTime(Long sunriseTime)
	{
		this.sunriseTime = sunriseTime;
	}


	/**
	 * @return the sunsetTime
	 */
	public Date getSunsetTime()
	{
		return sunsetTime != null ? new Date(sunsetTime.longValue() * 1000) : null;
	}


	/**
	 * @param sunsetTime the sunsetTime to set
	 */
	public void setSunsetTime(Long sunsetTime)
	{
		this.sunsetTime = sunsetTime;
	}


	/**
	 * @return the moonPhase
	 */
	public Integer getMoonPhase()
	{
		return moonPhase;
	}


	/**
	 * @param moonPhase the moonPhase to set
	 */
	public void setMoonPhase(Integer moonPhase)
	{
		this.moonPhase = moonPhase;
	}


	/**
	 * @return the nearestStormDistance
	 */
	public Integer getNearestStormDistance()
	{
		return nearestStormDistance;
	}


	/**
	 * @param nearestStormDistance the nearestStormDistance to set
	 */
	public void setNearestStormDistance(Integer nearestStormDistance)
	{
		this.nearestStormDistance = nearestStormDistance;
	}


	/**
	 * @return the nearestStormBearing
	 */
	public Integer getNearestStormBearing()
	{
		return nearestStormBearing;
	}


	/**
	 * @param nearestStormBearing the nearestStormBearing to set
	 */
	public void setNearestStormBearing(Integer nearestStormBearing)
	{
		this.nearestStormBearing = nearestStormBearing;
	}


	/**
	 * @return the precipIntensity
	 */
	public Integer getPrecipIntensity()
	{
		return precipIntensity;
	}


	/**
	 * @param precipIntensity the precipIntensity to set
	 */
	public void setPrecipIntensity(Integer precipIntensity)
	{
		this.precipIntensity = precipIntensity;
	}


	/**
	 * @return the precipIntensityMax
	 */
	public Integer getPrecipIntensityMax()
	{
		return precipIntensityMax;
	}


	/**
	 * @param precipIntensityMax the precipIntensityMax to set
	 */
	public void setPrecipIntensityMax(Integer precipIntensityMax)
	{
		this.precipIntensityMax = precipIntensityMax;
	}


	/**
	 * @return the precipIntensityMaxTime
	 */
	public Date getPrecipIntensityMaxTime()
	{
		return precipIntensityMaxTime != null ? new Date(precipIntensityMaxTime.longValue() * 1000) : null;
	}


	/**
	 * @param precipIntensityMaxTime the precipIntensityMaxTime to set
	 */
	public void setPrecipIntensityMaxTime(Long precipIntensityMaxTime)
	{
		this.precipIntensityMaxTime = precipIntensityMaxTime;
	}


	/**
	 * @return the precipProbability
	 */
	public Float getPrecipProbability()
	{
		return precipProbability;
	}


	/**
	 * @param precipProbability the precipProbability to set
	 */
	public void setPrecipProbability(Float precipProbability)
	{
		this.precipProbability = precipProbability;
	}


	/**
	 * @return the precipType
	 */
	public String getPrecipType()
	{
		return precipType;
	}


	/**
	 * @param precipType the precipType to set
	 */
	public void setPrecipType(String precipType)
	{
		this.precipType = precipType;
	}


	/**
	 * @return the precipAccumulation
	 */
	public Float getPrecipAccumulation()
	{
		return precipAccumulation;
	}


	/**
	 * @param precipAccumulation the precipAccumulation to set
	 */
	public void setPrecipAccumulation(Float precipAccumulation)
	{
		this.precipAccumulation = precipAccumulation;
	}


	/**
	 * @return the temperature
	 */
	public Float getTemperature()
	{
		return temperature;
	}


	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Float temperature)
	{
		this.temperature = temperature;
	}


	/**
	 * @return the temperatureMin
	 */
	public Float getTemperatureMin()
	{
		return temperatureMin;
	}


	/**
	 * @param temperatureMin the temperatureMin to set
	 */
	public void setTemperatureMin(Float temperatureMin)
	{
		this.temperatureMin = temperatureMin;
	}


	/**
	 * @return the temperatureMinTime
	 */
	public Date getTemperatureMinTime()
	{
		return temperatureMinTime != null ? new Date(temperatureMinTime.longValue() * 1000) : null;
	}


	/**
	 * @param temperatureMinTime the temperatureMinTime to set
	 */
	public void setTemperatureMinTime(Long temperatureMinTime)
	{
		this.temperatureMinTime = temperatureMinTime;
	}


	/**
	 * @return the temperatureMax
	 */
	public Float getTemperatureMax()
	{
		return temperatureMax;
	}


	/**
	 * @param temperatureMax the temperatureMax to set
	 */
	public void setTemperatureMax(Float temperatureMax)
	{
		this.temperatureMax = temperatureMax;
	}


	/**
	 * @return the temperatureMaxTime
	 */
	public Date getTemperatureMaxTime()
	{
		return temperatureMaxTime != null ? new Date(temperatureMaxTime.longValue() * 1000) : null;
	}


	/**
	 * @param temperatureMaxTime the temperatureMaxTime to set
	 */
	public void setTemperatureMaxTime(Long temperatureMaxTime)
	{
		this.temperatureMaxTime = temperatureMaxTime;
	}


	/**
	 * @return the apparentTemperature
	 */
	public Float getApparentTemperature()
	{
		return apparentTemperature;
	}


	/**
	 * @param apparentTemperature the apparentTemperature to set
	 */
	public void setApparentTemperature(Float apparentTemperature)
	{
		this.apparentTemperature = apparentTemperature;
	}


	/**
	 * @return the apparentTemperatureMin
	 */
	public Float getApparentTemperatureMin()
	{
		return apparentTemperatureMin;
	}


	/**
	 * @param apparentTemperatureMin the apparentTemperatureMin to set
	 */
	public void setApparentTemperatureMin(Float apparentTemperatureMin)
	{
		this.apparentTemperatureMin = apparentTemperatureMin;
	}


	/**
	 * @return the apparentTemperatureMinTime
	 */
	public Date getApparentTemperatureMinTime()
	{
		return apparentTemperatureMinTime != null ? new Date(apparentTemperatureMinTime.longValue() * 1000) : null;
	}


	/**
	 * @param apparentTemperatureMinTime the apparentTemperatureMinTime to set
	 */
	public void setApparentTemperatureMinTime(Long apparentTemperatureMinTime)
	{
		this.apparentTemperatureMinTime = apparentTemperatureMinTime;
	}


	/**
	 * @return the apparentTemperatureMax
	 */
	public Float getApparentTemperatureMax()
	{
		return apparentTemperatureMax;
	}


	/**
	 * @param apparentTemperatureMax the apparentTemperatureMax to set
	 */
	public void setApparentTemperatureMax(Float apparentTemperatureMax)
	{
		this.apparentTemperatureMax = apparentTemperatureMax;
	}


	/**
	 * @return the apparentTemperatureMaxTime
	 */
	public Date getApparentTemperatureMaxTime()
	{
		return apparentTemperatureMaxTime != null ? new Date(apparentTemperatureMaxTime.longValue() * 1000) : null;
	}


	/**
	 * @param apparentTemperatureMaxTime the apparentTemperatureMaxTime to set
	 */
	public void setApparentTemperatureMaxTime(Long apparentTemperatureMaxTime)
	{
		this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
	}


	/**
	 * @return the dewPoint
	 */
	public Float getDewPoint()
	{
		return dewPoint;
	}


	/**
	 * @param dewPoint the dewPoint to set
	 */
	public void setDewPoint(Float dewPoint)
	{
		this.dewPoint = dewPoint;
	}


	/**
	 * @return the windSpeed
	 */
	public Float getWindSpeed()
	{
		return windSpeed;
	}


	/**
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(Float windSpeed)
	{
		this.windSpeed = windSpeed;
	}


	/**
	 * @return the windBearing
	 */
	public Integer getWindBearing()
	{
		return windBearing;
	}


	/**
	 * @param windBearing the windBearing to set
	 */
	public void setWindBearing(Integer windBearing)
	{
		this.windBearing = windBearing;
	}


	/**
	 * @return the cloudCover
	 */
	public Float getCloudCover()
	{
		return cloudCover;
	}


	/**
	 * @param cloudCover the cloudCover to set
	 */
	public void setCloudCover(Float cloudCover)
	{
		this.cloudCover = cloudCover;
	}


	/**
	 * @return the humidity
	 */
	public Float getHumidity()
	{
		return humidity;
	}


	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(Float humidity)
	{
		this.humidity = humidity;
	}


	/**
	 * @return the pressure
	 */
	public Float getPressure()
	{
		return pressure;
	}


	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(Float pressure)
	{
		this.pressure = pressure;
	}


	/**
	 * @return the visibility
	 */
	public Float getVisibility()
	{
		return visibility;
	}


	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(Float visibility)
	{
		this.visibility = visibility;
	}


	/**
	 * @return the ozone
	 */
	public Float getOzone()
	{
		return ozone;
	}


	/**
	 * @param ozone the ozone to set
	 */
	public void setOzone(Float ozone)
	{
		this.ozone = ozone;
	}
}
