package filereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class usingfileread {

	public static void main(String[] args) throws IOException {
		 String location ="bufferedwriter.txt";
		 FileReader reader = new FileReader(location);
		 BufferedReader reader1 = new BufferedReader(reader);
		  String final1;
		  while((final1 = reader1.readLine())!=null) {
			  
			  System.out.println(final1);
			  
		  }
		  
		  reader1.close();
		 
        

	}

}
