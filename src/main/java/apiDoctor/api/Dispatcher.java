package apiDoctor.api;

import apiDoctor.api.resource.DoctorResource;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpResponse;
import apiDoctor.http.HttpStatus;

public class Dispatcher {
	
	DoctorResource doctorResource = new DoctorResource();

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doPost(HttpRequest request, HttpResponse response) {
        if (request.isEqualsPath(DoctorResource.DOCTORS)) {
            doctorResource.createDoctor(request.getBody());
            response.setStatus(HttpStatus.CREATED);
        }	}
	public void doPut(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}
	public void doGet(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}
	public void doPatch(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}
	public void doDelete(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}

}
