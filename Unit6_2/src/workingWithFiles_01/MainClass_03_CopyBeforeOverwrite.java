package workingWithFiles_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass_03_CopyBeforeOverwrite{

	public static void main(String[] args){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		String sep = File.separator;
		String path = "C:" + sep + "var" + sep + "imported" + sep + (dateFormat.format(new Date()) + ".log");
		File file = new File(path);
		
		String reportData = "This is the data which will be written in the file 05";
		
		try{
			if(file.exists() == true){
				String pathOf_FileCopy = file.getAbsolutePath() + ".copy";
				File fileCopy = new File(pathOf_FileCopy);
				
				FileReader original = new FileReader(file);
				FileWriter copy = new FileWriter(fileCopy);
				
				//original.read()  - this method returns an integer 
				for(int character = original.read() ; character != -1 ;character = original.read()){
					System.out.println("Next character is:" + character);
					copy.write(character);
				}//for
				
				copy.close();
				original.close();
			}//if
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(reportData);
			fileWriter.close();
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}//main
}//class
