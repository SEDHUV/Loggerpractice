package UsingFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	

	public static void main(String[] args) throws IOException {
		
           String location ="Filewriter.txt";
           String contents = "file-write";
           FileWriter filewrite = new FileWriter(location);
           filewrite.write(contents);
           filewrite.close();
           //directly interact with files but less performance bcoz it is interacting directly with files
	}

}
