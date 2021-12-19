package com.net.weather.service;

import com.net.weather.model.Weather;
import com.net.weather.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class UserService
{

    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    public Weather findById(Long Id)
    {
        return userRepository.getOne(Id);

    }
    public List<Weather> findAll()
    {
        return userRepository.findAll();

    }
    public Weather saveWeatherDate(Weather date)
    {
        return userRepository.save(date);

    }
    public Weather saveWeatherValue(Weather value)
    {
        return userRepository.save(value);

    }

    public void deleteById(Long Id)
    {
        userRepository.deleteById(Id);

    }
    public List<Weather> findByWeatherDate(String weatherDate)
    {
        return userRepository.findByWeatherDate(weatherDate);

    }
}
