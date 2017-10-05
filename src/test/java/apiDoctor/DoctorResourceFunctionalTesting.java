package apiDoctor;

import org.junit.Before;
import org.junit.Test;

import apiDoctor.api.daos.DaoFactory;
import apiDoctor.api.daos.memory.DaoFactoryMemory;
import apiDoctor.api.resource.DoctorResource;
import apiDoctor.http.HttpClientService;
import apiDoctor.http.HttpMethod;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpRequestBuilder;


public class DoctorResourceFunctionalTesting {
	
	@Before
	public void Before(){
		DaoFactory.setFactory(new DaoFactoryMemory());
	}
    private void createDoctor() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(DoctorResource.DOCTORS).body("1:\"Medico de cabecera\"").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateDoctor() {
        this.createDoctor();
    }

}
