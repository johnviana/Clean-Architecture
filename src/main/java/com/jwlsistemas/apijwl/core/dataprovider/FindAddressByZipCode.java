package com.jwlsistemas.apijwl.core.dataprovider;

import com.jwlsistemas.apijwl.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
