package apiDoctor.api;

import apiDoctor.api.resource.DoctorResource;

import apiDoctor.api.resource.exceptions.RequestInvalidException;
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
		try {
			if (request.isEqualsPath(DoctorResource.DOCTORS)) {
				String id = request.getBody().split(":")[0];
				String speciality = request.getBody().split(":")[1];

				doctorResource.createDoctor(Integer.valueOf(id), speciality);
				response.setStatus(HttpStatus.CREATED);
			} else {
				throw new RequestInvalidException(request.getPath());

			}
		} catch (

		Exception e)

		{
			responseError(response, e);
		}

	}

	public void doPut(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}

	public void doGet(HttpRequest request, HttpResponse response) {
		try {
			if (request.isEqualsPath(DoctorResource.DOCTORS)) {
				response.setBody(DoctorResource.DoctorList().toString());
			}else if(request.isEqualsPath(DoctorResource.DOCTORS + DoctorResource.ID_SPECIALITY)){
				System.out.println(DoctorResource.doctorSpeciality(Integer.valueOf(request.paths()[1])).toSpeciality());

			} 
			else {

				throw new RequestInvalidException(request.getPath());

			}

		} catch (

		Exception e)

		{
			responseError(response, e);
		}
	}

	public void doPatch(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		System.out.print(">>>");
	}

}
