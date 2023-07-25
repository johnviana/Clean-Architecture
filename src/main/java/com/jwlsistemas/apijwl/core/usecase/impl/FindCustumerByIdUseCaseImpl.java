package com.jwlsistemas.apijwl.core.usecase.impl;

import com.jwlsistemas.apijwl.core.dataprovider.FindCustumerById;
import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.core.usecase.FindCustomerByIdUseCase;

public class FindCustumerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustumerById findCustumerById;

     public FindCustumerByIdUseCaseImpl(FindCustumerById findCustumerById){
         this.findCustumerById = findCustumerById;
     }


    @Override
    public Customer find(String id) {
        return findCustumerById.find(id)
                .orElseThrow(() -> new RuntimeException("Custumer not found"));
    }
}
