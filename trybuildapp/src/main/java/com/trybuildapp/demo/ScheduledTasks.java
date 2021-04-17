package com.trybuildapp.demo;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private RestTemplate restTemplate;

    protected static OpenWeather weather1;
    protected static OpenWeather weather2;
    protected static OpenWeather weather3;
    protected static OpenWeather weather4;

    @Scheduled(fixedRate = 15000)
    public void updateWeather() {

        weather1 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Aveiro,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        weather2 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Lisboa,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        weather3 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Porto,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        weather4 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Faro,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);

        log.info("Date of update: {}", dateFormat.format(new Date()));
        log.info(weather1.toString() + " Na cidade: " + weather1.getName());
        log.info(weather2.toString() + " Na cidade: " + weather2.getName());
        log.info(weather3.toString() + " Na cidade: " + weather3.getName());
        log.info(weather4.toString() + " Na cidade: " + weather4.getName());


    }


}
