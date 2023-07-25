package com.jwlsistemas.apijwl.config;

import com.jwlsistemas.apijwl.core.usecase.FindCustomerByIdUseCase;
import com.jwlsistemas.apijwl.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.jwlsistemas.apijwl.dataprovider.FindAddressByZipCodeImpl;
import com.jwlsistemas.apijwl.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustumerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAddressByZipCodeImpl findAddressByZipCode,
        UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase,
                findAddressByZipCode, updateCustomer);
    }
}
