package Endpoints;

import io.restassured.RestAssured;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class userEndpointsExternalFile

{
    public static void postUsingExternalJsonFile() throws FileNotFoundException {
        File f = new File(".//body.json");
        FileReader fw = new FileReader(f);
        JSONTokener js = new JSONTokener(fw);
        JSONObject jo = new JSONObject(js);

    RestAssured.given()
            .body(jo.toString() )
            .contentType("application/json")
            .when().post(Roots.post_url)
            .then().statusCode(201)
            .log().all();
}


    }
