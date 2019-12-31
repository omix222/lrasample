package com.example.lrasample;

import org.eclipse.microprofile.lra.annotation.ws.rs.LRA;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Restコントローラクラス.
 */
@Path("/piyo")
@Singleton
@LRA
public class PiyoController {

    @GET
    public String sayHello() {
        return "Piyo Piyo";
    }
}
