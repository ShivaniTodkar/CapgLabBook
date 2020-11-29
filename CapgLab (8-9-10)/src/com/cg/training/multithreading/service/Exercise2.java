package com.cg.training.multithreading.service;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Exercise2 extends TimerTask{

	@Override
	public void run() {
		System.out.println("Timer started at:"+new Date());
        Task();
        System.out.println("Timer finished at:"+new Date());
    }

    private void Task() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

    public static void main(String args[]){
        TimerTask timerTask = new Exercise2();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        System.out.println("Timer starts");
        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("Timer end");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
