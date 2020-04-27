package exp4.nchu17204223.petclinic.error;

public class PetClinicException extends Exception {
	private PetClinicErrorMessage errorMessage;

	public PetClinicException(PetClinicErrorMessage errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public PetClinicErrorMessage getErrorMessage() {
		return errorMessage;
	}
	
	public String getMessage() {
		return errorMessage.getMessage();
	}
}
