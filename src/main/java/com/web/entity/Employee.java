package com.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private Integer eid;
	private String empname;
	private String empposition;
	private String email;
	private String emplocation;
	private double salary;
	private double pf;
	private double hra;
	private double ta;
	private double netsalary;
	//PDC+PPC+PSM+PGM+toString()
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eid, String empname, String empposition, String email, String emplocation, double salary,
			double pf, double hra, double ta, double netsalary) {
		super();
		this.eid = eid;
		this.empname = empname;
		this.empposition = empposition;
		this.email = email;
		this.emplocation = emplocation;
		this.salary = salary;
		this.pf = pf;
		this.hra = hra;
		this.ta = ta;
		this.netsalary = netsalary;
	}
	/**
	 * @return the eid
	 */
	public Integer getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the empposition
	 */
	public String getEmpposition() {
		return empposition;
	}
	/**
	 * @param empposition the empposition to set
	 */
	public void setEmpposition(String empposition) {
		this.empposition = empposition;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the emplocation
	 */
	public String getEmplocation() {
		return emplocation;
	}
	/**
	 * @param emplocation the emplocation to set
	 */
	public void setEmplocation(String emplocation) {
		this.emplocation = emplocation;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the pf
	 */
	public double getPf() {
		return pf;
	}
	/**
	 * @param pf the pf to set
	 */
	public void setPf(double pf) {
		this.pf = pf;
	}
	/**
	 * @return the hra
	 */
	public double getHra() {
		return hra;
	}
	/**
	 * @param hra the hra to set
	 */
	public void setHra(double hra) {
		this.hra = hra;
	}
	/**
	 * @return the ta
	 */
	public double getTa() {
		return ta;
	}
	/**
	 * @param ta the ta to set
	 */
	public void setTa(double ta) {
		this.ta = ta;
	}
	/**
	 * @return the netsalary
	 */
	public double getNetsalary() {
		return netsalary;
	}
	/**
	 * @param netsalary the netsalary to set
	 */
	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empname=" + empname + ", empposition=" + empposition + ", email=" + email
				+ ", emplocation=" + emplocation + ", salary=" + salary + ", pf=" + pf + ", hra=" + hra + ", ta=" + ta
				+ ", netsalary=" + netsalary + "]";
	}
	
	
	
	

}
