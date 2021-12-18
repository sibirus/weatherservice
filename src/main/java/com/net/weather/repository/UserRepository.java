package com.net.weather.repository;

import com.net.weather.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface UserRepository extends JpaRepository<Weather,Long>
{
    List<Weather> findByWeatherDate(java.sql.Date weatherDate);


}
