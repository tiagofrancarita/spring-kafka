package br.com.franca.kfka.adapter.out;

import br.com.franca.kfka.adapter.out.client.FindAddressByZipCodeClient;
import br.com.franca.kfka.adapter.out.client.mapper.AddressResponseMapper;
import br.com.franca.kfka.application.core.domain.Address;
import br.com.franca.kfka.application.ports.out.FindAdressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAdressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;


    @Override
    public Address find(String zipCode) {

        var addressResponse = findAddressByZipCodeClient.find(zipCode);


        return addressResponseMapper.toAddress(addressResponse);
    }
}
