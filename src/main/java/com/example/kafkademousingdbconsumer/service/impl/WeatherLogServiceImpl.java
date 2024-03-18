package com.example.kafkademousingdbconsumer.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kafkademousingdbconsumer.dto.WeatherLog;
import com.example.kafkademousingdbconsumer.repository.WeatherRepository;
import com.example.kafkademousingdbconsumer.service.api.WeatherLogService;

@Service
public class WeatherLogServiceImpl implements WeatherLogService {
    private final WeatherRepository repository;

    @Autowired
    WeatherLogServiceImpl(final WeatherRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveLogs(WeatherLog log) throws InterruptedException {
       // this.logQue.put(log);
        this.repository.save(log);
    }

}