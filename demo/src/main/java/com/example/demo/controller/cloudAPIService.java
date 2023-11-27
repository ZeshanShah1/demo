package com.example.demo.controller;

import com.example.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudVendor")
public class cloudAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return new CloudVendor("C1", "Bibi", "Utah","555-555-5555");
    }
}
