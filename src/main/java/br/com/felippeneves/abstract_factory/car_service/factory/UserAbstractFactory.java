package br.com.felippeneves.abstract_factory.car_service.factory;

import br.com.felippeneves.abstract_factory.car_service.services.UserEJBService;
import br.com.felippeneves.abstract_factory.car_service.services.UserRestApiService;
import br.com.felippeneves.abstract_factory.car_service.services.UserService;

public class UserAbstractFactory implements ServicesAbstractFactory {

    @Override
	public UserService getEJBService() {
		return new UserEJBService();
	}

	@Override
	public UserService getRestApiService() {
		return new UserRestApiService();
	}
}
