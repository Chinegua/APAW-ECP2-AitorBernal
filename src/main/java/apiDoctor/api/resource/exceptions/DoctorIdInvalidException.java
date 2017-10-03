package apiDoctor.api.resource.exceptions;

public class DoctorIdInvalidException extends Exception {
	
    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "ID INCORRECTO";

    public DoctorIdInvalidException(Integer id) {
        super(DESCRIPTION + ". " + id);
    }

}
