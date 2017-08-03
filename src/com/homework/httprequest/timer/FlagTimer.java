package com.homework.httprequest.timer;

import java.util.Timer;
import java.util.TimerTask;

import com.homework.httprequest.util.ParamUtil;

public class FlagTimer {
	public static void flagtimer() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {
        	
            public void run() {  
                ParamUtil.flag = false;  
            }  
        }, ParamUtil.time);// 设定指定的时间time,此处为2000毫秒  
    } 

}
