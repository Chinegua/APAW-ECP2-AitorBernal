package apiDoctor.api;

import apiDoctor.api.resource.DoctorResource;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpResponse;
import apiDoctor.http.HttpStatus;

public class Dispatcher {
	
	DoctorResource doctorResource;

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		System.out.print("LLEGA AL DISPATCHER");
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
