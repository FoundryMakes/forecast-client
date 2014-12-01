forecast-client
=================

### Usage ###
This should be fairly simple to use. You instantiate the client with your api key and then call one of the `fetchForecast()` methods. The structure of the returned objects is close to the API response.

    ForecastClient client = new ForecastClient(apiKey);
    Forecast forecast = client.fetchForecast(latitude, longitude);
    Float currentTemperature = forecast.getCurrently().getTemperature();

If you have any questions or issues, please contact robert at iremote dot com.

peche-poire