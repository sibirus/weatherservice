package com.net.weather.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="weather_history")
public class Weather
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="weather_date")
    private String weatherDate;
    @Column(name="weather_value")
    private String weatherValue;


}
