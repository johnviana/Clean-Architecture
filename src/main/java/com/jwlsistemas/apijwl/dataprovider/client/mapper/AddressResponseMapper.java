package com.jwlsistemas.apijwl.dataprovider.client.mapper;

import com.jwlsistemas.apijwl.core.domain.Address;
import com.jwlsistemas.apijwl.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
