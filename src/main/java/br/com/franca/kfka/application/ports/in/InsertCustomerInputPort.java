package br.com.franca.kfka.application.ports.in;

import br.com.franca.kfka.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
