package com.homework.httprequest;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.homework.httprequest.methods.MyRunnable;
import com.homework.httprequest.methods.NumberJudge;
import com.homework.httprequest.timer.ResultTimer;
import com.homework.httprequest.util.LogUtil;
import com.homework.httprequest.util.ParamUtil;

public class HttpRequestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myRunnable = new MyRunnable();
		@SuppressWarnings("resource")
		Scanner request = new Scanner(System.in);
		System.out.println("enter the url:");
		ParamUtil.URL = request.nextLine();
		LogUtil.logDebug("URL is "+ParamUtil.URL);
		System.out.println("enther the param:");
		ParamUtil.Param = request.nextLine();
		LogUtil.logDebug("param is "+ParamUtil.Param);
		ParamUtil.number = NumberJudge.isNumber("enter the requestnumber:");   //10
		LogUtil.logDebug("requestnumber is "+ParamUtil.number);
		ParamUtil.time = NumberJudge.isNumber("enter the requesttime:");   //10000
		LogUtil.logDebug("requesttime is "+ParamUtil.time);
		ExecutorService executor = Executors.newFixedThreadPool(ParamUtil.number);
		LogUtil.logDebug("loop begin");
		for(int i =0;i<ParamUtil.number;i++){
			executor.execute(myRunnable);
		}
		LogUtil.logDebug("loop finish");
		System.out.println("request finish");
		ResultTimer.resulttimer();
		executor.shutdown();
		System.out.println("thread shutdown");
	}
}
