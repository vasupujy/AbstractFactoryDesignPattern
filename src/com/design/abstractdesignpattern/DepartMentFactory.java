package com.design.abstractdesignpattern;

public class DepartMentFactory {

	public static DepartMent getDeptDetail(DepartMentAbstractFactory factory) {
		return factory.createDepartment();
	}
}
