package apiDoctor.api.resource.exceptions;

public class AppointmenPatientInvalidException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "ESPECIALIDAD INCORRECTA";

    public AppointmenPatientInvalidException(String speciality) {
        super(DESCRIPTION + ". " + speciality);
    }
}
