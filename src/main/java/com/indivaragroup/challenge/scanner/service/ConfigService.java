package com.indivaragroup.challenge.scanner.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigService {

    public static Properties loadProperties() {
        Properties properties = new Properties();

        try (
                InputStream input =
                        ConfigService.class
                                .getClassLoader()
                                .getResourceAsStream(
                                        "config.properties"
                                )
        ) {
            if (input == null) {
                System.out.println("CONFIG FILE NOT FOUND");
                return null;
            }
            properties.load(input);
            return properties;
        } catch (IOException exception) {
            System.out.println("FAILED LOAD CONFIG : " + exception.getMessage());
            return null;
        }
    }
}