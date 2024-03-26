import com.shaft.driver.SHAFT;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

public class API_Tests {
    @Test
    public void postapi(){
        SHAFT.API api = new SHAFT.API("https://reqres.in");

        HashMap<String,String> body = new HashMap<>();
        body.put("name","Hedra");
        body.put("job","leader");
        api.post("/api/users").setRequestBody(body).setContentType(ContentType.JSON).perform();
        api.assertThatResponse().body().contains("Hedra");
    }
}
