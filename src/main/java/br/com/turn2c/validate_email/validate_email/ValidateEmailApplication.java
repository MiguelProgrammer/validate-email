package br.com.turn2c.validate_email.validate_email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.System.err;

@SpringBootApplication
public class ValidateEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidateEmailApplication.class, args);

        try {
            String email = "teste@teste.com";
            String apiKey = "1f88acb0-1e5b-48da-b365-172226dac841";
            String urlString = "https://api.mails.so/v1/validate?email=" + email;

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("x-mails-api-key", apiKey);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
