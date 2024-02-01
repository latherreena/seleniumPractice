package Endpoints;

import Payload.PojoClass;
import io.restassured.RestAssured;

public class userEndpointsUsingPojoClass {
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
        PojoClass pj = new PojoClass();
        pj.setId(1);
        pj.setUsername("rk");
        pj.setFirstname("rl");
        pj.setLastname("lath");
        pj.setAge(20);

        RestAssured.given()
                .body(pj)
                .contentType("application/json")
                .when().post(Roots.post_url)
                .then().statusCode(201)
                .log().all();
    }
    public static void updateUserList()
    {

        PojoClass pj = new PojoClass();
        pj.setId(11);
        pj.setUsername("rkdfds");
        pj.setFirstname("rldfds");
        pj.setLastname("lather");
        pj.setAge(30);

        RestAssured.given()
                .body(pj)
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
