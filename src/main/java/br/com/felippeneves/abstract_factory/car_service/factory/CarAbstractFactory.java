package br.com.felippeneves.abstract_factory.car_service.factory;

import br.com.felippeneves.abstract_factory.car_service.services.CarEJBService;
import br.com.felippeneves.abstract_factory.car_service.services.CarRestApiService;
import br.com.felippeneves.abstract_factory.car_service.services.CarService;

public class CarAbstractFactory implements ServicesAbstractFactory {

    @Override
    public CarService getEJBService() {
        return new CarEJBService();
    }

    @Override
    public CarService getRestApiService() {
        return new CarRestApiService();
    }
}
