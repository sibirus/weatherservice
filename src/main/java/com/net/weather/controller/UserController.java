package com.net.weather.controller;

import com.net.weather.model.Weather;
import com.net.weather.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @ResponseBody
    @GetMapping("/check")
    public String check(@RequestParam String date) throws Exception {


        List<Weather> weatherList = userService.findByWeatherDate(date);

        if (weatherList.isEmpty()) {
            return "incorrect: no weather found for date " ;
        }
        return weatherList
                .stream() // Stream<Weather>
                .map(Weather::getWeatherValue) // Stream<String>  поток weather_value
                .collect(Collectors.joining(";")); // объединить в строку с делимитером "; "
    }


}
