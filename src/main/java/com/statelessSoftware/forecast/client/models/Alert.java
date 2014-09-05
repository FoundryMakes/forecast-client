package com.statelessSoftware.forecast.client.models;

import java.net.URI;
import java.util.Date;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class Alert
{
	private String title;

	private Long expires;

	private String description;

	private URI uri;


	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}


	/**
	 * @return the expires
	 */
	public Date getExpires()
	{
		return expires != null ? new Date(expires.longValue() * 1000) : null;
	}


	/**
	 * @param expires the expires to set
	 */
	public void setExpires(Long expires)
	{
		this.expires = expires;
	}


	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}


	/**
	 * @return the uri
	 */
	public URI getUri()
	{
		return uri;
	}


	/**
	 * @param uri the uri to set
	 */
	public void setUri(URI uri)
	{
		this.uri = uri;
	}
}
