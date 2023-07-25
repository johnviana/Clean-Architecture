package com.jwlsistemas.apijwl.entrypoint.controller;


import com.jwlsistemas.apijwl.core.usecase.DeleteCustomerByIdUseCase;
import com.jwlsistemas.apijwl.core.usecase.FindCustomerByIdUseCase;
import com.jwlsistemas.apijwl.core.usecase.InsertCustomerUseCase;
import com.jwlsistemas.apijwl.core.usecase.UpdateCustomerUseCase;
import com.jwlsistemas.apijwl.entrypoint.controller.mapper.CustomerMapper;
import com.jwlsistemas.apijwl.entrypoint.controller.request.CustomerRequest;
import com.jwlsistemas.apijwl.entrypoint.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
         insertCustomerUseCase.insert(customer, customerRequest.getZipCode());

         return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var custumer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(custumer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid
                                       @RequestBody CustomerRequest customerRequest){

    var customer = customerMapper.toCustomer(customerRequest);
    customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }



}
