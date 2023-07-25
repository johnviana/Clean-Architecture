package com.jwlsistemas.apijwl.entrypoint.consume.mapper;

import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.entrypoint.consume.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "andress", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
