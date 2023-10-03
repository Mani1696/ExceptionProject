package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filenot {
	public static void main (String[]args)throws IOException  {
		try {
		File f=new File("C:\\Users\\manib\\Documents\\notepad\\ha.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=0) {
			System.out.print((char)(temp));
		}
		}
		catch(FileNotFoundException a) {
			System.out.println(a);
		}
	}

}
