package com.jwlsistemas.apijwl.dataprovider.repository.mapper;

import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
