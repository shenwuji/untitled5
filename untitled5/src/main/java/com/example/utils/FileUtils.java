package com.example.utils;

import java.io.IOException;
import java.io.InputStream;

public class FileUtils {
    private static FileUtils fileUtils;
    static {
        fileUtils=new FileUtils();
    }
    private FileUtils(){

    }
    public static FileUtils getInstance(){
        return fileUtils;
    }

    public String getFileContent(String fileName){
        StringBuffer stringBuffer=new StringBuffer();
            try {
                InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream(fileName);
                byte[] buffer=new byte[1024*1000];
                int size=0;
                while ((size=inputStream.read(buffer))!=-1){
                    stringBuffer.append(new String(buffer,0, size,"utf8"));
                }
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return stringBuffer.toString();
        }



    }

