package br.com.franca.kfka.adapter.out.repository;

import br.com.franca.kfka.adapter.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRespository extends MongoRepository<CustomerEntity, String> {


}