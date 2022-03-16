package org.harman.file;
import java.io.*;
public class FileWrite {
	public static void main(String args[]) throws IOException
	{
	FileWriter fw=new FileWriter("story.txt");
	String s="we create a  a create file";
	fw.write(s);
	fw.close();
	}
}
	


