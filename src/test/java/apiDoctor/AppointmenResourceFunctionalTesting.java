package apiDoctor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.memory.DaoFactoryMemory;
import apiDoctor.api.resource.AppointmenResource;
import apiDoctor.api.resource.DoctorResource;
import apiDoctor.http.HttpClientService;
import apiDoctor.http.HttpMethod;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpRequestBuilder;

public class AppointmenResourceFunctionalTesting {
	@Before
	public void Before(){
		DaoFactory.setFactory(new DaoFactoryMemory());
	}
	
    private void createAppointmen() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(AppointmenResource.APPOINTMEN).body("1:\"Juan Perez\":30-10-1995").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateAppointmen() {
        this.createAppointmen();
    }
    
    @Test
    public void testGetAppointmen(){
    	this.createAppointmen();

        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(AppointmenResource.APPOINTMEN).build();
        System.out.println(new HttpClientService().httpRequest(request).getBody());
        assertEquals("[{\"id\":\"1,\"patient\":\"Juan Perez\",\"calendar\":30-10-1995}]",new HttpClientService().httpRequest(request).getBody());
    }
}
