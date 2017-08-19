package com.homework.httprequest.methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.homework.httprequest.util.LogUtil;
public class SubDate {
	/**
     * ��������ʱ��
     * 
     * @param startdate
     *            ��ʼ�����ʱ��
     * @param enddate
     *            ���������ʱ��
     * @return long ��������֮���ʱ����
     */
	public static long subdate(Date startdate,Date enddate){
		long diff = 0;
		Date d1 = null;
        Date d2 = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		LogUtil.logDebug("��ʼת��ʱ���ʽ");
		String start = format.format(startdate);
		String end = format.format(enddate);
		LogUtil.logDebug("��ʼʱ��Ϊ��"+ start +"����ʱ��Ϊ��" + end);
		LogUtil.logDebug("��ʼ��������ʱ��");
		try {
			d1 = format.parse(start);
			d2 = format.parse(end);			
			diff = d2.getTime() - d1.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LogUtil.logDebug("����ʱ��Ϊ�� "+diff);
		return diff;
	}
}