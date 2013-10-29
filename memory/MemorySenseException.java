package org.morphone.sense.memory;

public class MemorySenseException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "Generic message (no message specified)";
	
	public MemorySenseException(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
