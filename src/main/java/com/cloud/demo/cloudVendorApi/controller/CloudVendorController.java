package com.cloud.demo.cloudVendorApi.controller;

import com.cloud.demo.cloudVendorApi.model.CloudVendor;
import com.cloud.demo.cloudVendorApi.service.serviceImpl.CloudVendorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

    @Autowired
    CloudVendorServiceImpl cloudVendorService ;

    @GetMapping("/")
    public ResponseEntity<List<CloudVendor>> getCloudVendorDetails() {

        List<CloudVendor> listOfCloudVendor = cloudVendorService.getAllCloudVendor() ;

        return new ResponseEntity<List<CloudVendor>>(listOfCloudVendor,HttpStatus.OK) ;

    }


    @PostMapping("/")
    public CloudVendor createCloudVendor(@RequestBody CloudVendor cloudVendor) {

       CloudVendor cloudVendor1 = cloudVendorService.createCloudVendor(cloudVendor) ;
        return cloudVendor1 ;
    }


    //update

    @PutMapping("/update/{v_id}")
    public ResponseEntity<CloudVendor> updateCloudVendor(@RequestBody CloudVendor cv , @PathVariable String v_id) {

        CloudVendor cloudVendor = cloudVendorService.updateCloudVendor(cv,v_id) ;

        return ResponseEntity.status(HttpStatus.OK).body(cloudVendor) ;
    }


    // get By Id

    @GetMapping("/{v_id}")
    public ResponseEntity<CloudVendor> getByIdCloudVendor( @PathVariable String v_id) {

        CloudVendor cloudVendor = cloudVendorService.getCloudVendorById(v_id) ;

        return ResponseEntity.status(HttpStatus.OK).body(cloudVendor) ;
    }

    @DeleteMapping("/{v_id}")
    public String deleteById(@PathVariable String v_id) {

        cloudVendorService.deleteCloudVendor(v_id) ;

        return "Delete successFully" ;

    }

    public static void add() {

    }

}
