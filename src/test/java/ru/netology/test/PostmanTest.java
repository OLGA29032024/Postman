package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanTest {

    @Test

    void shouldReturnSendData () {
                given()
                .baseUri ("https://postman-echo.com")
                .body("Hello")
                .when().log().all()
                .post("/post")
                .then().log().all()
                .statusCode(200)
                .body("data", equalTo("Hello"));
    }
}