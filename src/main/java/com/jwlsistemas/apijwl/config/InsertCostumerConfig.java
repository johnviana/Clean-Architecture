package com.jwlsistemas.apijwl.config;

import com.jwlsistemas.apijwl.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.jwlsistemas.apijwl.dataprovider.FindAddressByZipCodeImpl;
import com.jwlsistemas.apijwl.dataprovider.InsertCustomerImpl;
import com.jwlsistemas.apijwl.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCostumerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ){
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);

    }

}
