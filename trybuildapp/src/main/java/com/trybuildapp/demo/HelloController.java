package com.trybuildapp.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {

    @Autowired private RestTemplate restTemplate;


    @RequestMapping("/greeting")
    public ModelAndView greeting() {
        String viewName = "greeting";

        Map<String, Object> model = new HashMap<String, Object>();

        OpenWeather weather1 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Aveiro,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        OpenWeather weather2 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Lisboa,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        OpenWeather weather3 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Porto,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        OpenWeather weather4 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Faro,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);

        model.put("w1", weather1.toString());
        model.put("w2", weather2.toString());
        model.put("w3", weather3.toString());
        model.put("w4", weather4.toString());

        return new ModelAndView(viewName , model);
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/bananas")
    public String bananas() {
        return "Greetings from Banana!";
    }

    @RequestMapping("/weather")
    public String weather() {

        OpenWeather weather1 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Aveiro,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        OpenWeather weather2 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Lisboa,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        OpenWeather weather3 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Porto,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);
        OpenWeather weather4 = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Faro,pt&units=metric&lang=pt&appid=e16b5d4bba106c51f2add1363a22d257", OpenWeather.class);

        String returnthis = weather1.toString() + "\n" + weather2.toString() + "\n" + weather3.toString() + "\n" + weather4.toString() + "\n";

        return returnthis;
    }


}
