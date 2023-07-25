package com.jwlsistemas.apijwl.core.usecase.impl;

import com.jwlsistemas.apijwl.core.dataprovider.FindAddressByZipCode;
import com.jwlsistemas.apijwl.core.dataprovider.InsertCustomer;
import com.jwlsistemas.apijwl.core.dataprovider.SendCpfForValidation;
import com.jwlsistemas.apijwl.core.domain.Customer;
import com.jwlsistemas.apijwl.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {


    private final FindAddressByZipCode findAddressByZipCode;

    private InsertCustomer insertCustomer;

    private SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(
            FindAddressByZipCode  findAddressByZipCode,
            InsertCustomer insertCustomer,
            SendCpfForValidation sendCpfForValidation
    ) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address  = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());

    }
}
