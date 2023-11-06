package br.com.franca.kfka.application.ports.out;

import br.com.franca.kfka.application.core.domain.Address;

public interface FindAdressByZipCodeOutputPort {

    Address find (String zipCode);

}
