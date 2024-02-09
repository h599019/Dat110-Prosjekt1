package no.hvl.dat110.messaging;

import java.nio.BufferOverflowException;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		// TODO - START
		final int MAXSIZE = 127;

		// Sjekke om data er null
		if(data == null) throw new NullPointerException();
		// Sjekke om data er for stor
		if(data.length > MAXSIZE) throw new BufferOverflowException();

		this.data = data;
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
