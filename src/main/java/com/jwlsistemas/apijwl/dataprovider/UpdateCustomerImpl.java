package com.jwlsistemas.apijwl.dataprovider;

import com.jwlsistemas.apijwl.core.dataprovider.UpdateCustomer;
import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.dataprovider.repository.CustomerRepository;
import com.jwlsistemas.apijwl.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity) ;

    }
}
