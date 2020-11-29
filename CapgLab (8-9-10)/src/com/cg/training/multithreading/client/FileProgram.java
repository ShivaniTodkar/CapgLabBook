package com.cg.training.multithreading.client;

import com.cg.training.multithreading.service.CopyDataThread;

public class FileProgram {

	public static void main(String[] args) {
		Runnable runnable=new CopyDataThread();
		Thread t1=new Thread(runnable);
		t1.start();

	}

	
}
