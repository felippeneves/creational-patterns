package br.com.felippeneves.abstract_factory.car_service.services;

public interface UserService extends Service {
	void save(String name);
	boolean delete(Integer id);
}
