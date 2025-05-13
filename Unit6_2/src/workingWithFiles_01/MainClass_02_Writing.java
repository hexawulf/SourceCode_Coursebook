package workingWithFiles_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainClass_02_Writing{

	public static void main(String[] args){
		//Writing in a text file
		System.out.println("Breakpoint 01");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		System.out.println("Breakpoint 02");
		String sep = File.separator;
		System.out.println("Breakpoint 03");
		String path = "C:" + sep + "var" + sep + "imported" + sep + dateFormat.format(new Date()) + ".log";
		System.out.println("Breakpoint 04");
		File file = new File(path);
		System.out.println("Breakpoint 05");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		String reportdata ="This is a test for writing in a file current system time is:" + now;
		
		//String reportdata = "";
		
		try{
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(reportdata);
			fileWriter.close();
			
			//Attempt
			String path01 = "C:" + sep + "var" + sep + "imported" + sep + "countingToTen.txt";
			File file01 = new File(path01);
			FileWriter fileWriter01 = new FileWriter(file01);
			for(int  counter = 1 ; counter <= 10; counter ++){
				String currentLineToBeWritten = "Current number to be written is: " + counter + "\n";
				fileWriter01.write(currentLineToBeWritten);		
			}
			
			fileWriter01.close();
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
				
		System.out.println("------------------------------------------------------------------------------------------");
		/*------------------------------------------------------------------------------------------------------------*/
		
		
		
		
		
		
		
		
		
		//As usual --this is your playground and test area
		
		
		
		
		
		
		
		
		
	}//main

}//class
