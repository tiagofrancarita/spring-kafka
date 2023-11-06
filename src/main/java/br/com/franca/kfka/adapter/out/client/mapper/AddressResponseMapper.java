package br.com.franca.kfka.adapter.out.client.mapper;

import br.com.franca.kfka.adapter.out.client.response.AddressResponse;
import br.com.franca.kfka.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);





}