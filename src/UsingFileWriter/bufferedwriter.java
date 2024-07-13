package UsingFileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriter {

	public static void main(String[] args) throws IOException {
		 String location ="C:\\logs\\logging.log";
         String contents = "bufferedfile-write";
         FileWriter filewrite = new FileWriter(location);
         BufferedWriter writer = new BufferedWriter(filewrite);
         writer.write(contents);
         writer.close();
//good performance it takes file from filewriter
	}

}
