package com.indivaragroup.challenge.scanner.util;

import com.indivaragroup.challenge.scanner.ScannerChallenge;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {

    public static Properties loadProperties() {

        Properties properties =
                new Properties();

        try (InputStream input =
                     ScannerChallenge.class
                             .getClassLoader()
                             .getResourceAsStream(
                                     "config.properties"
                             )) {

            if (input == null) {

                System.out.println(
                        "CONFIG FILE NOT FOUND"
                );

                return null;
            }

            properties.load(input);

            return properties;

        } catch (IOException exception) {

            System.out.println(
                    "FAILED LOAD CONFIG : "
                            + exception.getMessage()
            );
            return null;
        }
    }
}