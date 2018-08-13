package com.hand.api.service.impl;

import com.hand.api.service.AddressService;
import com.hand.domain.entity.Address;
import com.hand.infra.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address findByAddress(String address) {
        Address record = new Address();
        record.setAddress(address);
        return addressMapper.selectOne(record);
    }
}
