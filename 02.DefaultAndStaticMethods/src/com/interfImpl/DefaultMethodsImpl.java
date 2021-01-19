package com.interfImpl;

import java.util.Date;

import com.interf.IDefaultMethods;

public class DefaultMethodsImpl implements IDefaultMethods {

	/*
	 * If you are not satisfied with the deafault implementation of the interface
	 * you can provide you own impl by overriding the corresponding method with
	 * "public" modifier
	 */
	public String wish(String user) {

		String wish=null;
		Date d = new Date();
		
		if(d.getHours()>6 && d.getHours()<12)
			wish="Good morning";
		else if(d.getHours()>=12 & d.getHours()<16)
			wish="Good AfterNoon";
		else if(d.getHours()>=16 && d.getHours()<18)
			wish="Good Evening";
		else
			wish="Good Night";
		
		return wish+":: " + user;
	}

}
