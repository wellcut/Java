package com.yedam.inheri;

import com.yedam.protect.A;

public class C extends A {
	
	public C() {
		super();
		this.field = "value";
		this.method();
	}
	
//	public void method2() {
//		A a = new A();
//		a.field = "value";
//		a.method();
//	}
}
