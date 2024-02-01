package Endpoints;

import io.restassured.RestAssured;
import java.util.HashMap;

public class userEndpoints {
static int id;

public static void getUserList()
{
    RestAssured.given()
            .when().get(Roots.get_url)
            .then().statusCode(200)
            .log().all();
}
    public static void postUserList()
    {
        HashMap hm = new HashMap();
        hm.put("name", "Reena");
        hm.put("Surname", "lather");
        hm.put("age", 40);

        RestAssured.given()
                .body(hm)
                .contentType("application/json")
                .when().post(Roots.post_url)
                .then().statusCode(201)
                .log().all();
    }
    public static void updateUserList()
    {
        HashMap hm = new HashMap();
        hm.put("name", "Vardaan");
        hm.put("Surname", "lT");
        hm.put("age", 1);

        RestAssured.given()
                .body(hm)
                .contentType("application/json")
                .when().put(Roots.update_url)
                .then().statusCode(200).log().all();
    }

    public static void deleteUserList()
    {
        RestAssured.given()
                .when().delete(Roots.delete_url)
                .then().statusCode(200)
                .log().all();
               ;
    }
}
