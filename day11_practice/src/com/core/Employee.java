package com.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable{
private String eid;
private String fname;
private String lname;
private double salary;
private LocalDate jdate;
private Department dept;
public Employee(String eid, String fname, String lname, double salary,LocalDate jdate, Department dept) {
	super();
	this.eid = eid;
	this.fname = fname;
	this.lname = lname;
	this.salary = salary;
	this.dept = dept;
	this.jdate=jdate;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public String getEid() {
	return eid;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + ", dept=" + dept
			+ "]";
}

}
