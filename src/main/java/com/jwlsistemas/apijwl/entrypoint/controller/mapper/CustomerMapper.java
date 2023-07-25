package com.jwlsistemas.apijwl.entrypoint.controller.mapper;

import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.entrypoint.controller.request.CustomerRequest;
import com.jwlsistemas.apijwl.entrypoint.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
