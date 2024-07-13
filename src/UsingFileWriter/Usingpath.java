package UsingFileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Usingpath {

	public static void main(String[] args) throws IOException {

        String location ="Usingp.txt";
        String contents = "fos-file-write";
        Path path = Paths.get(location);
        Files.write(path, contents.getBytes());
        
        

	}

}
