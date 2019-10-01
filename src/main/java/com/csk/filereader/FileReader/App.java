package com.csk.filereader.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
  
    	ArrayList <String> magazineList = new ArrayList<String>();
    	
    	try(Scanner scan=new Scanner(new FileReader("journal_list.html") )){
    		
    		while(scan.hasNextLine()){
    			
    			String lineinfo=scan.nextLine();
    			//System.out.println("*"+lineinfo);
    			
    			//String[] magazineinfo=lineinfo.split("</DT>");
    			if(lineinfo.contains("<DT><strong>")){
    				
    				System.out.println(lineinfo.substring(12,lineinfo.length()-14));
    				
    				
    			}
    			
    		}
    		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	/**	System.out.println(new File("journal_list.html").getAbsoluteFile());
    	FileReader fr;
        try{ 
        	fr=new FileReader("journal_list.html");
        	int i;
        	while((i=fr.read())!=-1){
        		System.out.print((char)i);
        		
        		
        	}
        	fr.close();
        	
        } catch(IOException e){
        	e.printStackTrace();
        }   **/
    }    
}
