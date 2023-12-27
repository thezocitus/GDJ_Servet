package com.winter.app.employees;

import java.sql.Date;
import java.util.Calendar;

public class EmployeesDTO {

	private int employee_id;	
	private String first_name;	
	private String last_name;	
	private String email;	
	private String phone_number;
	private Date hire_date;	
	private String job_id;
	private Double salary;
	private Double commission_pct;
	private int manager_id;
	private int department_id;
	
	
	
	public int getemployee_id() {
		return employee_id;
	}
	public void setemployee_id(int employee_id) {
		employee_id = employee_id;
	}
	public String getfirst_name() {
		return first_name;
	}
	public void setfirst_name(String first_name) {
		first_name = first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		last_name = last_name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		email = email;
	}
	public String getphone_number() {
		return phone_number;
	}
	public void setphone_number(String phone_number) {
		phone_number = phone_number;
	}
	public Date gethire_date() {
		return hire_date;
	}
	public void sethire_date(Date hire_date) {
		hire_date = hire_date;
	}
	public String getjob_id() {
		return job_id;
	}
	public void setjob_id(String job_id) {
		job_id = job_id;
	}
	public Double getsalary() {
		return salary;
	}
	public void setsalary(double d) {
		d = d;
	}
	public double getcommission_pct() {
		return commission_pct;
	}
	public void setcommission_pct(double commission_pct) {
		commission_pct = commission_pct;
	}
	public int getmanager_id() {
		return manager_id;
	}
	public void setmanager_id(int manager_id) {
		manager_id = manager_id;
	}
	public int getdepartment_id() {
		return department_id;
	}
	public void setdepartment_id(int department_id) {
		department_id = department_id;
	}
}
