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
public class DataBlockDeserializer implements JsonDeserializer<DataBlock>
{
	/* (non-Javadoc)
	 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
	 */
	@Override
	public DataBlock deserialize(JsonElement json, Type type,
			JsonDeserializationContext context) throws JsonParseException
	{
		Gson gson = new GsonBuilder()
				.registerTypeAdapter(DataPoint.class, new DataPointDeserializer())
				.create();

		DataBlock dataBlock = gson.fromJson(json, type);

		return dataBlock;
	}
}