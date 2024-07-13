package UsingFileWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class outputstream {

	public static void main(String[] args) throws IOException {

        String location ="outputstream.txt";
        String contents = "fos-file-write";
       
        FileOutputStream stream = new FileOutputStream(location);
       byte[] writer =   contents.getBytes();
       stream.write(writer);
       stream.close();
       //used to take raw byte
        
        

	}

}
