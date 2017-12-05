package com.lava.Api;


import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.response.Response;
import com.lava.utils.Base;

import java.util.ArrayList;
import java.util.HashMap;
import static com.jayway.restassured.RestAssured.*;
/**
 * Created by jenkins on 16/06/17.
 */
public class profileApi extends Base {
    public Response response;
public profileApi(){

}

   public Response ParentGroup() {
        RestAssured.defaultParser = Parser.JSON;
        response = given().
                formParameter("headers[Content-Type]","application/json").
               formParameter("headers[Accept]","application/json, text/plain, */*").
                formParameter("headers[App-Id","26").
                formParameter("headers[Lava-Authorization","Bearer ee6308b0-1ed7-454d-9662-954ca175a4c4").
                body(" {\n" +
                        "\t\"segment_name\": \"test s\",\n" +
                        "\t\"segment_type\": \"SegmentNewPlayerTier\",\n" +
                        "\t\"segment_category_id\": \"SegmentNewPlayerTier\",\n" +
                        "\t\"segment_category\": \"New Player\",\n" +
                        "\t\"active\": true,\n" +
                        "\t\"owner\": \"Kings1 lava\",\n" +
                        "\t\"segment_args\": {\n" +
                        "\t\t\"segment_new_player_tier\": \"Bronze\"\n" +
                        "\t},\n" +
                        "\t\"created_date\": \"2017-06-22T18:29:24\",\n" +
                        "\t\"edited_date\": \"2017-06-22T18:29:24\",\n" +
                        "\t\"tooltip\": [{\n" +
                        "\t\t\"name\": \"New player tier\",\n" +
                        "\t\t\"value\": \"Bronze\"\n" +
                        "\t}]\n" +
                        "}").

                        when().
                        post("/LavaMarketer/api/v1/segments").
                        then().
                        statusCode(200).
                        extract().response();
        return response;
    }

    public ArrayList<HashMap<String,String>> segments() {
        return response.path("tooltip");

    }










}
