import io.restassured.http.ContentType;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ClientTest {

    String apiClientURI = "http://localhost:8080/";

    @Test
    @DisplayName("When get all clients so the list should be empty")
    public void getAllClients() {
        String expectResponse = "{}";

        given()
                .contentType(ContentType.JSON)
                .when()
                .get(apiClientURI)
                .then()
                .statusCode(200)
                .assertThat().body(new IsEqual<>(expectResponse));

    }

    @Test
    @DisplayName("When create a customer then should be displayed")
    public void createCustomer(){
        //TODO


        }



}
