package apiDoctor.api.resource.exceptions;

public class DoctorIdNotFoundException extends Exception {
    private static final long serialVersionUID = -3893110892899234744L;

    public static final String DESCRIPTION = "El id del doctor no existe";

    public DoctorIdNotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public DoctorIdNotFoundException() {
        this("");
    }
}
