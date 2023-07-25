package com.jwlsistemas.apijwl.config;

import com.jwlsistemas.apijwl.core.usecase.impl.FindCustumerByIdUseCaseImpl;
import com.jwlsistemas.apijwl.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustumerByIdUseCaseImpl findCustumerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ){
        return new FindCustumerByIdUseCaseImpl(findCustomerById);
    }
}
