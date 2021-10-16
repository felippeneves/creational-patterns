package br.com.felippeneves.abstract_factory.car_service.services;

public interface CarService extends Service {
    void save(String model);
	void update(String newModel);
}
