package br.com.felippeneves.factory.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.felippeneves.factory.database.factory.DatabaseSimpleFactory;
import br.com.felippeneves.factory.database.model.Database;

public class Client {

    public static void main(String[] args) {
		List<String> list;
		//
		System.out.println("### Oracle Database ###\n");
		Database dbOracle = DatabaseSimpleFactory.getDatabase(DatabaseSimpleFactory.DB_ORACLE);
        list = dbOracle.query("SELECT * FROM users");
		printRegisterSelected(list);
        dbOracle.insert(new ArrayList<>(Arrays.asList("register 1", "register 2", "register 3")));
		dbOracle.update("UPDATE users set name = 'Felippe' where id = 1");
		dbOracle.update("DELETE FROM users where id = 2");
		System.out.println("\n### Oracle Database ###\n\n\n");
        //
        System.out.println("### SQL Server Database ###\n");
		Database dbSQLServer = DatabaseSimpleFactory.getDatabase(DatabaseSimpleFactory.DB_SQLSERVER);
		list = dbSQLServer.query("SELECT * FROM users");
		printRegisterSelected(list);
        dbSQLServer.insert(new ArrayList<>(Arrays.asList("register 1", "register 2", "register 3")));
		dbSQLServer.update("UPDATE users set name = 'Felippe' where id = 1");
		dbSQLServer.update("DELETE FROM users where id = 2");
		System.out.println("\n### SQL Server Database ###\n\n\n");
        //
        System.out.println("### MySQL Database ###\n");
		Database dbMySQL = DatabaseSimpleFactory.getDatabase(DatabaseSimpleFactory.DB_MYSQL);
		list = dbMySQL.query("SELECT * FROM users");
		printRegisterSelected(list);
        dbMySQL.insert(new ArrayList<>(Arrays.asList("register 1", "register 2", "register 3")));
		dbMySQL.update("UPDATE users set name = 'Felippe' where id = 1");
		dbMySQL.update("DELETE FROM users where id = 2");
		System.out.println("\n### MySQL Database ###\n\n\n");
        //
        System.out.println("### PostGre Database ###\n");
		Database dbPostGre = DatabaseSimpleFactory.getDatabase(DatabaseSimpleFactory.DB_POSTGRE);
		list = dbPostGre.query("SELECT * FROM users");
		printRegisterSelected(list);
        dbPostGre.insert(new ArrayList<>(Arrays.asList("register 1", "register 2", "register 3")));
		dbPostGre.update("UPDATE users set name = 'Felippe' where id = 1");
		dbPostGre.update("DELETE FROM users where id = 2");
		System.out.println("\n### Oracle Database ###");
	}

	private static void printRegisterSelected(List<String> list) {
		if(list != null && !list.isEmpty()) {
			for(String s : list) {
				System.out.println(s);
			}
		}
	}
}
