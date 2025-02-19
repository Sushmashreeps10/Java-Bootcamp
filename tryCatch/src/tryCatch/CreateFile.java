package tryCatch;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("myfile.txt");
			System.out.println("This is the text Flie");
		
		
		if(!f.exists()) {
			f.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(f);
		pw.println("sushma");
		pw.println(100);
		pw.println("you caan read this");
		pw.println("Only you can read this girl");
		pw.println("hey how are you");
		pw.println("this will be last line");
		pw.println("-----------------------------------");
		pw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	  System.out.println("done");
	}
	

}
