package br.com.franca.kfka.adapter.in.controller.mapper;

import br.com.franca.kfka.adapter.in.controller.request.CustomerRequest;
import br.com.franca.kfka.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

}
