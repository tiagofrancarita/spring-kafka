package br.com.franca.kfka.application.core.usecase;

import br.com.franca.kfka.application.core.domain.Customer;
import br.com.franca.kfka.application.ports.out.FindAdressByZipCodeOutputPort;
import br.com.franca.kfka.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;


    public InsertCustomerUseCase(FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAdressByZipCodeOutputPort = findAdressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {

        var address  =  findAdressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);








    }
}