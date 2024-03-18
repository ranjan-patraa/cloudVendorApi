package com.cloud.demo.cloudVendorApi.service.serviceImpl;

import com.cloud.demo.cloudVendorApi.model.CloudVendor;
import com.cloud.demo.cloudVendorApi.repository.CloudVendorRepository;
import com.cloud.demo.cloudVendorApi.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    CloudVendorRepository cloudVendorRepository ;

    @Override
    public CloudVendor createCloudVendor(CloudVendor cv) {

       CloudVendor cloudVendor = cloudVendorRepository.save(cv) ;

        return cloudVendor;
    }

    @Override
    public CloudVendor updateCloudVendor(CloudVendor cv, String id) {

        CloudVendor cloudVendor = cloudVendorRepository.findById(id)
                          .get() ;
        cloudVendor.setVendorName(cloudVendor.getVendorName()) ;
        cloudVendor.setVendorAddress(cloudVendor.getVendorAddress());
        cloudVendor.setVendorPhoneNumber(cloudVendor.getVendorPhoneNumber()) ;

        CloudVendor updateCloudVendor = cloudVendorRepository.save(cloudVendor) ;

        return updateCloudVendor ;
    }

    @Override
    public void deleteCloudVendor(String id) {

        cloudVendorRepository.deleteById(id) ;

    }

    @Override
    public CloudVendor getCloudVendorById(String Id) {

       CloudVendor cv =  cloudVendorRepository.findById(Id).get() ;
        return  cv ;
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {

        List<CloudVendor> allCloudVendor = cloudVendorRepository.findAll() ;

        return allCloudVendor ;
    }
}
