package apiDoctor;

import org.junit.Test;

import apiDoctor.api.resource.DoctorResource;
import apiDoctor.http.HttpClientService;
import apiDoctor.http.HttpMethod;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpRequestBuilder;

public class DoctorResourceFunctionalTesting {
	
    private void createDoctor() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(DoctorResource.DOCTORS).body("prueba").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateDoctor() {
        this.createDoctor();
    }

}
