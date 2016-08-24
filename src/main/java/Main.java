import controllers.TestController;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        port(8899); // Spark will run on port 9090

        get("/hello", (req, res) -> "Hello World");

        TestController.initialize();
    }
}