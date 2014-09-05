package com.statelessSoftware.forecast.client.models;

import java.util.List;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class DataBlock
{
	private String summary;

	private String icon;

	private List<DataPoint> data;


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
	 * @return the data
	 */
	public List<DataPoint> getData()
	{
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(List<DataPoint> data)
	{
		this.data = data;
	}
}
