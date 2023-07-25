package com.jwlsistemas.apijwl.entrypoint.response;

import com.jwlsistemas.apijwl.dataprovider.client.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private String cpf;

    private Boolean isValid;

    private AddressResponse anddress;
}
