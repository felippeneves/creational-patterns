package br.com.felippeneves.factory.database.factory;

import br.com.felippeneves.factory.database.model.Database;
import br.com.felippeneves.factory.database.model.MySQLDB;
import br.com.felippeneves.factory.database.model.OracleDB;
import br.com.felippeneves.factory.database.model.PostgreDB;
import br.com.felippeneves.factory.database.model.SQLServerDB;

public class DatabaseSimpleFactory {

    public static final String DB_ORACLE = "DB_ORACLE";
    public static final String DB_SQLSERVER = "DB_SQLSERVER";
    public static final String DB_MYSQL = "DB_MYSQL";
    public static final String DB_POSTGRE = "DB_POSTGRE";


    public static Database getDatabase(String db) {
        
        if(DB_ORACLE.equalsIgnoreCase(db)) {
            return new OracleDB();
        } else if(DB_SQLSERVER.equalsIgnoreCase(db)) {
            return new SQLServerDB();
        } else if(DB_MYSQL.equalsIgnoreCase(db)) {
            return new MySQLDB();
        } else if(DB_POSTGRE.equalsIgnoreCase(db)) {
            return new PostgreDB();
        }

        return null;
    }
}
