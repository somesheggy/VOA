import org.junit.Test;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class smokeTest {

    @Test
    public void startNow(){

        System.out.println ("This is smoke Test Class");


    }

    @Test
    public void signIn() {


    }



    @Test
    public void loginAndLogout(){
        final String login = randomLogin();
        // First post to login()
        given()
                .queryParam("login", login)
                .queryParam("password", randomPassword())
                .when().post("/login/");

        // Second post to logout() with an assert
        expect().statusCode(200)
                .given()
                .when().post("/logout/");
    }

}



