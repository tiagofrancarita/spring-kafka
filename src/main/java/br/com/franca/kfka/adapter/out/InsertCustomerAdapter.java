package br.com.franca.kfka.adapter.out;


import br.com.franca.kfka.adapter.out.repository.CustomerRespository;
import br.com.franca.kfka.adapter.out.repository.mapper.CustomerEntityMapper;
import br.com.franca.kfka.application.core.domain.Customer;
import br.com.franca.kfka.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private CustomerEntityMapper customerMapper;

    @Override
    public void insert(Customer customer) {

        var customerEntity = customerMapper.toCustomerEntity(customer);

        customerRespository.save(customerEntity);

    }
}