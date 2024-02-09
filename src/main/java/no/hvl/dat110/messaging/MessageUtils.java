package no.hvl.dat110.messaging;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// TODO - START

		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer

		segment = new byte[SEGMENTSIZE];
		data = message.getData();

		segment[0] = (byte) data.length;

		System.arraycopy(data, 0, segment, 1, data.length);

		// TODO - END
		return segment;
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;

		// TODO - START
		// decapsulate segment and put received payload data into a message

		int length = segment[0];
		byte[] data = new byte[length];

		System.arraycopy(segment, 1, data, 0, length);

		message = new Message(data);

		// TODO - END
		return message;
	}
}
