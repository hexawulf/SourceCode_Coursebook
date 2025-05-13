package workingWithFiles_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class MainClass_04_StoringReadingCompressed{

	public static void main(String[] args){
		//Compressed writing
		try{
			
			File file = new File("compressed.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(fileOutputStream);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(deflaterOutputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			System.out.println("Compression START");
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream( new File("compressed.txt") ))));
		
			for(int i = 0; i < 10; i++){
				w.write("Hello World times=" + i + "\n");
			}
			
			w.close();
			System.out.println("Compression END");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
		//Decompressed reading
		try{
			System.out.println("Decompression START");
			BufferedReader b = new BufferedReader(new InputStreamReader(new InflaterInputStream(new FileInputStream(new File("compressed.txt")))));
			
			for(String s = b.readLine(); s != null ; s = b.readLine()){
				System.out.println(s);
			}
			
			b.close();
			System.out.println("Decompression END");
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}
		
	}//main

}//class
