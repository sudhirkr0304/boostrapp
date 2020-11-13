package com.example.boostrapp.web;


import com.example.boostrapp.entity.Location;
import com.example.boostrapp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {
    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public ResponseEntity<List <Location > > getLocation(){

        List <Location > list = locationService.retrieveLocation();
        return new ResponseEntity< List<Location>>(list, HttpStatus.OK);

    }

}
