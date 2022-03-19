import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BigDouble {
	

	public static void main(String args[])
	{
		double count=0.0;
		double mag=0.0;
		double max=Double.MAX_VALUE;
		double mi8n=Double.MIN_VALUE;
		String area=null;
		String date=null;
		Scanner scan;
	    File file = new File("data.txt");
	    try {
	        scan = new Scanner(file);

	        while(scan.hasNextDouble())
	        {
	         String line=scan.nextLine();
	         count++;
	         if(st.hasMoreTokens())
	         {
	        	 mag=Double.parseDouble(str.nextToken("."));
	        	 area=str.nextToken();
	        	 date=str.nextToken("\\w");
	        	 
	         }
	         if(mag>max)
	         {
	        	 max=mag;
	         }
	         if(mag<min)
	         {
	        	 min=mag;
	         }
	        }
	       scan.close();
	       System.out.println("max is:"+max);
	       System.out.println("min is:"+min);

	    } catch (FileNotFoundException e1) {
	            e1.printStackTrace();
	    }

	}

}
