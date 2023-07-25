package com.jwlsistemas.apijwl.core.usecase;

import com.jwlsistemas.apijwl.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
