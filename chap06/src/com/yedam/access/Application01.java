package com.yedam.access;

public class Application01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access ac = new Access();
		ac.free="public";
		ac.parent="protected";
		ac.basic = "default";
		//ac.privacy = "private";
		ac.instead();
	}

}
