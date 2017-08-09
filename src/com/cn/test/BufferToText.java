package com.cn.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
	private static final int BSIZE = 1024;
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		
		FileChannel fc = new FileOutputStream("D://data.txt").getChannel();
		ByteBuffer bf = ByteBuffer.allocate(4);
		//bf.asCharBuffer().put("汉字");
		fc.write(ByteBuffer.wrap("汉字".getBytes()));
		//fc.write(bf);
		fc.close();
		
		String encoding = System.getProperty("file.encoding");
		System.out.println(encoding);
		
		
		fc = new FileInputStream("D://data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		System.out.println(Charset.forName(encoding).decode(buff));
		
	}
}
