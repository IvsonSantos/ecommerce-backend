package com.luv2code.ecommerce.entity;

import java.util.Set;

public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItem;

}
