package apiDoctor.api;

import java.util.Arrays;
import java.util.Calendar;

import apiDoctor.api.resource.AppointmenResource;
import apiDoctor.api.resource.DoctorResource;

import apiDoctor.api.resource.exceptions.RequestInvalidException;
import apiDoctor.http.HttpRequest;
import apiDoctor.http.HttpResponse;
import apiDoctor.http.HttpStatus;

public class Dispatcher {

	DoctorResource doctorResource = new DoctorResource();

	AppointmenResource appointmenResource = new AppointmenResource();

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
			} else if (request.isEqualsPath(AppointmenResource.APPOINTMEN)) {

				String id = request.getBody().split(":")[0];
				String paciente = request.getBody().split(":")[1];
				String fecha = request.getBody().split(":")[2];
				String[] parts = fecha.split("-");

				int day = Integer.parseInt(parts[0]);
				int month = Integer.parseInt(parts[1]);
				int year = Integer.parseInt(parts[2]);
				Calendar calendar = Calendar.getInstance();

				calendar.set(year,month,day);
				appointmenResource.createAppointmen(Integer.valueOf(id), paciente, calendar);

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
			} else if (request.isEqualsPath(DoctorResource.DOCTORS + DoctorResource.ID_SPECIALITY)) {
				response.setBody(DoctorResource.doctorSpeciality(Integer.valueOf(request.paths()[1])).toSpeciality());

			}else if(request.isEqualsPath(AppointmenResource.APPOINTMEN)){
				response.setBody(AppointmenResource.AppointmenList().toString());
			}else if(request.isEqualsPath(AppointmenResource.APPOINTMEN + AppointmenResource.ID_CALENDAR)){
				response.setBody(AppointmenResource.appointmenCalendar(Integer.valueOf(request.paths()[1])).toCalendar());

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
