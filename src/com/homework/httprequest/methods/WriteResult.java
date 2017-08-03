package com.homework.httprequest.methods;

import java.io.FileWriter;
import java.io.IOException;

public class WriteResult {
	/**
     * ���ļ���׷��д����Խ��
     * 
     * @param fileName
     *            д����ļ�����
     * @param content
     *            ׷��д����ļ�����
     */
	 public static void writeresult(String fileName, String content) {   
	        FileWriter writer = null;  
	        try {     
	            // ��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�     
	            writer = new FileWriter(fileName, true);     
	            writer.write(content);       
	        } catch (IOException e) {     
	            e.printStackTrace();     
	        } finally {     
	            try {     
	                if(writer != null){  
	                    writer.close();     
	                }  
	            } catch (IOException e) {     
	                e.printStackTrace();     
	            }     
	        }   
	    }

}
