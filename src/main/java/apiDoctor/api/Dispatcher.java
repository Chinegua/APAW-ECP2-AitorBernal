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
        	String id = request.getBody().split(":")[0];
        	String speciality = request.getBody().split(":")[1];
        	String cost = request.getBody().split(":")[2];
            doctorResource.createDoctor(Integer.valueOf(id),speciality,Double.valueOf(cost));
            response.setStatus(HttpStatus.CREATED);
        }
	}
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
