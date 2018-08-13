package com.hand.api.service;

import com.hand.domain.entity.Address;

public interface AddressService {

    Address findByAddress(String address);
}
