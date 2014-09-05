package com.statelessSoftware.forecast.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class Utilities
{
	public static String getQueryString(Map<String, String> params)
	{
		StringBuilder sb = new StringBuilder();

		try
		{
			for (String key : params.keySet())
			{
				if (sb.length() > 0)
				{
					sb.append("&");
				}

				sb.append(URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(params.get(key), "UTF-8"));
			}
		}
		catch (UnsupportedEncodingException e)
		{
			// I can't imagine this possibly happening.
			System.out.println("getQueryString - UnsupportedEncodingException caught.");
		}

		return sb.toString();
	}
}
