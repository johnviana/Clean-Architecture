package com.jwlsistemas.apijwl.dataprovider;

import com.jwlsistemas.apijwl.core.dataprovider.DeleteCustumerById;
import com.jwlsistemas.apijwl.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustumerById {

    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
