package com.homework.httprequest.methods;


import java.util.Date;
import com.homework.httprequest.timer.FlagTimer;
import com.homework.httprequest.util.ParamUtil;

public class MyRunnable implements Runnable{

	/**
     * ���趨��ʱ���ڳ�������get����
     * 
     */
	@Override
	public void run() {
		FlagTimer.flagtimer();
		// TODO Auto-generated method stub
		while(ParamUtil.flag){
			String result = null;
			Date startdate = new Date();
			result = HttpRequest.sendGet(ParamUtil.URL, ParamUtil.Param);
			Date enddate = new Date();
			ParamUtil.requesttime = ParamUtil.requesttime + SubDate.subdate(startdate, enddate);
			ParamUtil.count = ParamUtil.count + 1;
			try {
				String str = result.substring(result.indexOf("\"code"), 14);
				if(str.replace("\"code\":", "").equals("\"0000\"")){
					System.out.println("success"+"   "+"�ӿ���Ӧʱ�䣺" + SubDate.subdate(startdate, enddate)+"����");
					WriteResult.writeresult("F:/result.txt", "success"+"   "+"�ӿ���Ӧʱ�䣺" + SubDate.subdate(startdate, enddate)+"����"+"\n");
				}else {
					System.out.println("fail");
				}
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}	
		}
	}
}
