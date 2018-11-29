package polacz;



import java.io.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.util.logging.Logger;



public class Polacz {


    String serverName;
    String connectionProps;
    String dbms;
    String password;
    String portNumber;
    String userName;
    private Connection conn = null;

    private static Logger Log = Logger.getLogger(Polacz.class.getName());
    private void wczytajPolaczenie(){

        try {


            InputStream fileInput = null;
            fileInput = new FileInputStream("bazadanych.xml");
            Properties properties = new Properties();


            properties.loadFromXML(fileInput);


                serverName= properties.getProperty("serverName");
                connectionProps=properties.getProperty("connectionProps");
                dbms=properties.getProperty("dbms");
                password=properties.getProperty("password");
                portNumber=properties.getProperty("portNumber");
                userName=properties.getProperty("userName");




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public Connection getConnection() throws SQLException {

        wczytajPolaczenie();

        conn = DriverManager.getConnection("jdbc:" + dbms + "://" +serverName + ":" + portNumber + "/" + connectionProps+"?autoReconnect=true&useSSL=false", userName, password);



        Log.info( "Nawiązanie połączenia");



        return conn;
    }
}
