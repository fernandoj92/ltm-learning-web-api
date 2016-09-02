package app.test;

import util.JsonUtil;

import static spark.Spark.*;

/**
 * Created by Fernando on 24/08/2016.
 */
public final class TestController {

    private static TestController controller;

    private TestService service;

    private TestController(){
        service = new TestService();

        get("/app/createMock", (req, res) -> service.createMock(), JsonUtil.json());
    }

    public static TestController initialize(){
        if(controller == null) {
            controller = new TestController();
            return controller;
        }

        return controller;
    }


}
