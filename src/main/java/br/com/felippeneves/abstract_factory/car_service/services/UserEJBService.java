package br.com.felippeneves.abstract_factory.car_service.services;

public class UserEJBService implements UserService {

    @Override
    public void save(String name) {
        System.out.println("Saving " + name + " through EJB's interface");
    }

    @Override
    public boolean delete(Integer id) {
		System.out.println("Removing User #" + id + " through EJB's interface");
		return true;
    }
}
