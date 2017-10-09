package apiDoctor.api.resource.exceptions;

public class DoctorSpecilityInvalidException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "ESPECIALIDAD INCORRECTA";

    public DoctorSpecilityInvalidException(String speciality) {
        super(DESCRIPTION + ". " + speciality);
    }


}
