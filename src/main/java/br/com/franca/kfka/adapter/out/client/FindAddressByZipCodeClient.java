package br.com.franca.kfka.adapter.out.client;

import br.com.franca.kfka.adapter.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "findAddressByZipCodeClient"
       ,url = "${arantes.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping(value = "/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);








}