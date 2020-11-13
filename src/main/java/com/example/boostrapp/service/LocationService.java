package com.example.boostrapp.service;

import com.example.boostrapp.entity.Location;
import com.example.boostrapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> retrieveLocation(){
        return (List<Location>)locationRepository.findAll();
    }
}
