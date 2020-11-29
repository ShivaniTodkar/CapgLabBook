package com.cg.training.lab10.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.training.lab10.service.Exercise2;

public class Exercise2Tester {

public static void main(String[] args) throws IOException {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter file name");
    String fileName=br.readLine();
    Exercise2.displayInfo(fileName);

		
	}
	
}
