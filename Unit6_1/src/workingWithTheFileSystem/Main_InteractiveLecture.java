package workingWithTheFileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main_InteractiveLecture{

	public static void main(String[] args){
		/* ====================PIPELINE EXPLANATION=============================================
		 * In a data stream pipeline, several data streams are interconnected.
			Each stream represents a "stage" from the pipeline

			Data source - input of the data, the data comes from here
			Data sink - output of the data, the data goes there
			Data stream - transports data from a data source to a data sink.
			Input data stream - the data runs from the source (for example a file) to your program
			Output data stream -the data runs from your program to the data sink(for example a file)
			
			In Java there are two main types of data streams:
			-character oriented data stream -interprets the data as individual characters
			-byte oriented data stream- interprets the data as bytes
			
			BufferedReader is a character oriented data stream.
			BufferedReader cannot read directly from files, it needs a Data source.
			The class FileReader provides such a data source for reading files.
			The file-object which represents the input file is passed to the FileReader, 
			the FileReader is passed to the BufferedReader
			and the BufferedReader provides then the characters for the program.
			Here is an illustration:
			Stage 1          	Stage 2            Stage 3				Stage 4
			{Input file} ==> {FileReader} ==> {BufferedReader} ==> {Your program}
			
			*
			*/
		String sep = File.separator;
		String path = "D:" + sep + "var" + sep + "import" + sep + "Data7602DescendingYearOrder.csv"; //Insert the path to your file here
		File file = new File(path); //Stage 1
		try{
		  FileReader fileReader = new FileReader(file);//Stage 2
		  BufferedReader bufferedReader = new BufferedReader(fileReader);//Stage 3
		 
		  //process file -start of Stage 4
		  for(String line = bufferedReader.readLine();
		               line != null;
		               line = bufferedReader.readLine()){
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

	}//main

}//class
