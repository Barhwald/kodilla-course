package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double countAvgTemperature() {

        double sum = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            sum = sum + temperature.getValue();

        }

        return sum/temperatures.getTemperatures().size();

    }

    public double getMedian() {

        double median = 0;
        List<Double> tempsList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            tempsList.add(temperature.getValue());

        }

        Collections.sort(tempsList);

        if (tempsList.size() % 2 == 1) {
            median = tempsList.get(tempsList.size() / 2);
        } else {
            median = (tempsList.get(tempsList.size() / 2 - 1) +
                    tempsList.get(tempsList.size() / 2)) / 2;
        }

        return median;

    }


}