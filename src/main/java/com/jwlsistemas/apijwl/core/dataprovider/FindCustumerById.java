package com.jwlsistemas.apijwl.core.dataprovider;

import com.jwlsistemas.apijwl.core.domain.Customer;

import java.util.Optional;

public interface FindCustumerById {

    Optional<Customer> find(final String id);
}
