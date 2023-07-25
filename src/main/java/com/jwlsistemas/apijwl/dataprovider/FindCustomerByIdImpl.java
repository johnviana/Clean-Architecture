package com.jwlsistemas.apijwl.dataprovider;

import com.jwlsistemas.apijwl.core.dataprovider.FindCustumerById;
import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.dataprovider.repository.CustomerRepository;
import com.jwlsistemas.apijwl.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustumerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity =  customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
