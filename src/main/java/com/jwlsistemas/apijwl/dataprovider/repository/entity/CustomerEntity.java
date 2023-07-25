package com.jwlsistemas.apijwl.dataprovider.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "customers")
public class CustomerEntity {

    @EqualsAndHashCode.Include
    @Id
    private String id;

    private String name;

    private AddressEntity addressEntity;

    private String cpf;

    private Boolean isValidCpf;


}
