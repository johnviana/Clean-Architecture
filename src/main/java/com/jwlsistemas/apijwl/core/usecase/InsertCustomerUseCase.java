package com.jwlsistemas.apijwl.core.usecase;

import com.jwlsistemas.apijwl.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);

}
