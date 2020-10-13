package com.example.lrasample;

import io.narayana.lra.filter.FilterRegistration;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * アプリケーション基底クラス.
 */
@ApplicationPath("/data")
@ApplicationScoped
public class LrasampleRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        classes.add(HogeController.class);
        classes.add(PiyoController.class);
        //classes.add(FilterRegistration.class);

        return classes;
    }
}
