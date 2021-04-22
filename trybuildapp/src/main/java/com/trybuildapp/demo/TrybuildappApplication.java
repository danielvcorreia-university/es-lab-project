package com.trybuildapp.demo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class TrybuildappApplication {

    private static final Logger log = (Logger) LoggerFactory.getLogger(TrybuildappApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(TrybuildappApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner demo(TemperatureRepository repository) {
        return args -> {
            //save a few temperatures
            //Date now = new Date();
            //repository.save(new Temperature("Lisboa",16,now));
            //repository.save(new Temperature("Aveiro",15,now));

            //fetch all temperatures
            log.info("Temperatures found with findAll():");
            log.info("----------------------------------");
            for(Temperature temp : repository.findAll()) {
                log.info(temp.toString());
            }
            log.info("");

            log.info("Temperatures found with findCityname(\"Lisboa\"):");
            log.info("----------------------------------");
            repository.findByCityname("Lisboa").forEach(temp -> {
                log.info(temp.toString());
            });

            log.info("");

            Date date = new Date();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            int year = localDate.getYear();

            log.info("Temperatures found with findCitynameAndPublicationDateTimeAfter(\"Lisboa\") for this month:");
            log.info("----------------------------------");
            repository.findByCitynameAndPublicationDateTimeAfter("Lisboa", new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(year+"-"+ month +"-01 00:00")).forEach(temp -> {
                log.info(temp.toString());
            });

            log.info("");

        };
    }



}
