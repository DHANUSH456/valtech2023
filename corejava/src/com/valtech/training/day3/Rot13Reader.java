package com.valtech.training.day3;

import java.io.*;

public class Rot13Reader extends Reader{
	
	private Reader source;
	public Rot13Reader(Reader source) {
		
		this.source = source;
	}
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		int bytesRead = source.read(cbuf, off,len);
		for(int i=0; i<bytesRead; i++) {
			
			cbuf[off + i] = Rot13Helper.rotate(cbuf[off + i]);
			
		}
		return 0;
	}
	
	@Override
	public void close() throws IOException {
		
	}

}
