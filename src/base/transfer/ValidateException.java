package base.transfer;

public class ValidateException extends Exception {
	private static final long serialVersionUID = 1L;

	private final String errorCode;

	public ValidateException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
