package com.example.my_maven_project;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

        Properties properties = new Properties();

        try (InputStream input = App.class.getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                System.out.println("config.properties not found!");
                return;
            }

            properties.load(input);

            System.out.println("Application Name: "
                    + properties.getProperty("app.name"));

            System.out.println("Version: "
                    + properties.getProperty("app.version"));

            System.out.println("Environment: "
                    + properties.getProperty("app.environment"));
			System.out.println("Hi ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
