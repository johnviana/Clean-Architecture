package com.jwlsistemas.apijwl.dataprovider.client.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Andress")
public class AddressResponse {

    private String street;

    private String city;

    private String state;
}

