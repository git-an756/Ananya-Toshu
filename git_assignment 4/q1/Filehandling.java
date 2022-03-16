package org.harman.file;
import java.io.File;
import java.io.IOException;
public class Filehandling {
	public static void main(String args[])
	{
		File file=new File("story.txt");
		try
		{
			boolean createNewFile=file.createNewFile();
			System.out.println("File is created:");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
