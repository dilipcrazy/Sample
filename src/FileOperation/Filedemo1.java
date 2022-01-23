package FileOperation;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Filedemo1 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\asus\\Desktop\\john\\sun.txt");
		boolean folder = f.mkdir();
		System.out.println(folder);
		boolean subfolder = f.mkdirs();
		System.out.println(subfolder);
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
        boolean txtfile = f.createNewFile();
        System.out.println(txtfile);
        boolean exists = f.exists();
        System.out.println(exists);
        boolean canRead = f.canRead();
        System.out.println(canRead);
        boolean canWrite = f.canWrite();
          System.out.println(canWrite);
          String[] list = f.list();
          System.out.println(list.length);
          for (String string : list) {
			//String string2 = string.toString();
			System.out.println(string);
		}
          File[] file = f.listFiles();
          System.out.println(file.length);
          for (File allfile : file) {
			//String text = allfile.toString();
			System.out.println(allfile);
        	  
		}
          
           List<String> readLines = FileUtils.readLines(f);
           System.out.println(readLines);
           FileUtils.write(f, "dilip", false);
          
           FileUtils.write(f, "kumar",true);
          
          
          
          
          
          
      
	}

}
