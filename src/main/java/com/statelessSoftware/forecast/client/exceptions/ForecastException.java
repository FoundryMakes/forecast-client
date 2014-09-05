package com.statelessSoftware.forecast.client.exceptions;

/**
 * @author Robert Nelson
 * @since 0.1.0
 */
public class ForecastException extends RuntimeException
{
	private static final long serialVersionUID = -6980428520444653146L;


	/**
	 * @param message
	 * @param cause
	 */
	public ForecastException(String message, Throwable cause)
	{
		super(message, cause);
	}


	/**
	 * @param message
	 */
	public ForecastException(String message)
	{
		super(message);
	}


	/**
	 * @param cause
	 */
	public ForecastException(Throwable cause)
	{
		super(cause);
	}
}
