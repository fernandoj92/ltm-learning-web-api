package services;

import models.TestModel;

/**
 * Created by Fernando on 24/08/2016.
 */
public class TestService {

    public TestModel createMock(){
        return new TestModel("0", "Mock Object 0");
    }
}
