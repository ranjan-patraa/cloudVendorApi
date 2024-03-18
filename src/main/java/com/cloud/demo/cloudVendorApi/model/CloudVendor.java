package com.cloud.demo.cloudVendorApi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cloud_vendor_Table")
public class CloudVendor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String vendorId ;

    private String vendorName ;

    private String vendorAddress ;

    private String vendorPhoneNumber ;
}
