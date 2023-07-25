package com.jwlsistemas.apijwl.core.usecase;

import com.jwlsistemas.apijwl.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
