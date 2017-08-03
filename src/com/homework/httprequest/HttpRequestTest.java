package com.homework.httprequest;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.homework.httprequest.methods.MyRunnable;
import com.homework.httprequest.methods.NumberJudge;
import com.homework.httprequest.timer.ResultTimer;
import com.homework.httprequest.util.ParamUtil;

public class HttpRequestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myRunnable = new MyRunnable();
		@SuppressWarnings("resource")
		Scanner request = new Scanner(System.in);
		System.out.println("enter the url:");
		ParamUtil.URL = request.nextLine();   
		System.out.println("enther the param:");
		ParamUtil.Param = request.nextLine();   
		ParamUtil.number = NumberJudge.isNumber("enter the times:");   //10
		ParamUtil.time = NumberJudge.isNumber("enter the requesttime:");   //10000
		ExecutorService executor = Executors.newFixedThreadPool(ParamUtil.number);
		for(int i =0;i<ParamUtil.number;i++){
			executor.execute(myRunnable);
		}
		ResultTimer.resulttimer();
		executor.shutdown();
	}
}
