package br.com.felippeneves.abstract_factory;

import br.com.felippeneves.abstract_factory.car_service.factory.CarAbstractFactory;
import br.com.felippeneves.abstract_factory.car_service.factory.UserAbstractFactory;
import br.com.felippeneves.abstract_factory.car_service.services.CarService;
import br.com.felippeneves.abstract_factory.car_service.services.UserService;

public class Client {
    
	public static void main(String[] args) {

            UserAbstractFactory userFactory = new UserAbstractFactory();

		    System.out.println("### User using service EJB ###\n");
            UserService userServiceEJB = userFactory.getEJBService();
            userServiceEJB.save("Teste");
		    userServiceEJB.delete(1);
            System.out.println("\n### User using service EJB ###\n\n\n");
            //
            System.out.println("### User using service Rest API ###\n");
            UserService userServiceRestApi = userFactory.getRestApiService();
            userServiceRestApi.save("Teste 2");
		    userServiceRestApi.delete(2);
            System.out.println("\n### User using service Rest API ###\n\n\n");
            //
            CarAbstractFactory carFactory = new CarAbstractFactory();
            
            System.out.println("### Car using service EJB ###\n");
            CarService carServiceEJB = carFactory.getEJBService();
            carServiceEJB.save("Prius");
            carServiceEJB.update("Tesla X");
            System.out.println("\n### Car using service EJB ###\n\n\n");
            //
            System.out.println("### Car using service Rest API ###\n");
            CarService carServiceRestApi = carFactory.getRestApiService();
            carServiceRestApi.save("Prisma");
            carServiceRestApi.update("Cobalt");
            System.out.println("\n### Car using service Rest API ###\n\n\n");
    }
}
