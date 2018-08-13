package com.hand.api.service;

import com.hand.domain.entity.Customer;

public interface CustomerService {
    Customer findByName(String firstName,String password);

    Short insert(Customer customer);

    int update(Customer customer);

    int delete(Customer customer);

    int findLastId();
}
