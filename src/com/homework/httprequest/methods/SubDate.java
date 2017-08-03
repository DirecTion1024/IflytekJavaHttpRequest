package com.homework.httprequest.methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SubDate {
	/**
     * 计算请求时长
     * 
     * @param startdate
     *            开始请求的时间
     * @param enddate
     *            结束请求的时间
     * @return long 返回请求之间的时间间隔
     */
	public static long subdate(Date startdate,Date enddate){
		long diff = 0;
		Date d1 = null;
        Date d2 = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String start = format.format(startdate);
		String end = format.format(enddate);
		try {
			d1 = format.parse(start);
			d2 = format.parse(end);			
			diff = d2.getTime() - d1.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return diff;
	}
}