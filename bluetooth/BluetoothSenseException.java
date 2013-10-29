package org.morphone.sense.bluetooth;

public class BluetoothSenseException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message = "Generic message (no message specified)";
	
	public BluetoothSenseException(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
