package br.com.felippeneves.factory.database.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OracleDB implements Database {

    private int minRandom = 1;
    private int maxRandom = 50;

    @Override
    public List<String> query(String sql) {

        System.out.println("Querying " + sql + " in Oracle database");

        int randomNumber = new Random().nextInt((maxRandom - minRandom) + 1) + minRandom;

        List<String> listQuery = new ArrayList<>();

        for (int i = 1; i <= randomNumber; i++) {
            listQuery.add("Registro " + i);
        }

        return listQuery;
    }

    @Override
    public int insert(List<Object> list) {
        System.out.println("Insert " + list.size() + " register in Oracle database");

        int rowsInserted = new Random().nextInt((maxRandom - minRandom) + 1) + minRandom;

        return rowsInserted;
    }

    @Override
    public int update(String sql) {
        System.out.println("Uptade querry " + sql + " in Oracle database");

        int rowsAffected = new Random().nextInt((maxRandom - minRandom) + 1) + minRandom;

        return rowsAffected;
    }

    @Override
    public int delete(String sql) {
        System.out.println("Delete querry " + sql + " in Oracle database");

        int rowsAffected = new Random().nextInt((maxRandom - minRandom) + 1) + minRandom;

        return rowsAffected;
    }
}
