package br.com.franca.kfka.adapter.out.repository.mapper;

import br.com.franca.kfka.adapter.out.repository.entity.CustomerEntity;
import br.com.franca.kfka.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}