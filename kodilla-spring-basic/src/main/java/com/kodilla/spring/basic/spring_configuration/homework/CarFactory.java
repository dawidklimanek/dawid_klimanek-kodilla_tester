package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@Configuration
    public class CarFactory {



        @Bean
        public Car returnCar() {
            Map<Season, Car> seasonCarMap = new HashMap<>();
            seasonCarMap.put(Season.SUMMER, new Cabrio());
            seasonCarMap.put(Season.WINTER, new Suv());
            seasonCarMap.put(Season.SPRING, new Sedan());
            seasonCarMap.put(Season.AUTUMN, new Sedan());
            return seasonCarMap.get(randomSeason());
        }

        private Season randomSeason() {
            Random random = new Random();
            int number = random.nextInt(4);
            return Season.values()[number];
        }


    }

