package br.com.felippeneves.abstract_factory.car_service.factory;

import br.com.felippeneves.abstract_factory.car_service.services.Service;

public interface ServicesAbstractFactory {
    
	Service getEJBService();
	
	Service getRestApiService();
}
