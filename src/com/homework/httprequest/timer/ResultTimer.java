package com.homework.httprequest.timer;

import java.util.Timer;
import java.util.TimerTask;

import com.homework.httprequest.methods.WriteResult;
import com.homework.httprequest.util.ParamUtil;

public class ResultTimer {   //����ƽ������ʱ��
	public static void resulttimer() {  
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {
            public void run() {
            	long result = 0;
                System.out.println(ParamUtil.requesttime);
                System.out.println(ParamUtil.count);
                result = ParamUtil.requesttime/ParamUtil.count;
                System.out.println("ƽ������ʱ��Ϊ��"+result+"����");
                WriteResult.writeresult("F:/result.txt", "ƽ������ʱ��Ϊ��"+result+"����");
            }  
        }, ParamUtil.time);// �趨ָ����ʱ��time,�˴�Ϊ2000����  
    }
}
