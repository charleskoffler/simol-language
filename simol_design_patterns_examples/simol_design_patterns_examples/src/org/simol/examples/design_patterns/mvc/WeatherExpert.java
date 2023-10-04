package org.simol.examples.design_patterns.mvc;

//Controller: we could imagine a real weather expert, which would be simulated by the controller.
//public simu_rewo WeatherExpert
public class WeatherExpert {
    private WeatherModel model;
    private WeatherRealiz view;

    public WeatherExpert() {
    	model = new WeatherModel();
        view = new WeatherRealiz(this);
    }

    public void giveTheWeather(){
	String location = view.getLocationInput();
        model.setLocation(location);
        model.fetchWeather();
        String forecast = model.getForecast();
        view.displayForecast(forecast);
    }
}