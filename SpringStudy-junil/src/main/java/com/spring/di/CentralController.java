package com.spring.di;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


@Component
public class CentralController {

	@Autowired (required = false)
	@Qualifier("c2")
	private RemoteControl control1;
	
	@Autowired (required = false)
	@Qualifier("c3")
	private RemoteControl control2;

	/*
	public CentralController() {

	}

	public CentralController(RemoteControl control1, RemoteControl control2) {
		super();
		this.control1 = control1;
		this.control2 = control2;
	}
	
	public RemoteControl getControl1() {
		return control1;
	}

	public void setControl1(RemoteControl control1) {
		this.control1 = control1;
	}

	public RemoteControl getControl2() {
		return control2;
	}

	public void setControl2(RemoteControl control2) {
		this.control2 = control2;
	}
	 */
	
	public void onAll() {
		System.out.println("모든 전원을 켭니다");
		control1.on();
		control2.on();

	}

	public void offAll() {
		System.out.println("모든 전원을 끕니다");
		control1.off();
		control2.off();
	}
}