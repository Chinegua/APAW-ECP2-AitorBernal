package apiDoctor.api.resource.exceptions;

public class DoctorCostInvalidException extends Exception {
    private static final long serialVersionUID = -642045799876625537L;

    public static final String DESCRIPTION = "COST INCORRECTO";

    public DoctorCostInvalidException(Double cost) {
        super(DESCRIPTION + ". " + cost);
    }

}
