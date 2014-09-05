package com.statelessSoftware.forecast.client.models;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class DataPointDeserializer implements JsonDeserializer<DataPoint>
{
	/**
	 * Example...
	 * {  
	 *   "time":1409930229,
	 *   "summary":"Overcast",
	 *   "icon":"cloudy",
	 *   "nearestStormDistance":22,
	 *   "nearestStormBearing":199,
	 *   "precipIntensity":0,
	 *   "precipProbability":0,
	 *   "temperature":58.28,
	 *   "apparentTemperature":58.28,
	 *   "dewPoint":49.02,
	 *   "humidity":0.71,
	 *   "windSpeed":8.08,
	 *   "windBearing":323,
	 *   "visibility":9.81,
	 *   "cloudCover":0.98,
	 *   "pressure":1018.4,
	 *   "ozone":286.73
	 * 	}
	 */


	/* (non-Javadoc)
	 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
	 */
	@Override
	public DataPoint deserialize(JsonElement json, Type type,
			JsonDeserializationContext context) throws JsonParseException
	{
		Gson gson = new GsonBuilder().create();
		DataPoint dataPoint = gson.fromJson(json, type);

		return dataPoint;
	}
}
