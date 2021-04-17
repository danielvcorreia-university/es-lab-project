package com.trybuildapp.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HelloController {

    @Autowired private RestTemplate restTemplate;


    @RequestMapping("/greeting")
    public ModelAndView greeting() {
        String viewName = "greeting";

        Map<String, Object> model = new HashMap<String, Object>();

        OpenWeather weatherlist[] = {ScheduledTasks.weather1, ScheduledTasks.weather2, ScheduledTasks.weather3, ScheduledTasks.weather4};

        //ordenar em ordem crescente
        int n = weatherlist.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (weatherlist[j].getMain().getTemp() > weatherlist[j + 1].getMain().getTemp()) {
                    // swap arr[j+1] and arr[j]
                    OpenWeather temp = weatherlist[j];
                    weatherlist[j] = weatherlist[j + 1];
                    weatherlist[j + 1] = temp;
                }
            }
        }

        model.put("w1", ScheduledTasks.weather1.toString());
        model.put("w2", ScheduledTasks.weather2.toString());
        model.put("w3", ScheduledTasks.weather3.toString());
        model.put("w4", ScheduledTasks.weather4.toString());
        model.put("hottest", weatherlist[3].getName());

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

    @RequestMapping("/pt")
    public List<OpenWeather> pt() {
        List<OpenWeather> weatherlist = new ArrayList<OpenWeather>();

        weatherlist.add(ScheduledTasks.weather1);
        weatherlist.add(ScheduledTasks.weather2);
        weatherlist.add(ScheduledTasks.weather3);
        weatherlist.add(ScheduledTasks.weather4);

        return weatherlist;
    }


}
