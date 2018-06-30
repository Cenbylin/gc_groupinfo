package com.neuedu.handle;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyConverter implements Converter<String, Date>{

	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(arg0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("转换出错" + this.getClass().getName());
			
		}
		//转换出错则return null
		return null;
	}

}
