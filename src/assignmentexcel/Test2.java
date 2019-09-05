package assignmentexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		System.out.println(fis);
		fis.close();
		System.out.println(fis);
	}

}
