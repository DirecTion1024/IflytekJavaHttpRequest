package com.homework.httprequest.methods;


import java.util.Date;
import com.homework.httprequest.timer.FlagTimer;
import com.homework.httprequest.util.ParamUtil;

public class MyRunnable implements Runnable{

	/**
     * 在设定的时间内持续发起get请求
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
					System.out.println("success"+"   "+"接口响应时间：" + SubDate.subdate(startdate, enddate)+"毫秒");
					WriteResult.writeresult("F:/result.txt", "success"+"   "+"接口响应时间：" + SubDate.subdate(startdate, enddate)+"毫秒"+"\n");
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
