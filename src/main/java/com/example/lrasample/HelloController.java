package com.example.lrasample;

import org.eclipse.microprofile.lra.annotation.ws.rs.LRA;

import javax.inject.Singleton;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 * Restコントローラクラス.
 */
@Path("/hello")
@Singleton
@LRA
public class HelloController {
    private Client client = ClientBuilder.newClient();
    @GET
    public String sayHello() {
        String result = "";
        WebTarget target = client.target("http://localhost:8080")
                .path("/data/hoge");
        try {
            result = result + target.request().get(String.class);
        } catch(BadRequestException e) {
            e.printStackTrace();
            throw e;
        }
        target = client.target("http://localhost:8080")
                .path("/data/piyo");
        try {
            result = result + target.request().get(String.class);
        } catch(BadRequestException e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }
}
