package com.jwlsistemas.apijwl.core.usecase.impl;

import com.jwlsistemas.apijwl.core.dataprovider.DeleteCustumerById;
import com.jwlsistemas.apijwl.core.usecase.DeleteCustomerByIdUseCase;

public class DeleteCustomerByIdCaseUseImpl implements DeleteCustomerByIdUseCase {

    private FindCustumerByIdUseCaseImpl findCustumerByIdUseCase;

    private final DeleteCustumerById deleteCustumerById;

    public DeleteCustomerByIdCaseUseImpl(FindCustumerByIdUseCaseImpl findCustumerByIdUseCase,
    DeleteCustumerById deleteCustumerById){
        this.findCustumerByIdUseCase = findCustumerByIdUseCase;
        this.deleteCustumerById = deleteCustumerById;
    }

    @Override
    public void delete(String id) {
        findCustumerByIdUseCase.find(id);
        deleteCustumerById.delete(id);

    }
}
