package com.homework.httprequest.methods;

import java.util.Scanner;

import com.homework.httprequest.util.LogUtil;

public class NumberJudge {
	/**
     *�ж������Ƿ�Ϊ���֣���������ѭ��Ҫ���������֣������򷵻���������� 
     * 
     * @param str
     *            ��ӡ��������ʾ
     * @return int
     *            �����������ֵ
     */
	@SuppressWarnings("resource")
	public static int isNumber(String str) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean flag = true;
		System.out.println(str);
		LogUtil.logDebug("��ʼ�ж������Ƿ�Ϊ����");
		while (flag) {
			try {
				number = input.nextInt();// �������Ĳ������֣�����׳��쳣����ȥcatch����
				flag = false;// �������������֣������ѭ������
			}
			catch (Exception e) {
				System.out.println("please enter the number:");
				input.nextLine();// ����س�����ȷ��ѭ��������������
			}
		}
		LogUtil.logDebug("�жϽ�����������ֵ��"+number);
		return number;	
	}
}
