package com.neuedu.handle;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String bdate) throws IllegalArgumentException{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(bdate);
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("转换出错"+e.getClass().getName());
			e.printStackTrace();
		}
		setValue(date);
		
	}

}
