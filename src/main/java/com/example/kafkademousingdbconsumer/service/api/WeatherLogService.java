package com.example.kafkademousingdbconsumer.service.api;

import com.example.kafkademousingdbconsumer.dto.WeatherLog;

public interface WeatherLogService {
    void saveLogs(WeatherLog log) throws InterruptedException;
}