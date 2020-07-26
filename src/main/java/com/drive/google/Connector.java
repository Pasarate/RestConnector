package com.drive.google;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.io.IOException;
import static io.restassured.RestAssured.*;


public class Connector {

    public static void main(String args[]) throws IOException {

// Code to automate rest API

        baseURI = "https://data.sfgov.org";
        basePath = "/resource/p4e4-a5a7.json";

        Response resp = RestAssured.given().when().get();

        if (resp.statusCode() == 200) {

            resp.body().prettyPrint();

        } else
            System.out.println("Error accessing API");


        ObjectMapper obj = new ObjectMapper();

        RESTCONNECTORPOJO pojo = obj.readValue((JsonParser) resp.body(),RESTCONNECTORPOJO.class);

        System.out.println(pojo.toString());


    }
}
