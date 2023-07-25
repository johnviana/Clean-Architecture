package com.jwlsistemas.apijwl.dataprovider;

import com.jwlsistemas.apijwl.core.dataprovider.FindAddressByZipCode;
import com.jwlsistemas.apijwl.core.domain.Address;
import com.jwlsistemas.apijwl.dataprovider.client.FindAddressByZipCodeClient;
import com.jwlsistemas.apijwl.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var AddressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(AddressResponse);
    }
}
