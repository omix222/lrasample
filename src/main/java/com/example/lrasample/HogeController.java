package com.example.lrasample;

import org.eclipse.microprofile.lra.annotation.ws.rs.LRA;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Restコントローラクラス.
 */
@Path("/hoge")
@Singleton
@LRA
public class HogeController {

    @GET
    public String sayHello() {
        return "Hoge hoge";
    }
}
