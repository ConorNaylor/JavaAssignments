package assignment9;

import java.io.Serializable;

public class myFile implements Serializable {
	
	private String name, sourcePath;
	private byte[] data;
	private long size;
	
	public myFile()
	{
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getsourceAddress() {
		return sourcePath;
	}

	public void setsourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

}
