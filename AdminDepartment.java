package com.gl.assignment.service;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		department = "Admin Department";
		return department;
	}

	public String getTodaysWork() {
		work = "Complete your documents Submission";
		return work;
	}

	public String getWorkDeadline() {
		deadLine = "Complete by EOD ";
		return deadLine;
	}

}
