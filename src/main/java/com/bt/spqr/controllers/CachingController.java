package com.bt.spqr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.spqr.services.CachingService;

import io.swagger.annotations.ApiOperation;

@RestController
public class CachingController {
     
    @Autowired    
    CachingService cachingService;
    
    @ApiOperation(value = "Clear all the caches in Redis server",  notes = "This method will clear all the caches in Redis server.")
    @GetMapping("clearAllCaches")
    public void clearAllCaches() {
        cachingService.evictAllCaches();
    }
}
