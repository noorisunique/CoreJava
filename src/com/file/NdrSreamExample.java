package com.file;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

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

		NdrInputStream inStream = new NdrInputStream(outStream.toByteArray());
		System.out.println(inStream.readInt());
		System.out.println(inStream.readUTF());

	}

}
