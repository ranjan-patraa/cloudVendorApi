package com.cloud.demo.cloudVendorApi.service;

import com.cloud.demo.cloudVendorApi.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    //create
    public CloudVendor createCloudVendor(CloudVendor cv) ;

    //update
    public CloudVendor updateCloudVendor(CloudVendor cv ,String id) ;


    // delete
    public void deleteCloudVendor(String id) ;

    //get
    public CloudVendor getCloudVendorById(String Id) ;

    //getAll

    public List<CloudVendor> getAllCloudVendor() ;



}
