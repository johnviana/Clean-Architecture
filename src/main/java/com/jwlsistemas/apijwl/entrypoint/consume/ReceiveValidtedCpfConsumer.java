package com.jwlsistemas.apijwl.entrypoint.consume;

import com.jwlsistemas.apijwl.core.usecase.UpdateCustomerUseCase;
import com.jwlsistemas.apijwl.entrypoint.consume.mapper.CustomerMessageMapper;
import com.jwlsistemas.apijwl.entrypoint.consume.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidtedCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage){

        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
