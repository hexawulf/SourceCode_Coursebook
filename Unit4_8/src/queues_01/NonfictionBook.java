package queues_01;//1.Package declaration 
//package names are always written in lower case 

import java.text.SimpleDateFormat;//2.Imports, alphabetically sorted 
import java.util.Date;


public class NonfictionBook extends Book{//Class names in CamelCase 
	
	private static final String CLASS_PREFIX = "NF";//3.Class variables and constants 
	//Class constants are completely capitalized
	
	private String subject;//4.Instance variables 
	
	public NonfictionBook() {//5.Constructors 
		super();
	}
	
	public NonfictionBook(String manufacturer, String title, float price, String author) {//5.Constructors 
		super(manufacturer,title,price,author);
	}
	
	//for method names also CamelCase is used
	public void setSubject(String subject){//6.Getters and Setters 
		this.subject = subject;
	}
	
	//Method names are formulated as verbs and written in smaller case
	public String summarize(){//7.Additional methods 
		String summary = "";
		int numberSubjects = getNumberSubjects();
		
		/*Returning empty string, if the Non-fiction 
		 * book has not yet been assigned to a subject*/
		if(subject == null) {
			return summary;
		}
		
		for(int i = 0; i < numberSubjects; ++i){
			summary = summary + i + "th summary line \n";
		}
		
		return summary;
	}
	
	private int getNumberSubjects(){
		return 5;
	}

}
