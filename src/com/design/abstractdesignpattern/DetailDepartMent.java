package com.design.abstractdesignpattern;

public class DetailDepartMent {
	public static void main(String[] args) {
		AndroidFactory androidFactory = new AndroidFactory("UniBuy",
				"12 Years", "MVVM", "10 members");
		AndroidFactory androidFactoryClone = (AndroidFactory) androidFactory
				.clone("UniBuy", "12 Years", "MVVM", "10 members");
		System.out.println("FactoryAndroid");

	}
}
