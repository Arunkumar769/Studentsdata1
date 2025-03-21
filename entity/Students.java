
package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	@Id
	private int rollnum;
	private String name;
	private String email;
	private long mobile;
	private String branch;

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", branch=" + branch + "]";
	}

	public Students() {
		super();
	}

	public Students(int rollnum, String name, String email, long mobile, String branch) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.branch = branch;
	}
}