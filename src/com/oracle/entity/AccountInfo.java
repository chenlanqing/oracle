package com.oracle.entity;

import java.sql.Date;

import com.oracle.util.ExcelCol;
import com.oracle.util.ExcelBean;

@ExcelBean
public class AccountInfo {
	private Long id;
	@ExcelCol(col = 0)
	private String userName;
	@ExcelCol(col = 1)
	private String password;
	@ExcelCol(col = 2)
	private String gender;
	@ExcelCol(col = 3)
	private String email;
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "AccountInfo [id=" + id + ", userName=" + userName
				+ ", password=" + password + ", gender=" + gender + ", email="
				+ email + ", createDate=" + createDate + "]";
	}

}
