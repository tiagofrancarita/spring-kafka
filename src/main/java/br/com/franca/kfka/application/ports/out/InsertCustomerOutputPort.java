package br.com.franca.kfka.application.ports.out;

import br.com.franca.kfka.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
