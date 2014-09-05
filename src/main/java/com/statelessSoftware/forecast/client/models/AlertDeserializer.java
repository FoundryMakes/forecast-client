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
public class AlertDeserializer implements JsonDeserializer<Alert>
{
	/* (non-Javadoc)
	 * @see com.google.gson.JsonDeserializer#deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext)
	 */
	@Override
	public Alert deserialize(JsonElement json, Type type,
			JsonDeserializationContext context) throws JsonParseException
	{
		Gson gson = new GsonBuilder().create();

		Alert alert = gson.fromJson(json, type);

		return alert;
	}
}