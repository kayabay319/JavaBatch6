package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {
		String filePath ="/Users/gulbahar/eclipse-workspace/JavaBasics/configs/configuration.properties";
        System.out.println(filePath);
        
        //capture this part dynamically
        String  userDirectory = System.getProperty("user.dir"); //give me my user directory
        
        String username = System.getProperty("user.name");
        System.out.println(username);
        
        String os = System.getProperty("os.name");
        System.out.println(os);
        
        
        String filePath1 = System.getProperty("user dir"+ "/configs/configuration.properties" );
        
        FileInputStream fis = new FileInputStream(filePath1); //pass the filePath1
        
        Properties prop = new Properties();
        prop.load(fis);
        
        String browser = prop.getProperty("browser");
        String url =prop.getProperty("url");
        
        System.out.println(browser);
        System.out.println(url);
        System.out.println(prop.get(url));
        
        
        
        
	}

}
