package workingWithFiles_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass_01_Reading{
	
	public static void main(String[] args){
		//Reading a text file line-by-line
		String sep = File.separator;
		//String path = "C:" + sep + "var" + sep + "import" + sep + "creditcard.csv";//For the students: you will have to provide a .csv file for this test
		String path = "C:" + sep + "var" + sep + "import" + sep + "testFile.txt";
		
		File file = new File(path);//Stage 1
		System.out.println(path + " exists:" + file.exists());
		System.out.println(path + " is a directory:" + file.isDirectory());
		System.out.println(path + " is a file:" + file.isFile());
		/*The main reason to have both methods is because 
		 * an object of type File can be created with any path. 
		 * The path can describe a directory(folder) or a file. 
		 * The methods isFile() and isDirectory() 
		 * are used to distinguish between a file and a directory(folder), 
		 * so we can apply the correct processing.*/
		
		
		System.out.println(path + " can be read:" + file.canRead());
		System.out.println(path + " can be changed:" + file.canWrite());
		System.out.println(path + " number of bytes:" + file.length());
		System.out.println(path + " date of modification:" + (new Date (file.lastModified())));
		
		/*	################## EXPLANATION ABOUT PIPELINE ##################
		 * 
		 *  Data source - input of the data, the data comes from here
			Data sink  - output of the data, the data goes there
			Input data stream - the data runs from the source (for example a file) to your program
			Output data stream -the data runs from your program to the data sink(for example a file)
			
			In Java there are two main types of data streams:
			-character oriented data stream -interprets the data as individual characters
			-byte oriented data stream- interprets the data as bytes
			
			BufferedReader is a character oriented data stream.
			BufferedReader cannot read directly from files, it needs a Data source.
			The class FileReader provides such a data source for reading files.
			
			1.The file-Object is created, using the path 
			2.The file-object which represents the input file is passed to the FileReader, 
			3.the FileReader is passed to the BufferedReader
			4.and the BufferedReader provides then the characters for the program.
			
			Here is an illustration:
			Stage 1          	Stage 2            Stage 3				Stage 4
			{Input file} ==> {FileReader} ==> {BufferedReader} ==> {Your program}
			
			################## EXPLANATION ABOUT PIPELINE ##################
		*/
		
		//File file = new File(path);//Stage 1
		
		try{
			FileReader fileReader = new FileReader(file);//Stage 2
			BufferedReader bufferedReader = new BufferedReader(fileReader);//Stage 3
			
			//process file -start of Stage 4
			for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
				//process one line from the file
				System.out.println("Next line is:"+ line);
			}//End of Stage 4
			
			//close the data streams
			bufferedReader.close();
			fileReader.close();
		}catch(FileNotFoundException ex){//Error handling
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		System.out.println("------------------------------------------------------------------------------------------");
		/*------------------------------------------------------------------------------------------------------------*/
		
		
		
		
		
		//As usual --this is your playground and test area
		
		
		
		
		
		
		
	}//main
	
}//class
