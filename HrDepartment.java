package com.gl.assignment.service;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		department = "HR Department";
		return department;
	}

	public String getTodaysWork() {
		work = "Fill today's timesheet and mark your attendance";
		return work;
	}

	public String getWorkDeadline() {
		deadLine = "Complete by EOD ";
		return deadLine;
	}

	public String doActivity() {
		String act = "team Lunch";
		return act;
	}

}
