package com.jwlsistemas.apijwl.config;

import com.jwlsistemas.apijwl.core.usecase.impl.DeleteCustomerByIdCaseUseImpl;
import com.jwlsistemas.apijwl.core.usecase.impl.FindCustumerByIdUseCaseImpl;
import com.jwlsistemas.apijwl.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdCaseUseImpl deleteCustomerByIdCaseUse(
            FindCustumerByIdUseCaseImpl findCustumerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById) {
        return  new DeleteCustomerByIdCaseUseImpl(findCustumerByIdUseCase, deleteCustomerById);
    }
}
