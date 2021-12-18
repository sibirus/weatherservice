package com.net.weather.model;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Fact
{
    private String temp;
    private String feels_like;

}
