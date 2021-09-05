package com.gl.assignment.driver;

import com.gl.assignment.service.AdminDepartment;
import com.gl.assignment.service.HrDepartment;
import com.gl.assignment.service.SuperDepartment;
import com.gl.assignment.service.TechDepartment;

public class Main {

	public static void main(String[] args) {

		SuperDepartment dept = new AdminDepartment();

		System.out.println("Welcome to " + dept.departmentName());
		System.out.println(dept.getTodaysWork());
		System.out.println(dept.getWorkDeadline());
		System.out.println(dept.isTodayAHoliday());
		System.out.println("\n\n");

		SuperDepartment dept1 = new HrDepartment();
		System.out.println("Welcome to " + dept1.departmentName());
		System.out.println(((HrDepartment) dept1).doActivity());
		System.out.println(dept1.getTodaysWork());
		System.out.println(dept1.getWorkDeadline());
		System.out.println(dept1.isTodayAHoliday());
		System.out.println("\n\n");

		SuperDepartment dept2 = new TechDepartment();
		System.out.println("Welcome to " + dept2.departmentName());
		System.out.println(dept2.getTodaysWork());
		System.out.println(dept2.getWorkDeadline());
		System.out.println(((TechDepartment) dept2).getTechStackInformation());
		System.out.println(dept2.isTodayAHoliday());

	}

}
