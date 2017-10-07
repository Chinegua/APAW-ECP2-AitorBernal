package apiDoctor;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.memory.DaoFactoryMemory;
import apiDoctor.api.resource.AppointmenResource;
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
    public void testCreateDoctor() {
        this.createAppointmen();
    }
}
