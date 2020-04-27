package exp4.nchu17204223.petclinic.error;

public class PetClinicErrorMessage {
	private int code;
	private String message;

	public PetClinicErrorMessage(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
