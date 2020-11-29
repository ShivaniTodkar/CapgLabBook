package com.cg.training.lab10.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

	public static void main(String[] args) {

		try {
			File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Capg Lab8-9\\src\\com\\cg\\training\\lab10\\service\\source.txt");
			FileInputStream fin=new FileInputStream(f);
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			
			int i=0;
			String line=br.readLine();
			i++;
			while(line!=null){
			
				System.out.println(i+":"+line);
				line=br.readLine();
				i++;
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
