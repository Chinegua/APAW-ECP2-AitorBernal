package apiDoctor;

import org.junit.Test;

import apiDoctor.http.HttpClientService;
import apiDoctor.http.HttpMethod;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpRequestBuilder;

public class DoctorResourceFunctionalTesting {
	
    private void createTheme() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(ThemeResource.THEMES).body("uno").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateTheme() {
        this.createTheme();
    }

}
