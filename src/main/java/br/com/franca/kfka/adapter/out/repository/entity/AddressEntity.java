package br.com.franca.kfka.adapter.out.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class AddressEntity {

    private String street;

    private String city;

    private String state;

}
