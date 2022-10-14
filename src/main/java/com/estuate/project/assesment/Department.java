package com.estuate.project.assesment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	@Column(length=10 ,name="DEPT_No")
	private int deprtno;
	@Column(name="Dept_Name")
	private String dname;
	@Column(name="Dept_Purpose")
	private String purpose;
	public Department(int deptno, String dname, String purpose) {
		super();
		this.deprtno = deptno;
		this.dname = dname;
		this.purpose = purpose;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeprtno() {
		return deprtno;
	}
	public void setDeprtno(int deptno) {
		this.deprtno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	

}
