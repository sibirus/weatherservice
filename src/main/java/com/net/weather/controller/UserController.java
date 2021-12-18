package com.net.weather.controller;

import com.net.weather.model.Weather;
import com.net.weather.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/check")
    public String check(@RequestParam String date) throws Exception
    {


        List<Weather> users=userService.findByWeatherDate(java.sql.Date.valueOf(date));

        if (users.contains(date))
            return "correct";
        else return "incorrect";
    }


}
