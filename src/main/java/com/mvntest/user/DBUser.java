package com.mvntest.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DBUSER")
public class DBUser implements java.io.Serializable {

	@Id
	@Column(name = "USER_ID", unique = true, nullable = false, precision = 5, scale = 0)
	private int userId;

	@Column(name = "USERNAME", nullable = false, length = 20)
	private String username;
	
	@Column(name = "CREATED_BY", nullable = false, length = 20)
	private String createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_DATE", nullable = false, length = 7)
	private Date createdDate;
	
	public DBUser() {
		
	}
	
	public DBUser(int userId, String username, String createdBy, Date createdDate) {
		this.userId = userId;
		this.username = username;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
