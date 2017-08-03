package com.homework.httprequest.util;

public class ParamUtil {
	public static boolean flag = true;   //为true一直请求，为false停止请求
	public static long requesttime = 0;   //请求时长
	public static int count = 0;   //本轮一共进行的请求次数
	public static String URL = null;   //请求URL
	public static String Param = null;   //请求参数
	public static int number = 0;   //设置请求线程数量
	public static int time = 0;   //设置请求时长
}
