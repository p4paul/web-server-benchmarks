package com.perforce.benchmark;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fib")
public class QuarkusBenchmark {

    @GET
    @Path("/{fib}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam String fib) {
        int number = Integer.parseInt(fib);
        return "________Quarkus: fib(" + number + ") = " + fib(number);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}