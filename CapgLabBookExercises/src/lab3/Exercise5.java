package lab3;

/*import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

	static int lines=0,words=0,chars=0;
    public static void wordCount(InputStreamReader isr)throws IOException
    {
           int c=0;
           while((c=isr.read())!=-1)
           {
           chars++;
           if(c=='n')                                                                                                         
           lines++;
           if((c=='n')||(c==' ')||(c=='t'))
           ++words;
           }
    }     
	
	public static void main(String[] args) throws IOException
    {
        if(args.length==0)
        {
        System.out.println("Enter the text----"); 
     
        
        wordCount(new InputStreamReader(System.in));
        }
        else
        {
        FileReader fr=new FileReader(args[0]);
        wordCount(fr);
        }
        System.out.println("Number of Words: "+words);
        System.out.println("Number of charecters: "+chars);                                              
        System.out.println("Number of lines: "+lines);
 }

}*/

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

	
		static int lines=0,words=0,chars=0;
        public static void wordCount(InputStreamReader isr)throws IOException
        {
               int c=0;
               while((c=isr.read())!=-1)
               {
               chars++;
               if(c=='n')                                                                                                         
               lines++;
               if((c=='n')||(c==' ')||(c=='t'))
               ++words;
               }
        }     
        public static void main(String rr[])throws IOException
        {
               if(rr.length==0)
               {
               System.out.println("Enter the text----"); 
            
               
               wordCount(new InputStreamReader(System.in));
               }
               else
               {
               FileReader fr=new FileReader(rr[0]);
               wordCount(fr);
               }
               System.out.println("Number of Words: "+words);
               System.out.println("Number of charecters: "+chars);                                              
               System.out.println("Number of lines: "+lines);
        }
	

}
