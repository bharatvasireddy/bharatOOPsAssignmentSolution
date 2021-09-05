package com.gl.assignment.service;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		department = "Tech Department";
		return department;
	}

	public String getTodaysWork() {
		work = "Complete coding of Module 1";
		return work;
	}

	public String getWorkDeadline() {
		deadLine = "Complete by EOD ";
		return deadLine;
	}

	public String getTechStackInformation() {
		String type = "Core java";
		return type;
	}
}
