package com.cg.training.lab10.service;

import java.io.File;

public class Exercise2 {

	public static void printString(String str)
    {
           System.out.println(str);
    }
    public static void displayInfo(String s)
    {
           File file=new File(s);
           if(file.exists())
           {
	           printString(file.getName()+" is the name of file");
	           printString(file.canRead()?" is readable":" is not readable");
	           printString(file.canWrite()?" is writable":" is not writable");
	           printString("Filesize:"+file.length()+" bytes");
	           printString("File last mdified:"+file.lastModified());
	        }
           if(file.isDirectory())
           {
        	   printString(file.getName()+" is directory");
        	   printString("List of files");
        	   String dir[]=file.list();
        	   for(int i=0;i<dir.length;i++)
        		   	printString(dir[i]);
           }


}}
