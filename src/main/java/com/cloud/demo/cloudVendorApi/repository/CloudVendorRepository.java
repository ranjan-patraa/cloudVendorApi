package com.cloud.demo.cloudVendorApi.repository;

import com.cloud.demo.cloudVendorApi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
