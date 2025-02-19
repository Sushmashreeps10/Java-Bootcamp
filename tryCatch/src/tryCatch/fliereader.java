package tryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fliereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("myfile.txt"));
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("The End");
		}

	}

}
