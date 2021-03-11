package com.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class MarkableByteOutputStream extends ByteArrayOutputStream {

}

class NdrOutputStream extends DataOutputStream {
	private MarkableByteOutputStream m_byteStream;

	public NdrOutputStream() {
		super(new MarkableByteOutputStream());
		m_byteStream = (MarkableByteOutputStream) out;
	}

	public byte[] toByteArray() {
		return this.m_byteStream.toByteArray();
	}
}

class NdrInputStream extends DataInputStream {
	private ByteArrayInputStream m_byteStream;

	public NdrInputStream(ByteArrayInputStream in) {
		super(in);
		m_byteStream = in;
	}

	public NdrInputStream(byte[] in) {
		this(new ByteArrayInputStream(in));
	}

}

public class NdrSreamExample {

	public static void main(String[] args) throws IOException {
		
		NdrOutputStream outStream = new NdrOutputStream();
		outStream.writeInt(12);
		outStream.writeUTF("Noor");

		byte data2[] = outStream.toByteArray();

		NdrOutputStream outStream2 = new NdrOutputStream();
		outStream2.writeInt(1);
		outStream2.writeUTF("FFFF");
		outStream2.writeInt(data2.length);
		outStream2.write(data2);

		NdrInputStream inStream = new NdrInputStream(outStream2.toByteArray());
		System.out.println(inStream.readInt());
		System.out.println(inStream.readUTF());
		System.out.println(inStream.readInt());
		int dataLength = inStream.readInt();
		byte[] buffer = new byte[dataLength];
		//System.out.println(buffer);
		System.out.println(inStream.available()+"---inStream.available()");
		NdrInputStream inStream2 = new NdrInputStream(buffer);
		System.out.println(inStream2.readInt());
		System.out.println(inStream2.readUTF());

	}

}
