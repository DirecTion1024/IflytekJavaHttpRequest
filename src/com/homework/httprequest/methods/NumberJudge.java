package com.homework.httprequest.methods;

import java.util.Scanner;

import com.homework.httprequest.util.LogUtil;

public class NumberJudge {
	/**
     *判断输入是否为数字，若不是则循环要求输入数字，若是则返回输入的数字 
     * 
     * @param str
     *            打印的输入提示
     * @return int
     *            返回输入的数值
     */
	@SuppressWarnings("resource")
	public static int isNumber(String str) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean flag = true;
		System.out.println(str);
		LogUtil.logDebug("开始判断输入是否为数字");
		while (flag) {
			try {
				number = input.nextInt();// 如果输入的不是数字，则会抛出异常，进去catch语句块
				flag = false;// 如果输入的是数字，则控制循环结束
			}
			catch (Exception e) {
				System.out.println("please enter the number:");
				input.nextLine();// 读入回车符，确保循环可以正常进行
			}
		}
		LogUtil.logDebug("判断结束，返回数值："+number);
		return number;	
	}
}
