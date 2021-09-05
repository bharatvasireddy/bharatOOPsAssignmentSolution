package com.gl.assignment.service;

public class SuperDepartment {
	public String department;
	public String work;
	public String deadLine;
	public String todayHoliday;

	public String departmentName() {
		department = "Super Department";
		return department;

	}

	public String getTodaysWork() {
		work = "No work as of now";
		return work;
	}

	public String getWorkDeadline() {
		deadLine = "Nil";
		return deadLine;
	}

	public String isTodayAHoliday() {
		todayHoliday = "Today is not a Holiday";
		return todayHoliday;
	}

}
