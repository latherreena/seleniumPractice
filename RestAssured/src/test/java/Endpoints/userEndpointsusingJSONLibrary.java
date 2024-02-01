package Endpoints;

import io.restassured.RestAssured;
import org.json.JSONObject;

public class userEndpointsusingJSONLibrary {


public static void postUserList() {
    JSONObject jo = new JSONObject(); //json Library
    jo.put("id", 12);
    jo.put("username", "vardaan Lather");
    jo.put("firstName", "vardaan");
    jo.put("lastName", "Lather");
    jo.put("Age", 2);

    RestAssured.given()
            .body(jo.toString() )
            .contentType("application/json")
            .when().post(Roots.post_url)
            .then().statusCode(201)
            .log().all();
}


    }
