package com.jwlsistemas.apijwl.dataprovider;

import com.jwlsistemas.apijwl.core.dataprovider.InsertCustomer;
import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.dataprovider.repository.CustomerRepository;
import com.jwlsistemas.apijwl.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
