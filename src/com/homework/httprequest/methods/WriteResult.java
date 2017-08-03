package com.homework.httprequest.methods;

import java.io.FileWriter;
import java.io.IOException;

public class WriteResult {
	/**
     * 向文件中追加写入测试结果
     * 
     * @param fileName
     *            写入的文件名称
     * @param content
     *            追加写入的文件内容
     */
	 public static void writeresult(String fileName, String content) {   
	        FileWriter writer = null;  
	        try {     
	            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件     
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
