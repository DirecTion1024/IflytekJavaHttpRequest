package com.homework.httprequest.timer;

import java.util.Timer;
import java.util.TimerTask;

import com.homework.httprequest.methods.WriteResult;
import com.homework.httprequest.util.ParamUtil;

public class ResultTimer {   //计算平均请求时长
	public static void resulttimer() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {
            public void run() {
            	long result = 0;
                System.out.println(ParamUtil.requesttime);
                System.out.println(ParamUtil.count);
                result = ParamUtil.requesttime/ParamUtil.count;
                System.out.println("平均请求时长为："+result+"毫秒");
                WriteResult.writeresult("F:/result.txt", "平均请求时长为："+result+"毫秒");
            }  
        }, ParamUtil.time);// 设定指定的时间time,此处为2000毫秒  
    }
}
