package com.example.kafkademousingdbconsumer.repository;


import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

import com.example.kafkademousingdbconsumer.dto.WeatherLog;


@Transactional
public interface WeatherRepository extends CrudRepository<WeatherLog, Integer> {

}
