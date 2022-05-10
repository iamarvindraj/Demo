package com.cg.entity;

abstract public class Window {
	String msg;
	
	public Window() {}
	public Window(String msg) {
		this.msg=msg;
	}
	
	void displayMessage() {
		System.out.println(msg);
	}
	abstract void open();
	abstract void close();
}
