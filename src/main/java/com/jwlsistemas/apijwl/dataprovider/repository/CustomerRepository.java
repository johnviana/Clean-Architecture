package com.jwlsistemas.apijwl.dataprovider.repository;

import com.jwlsistemas.apijwl.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity, String> {
}
