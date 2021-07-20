package com.star.user.valueobject;

import com.star.user.entity.User;

public class ResponseTemplet {

	
	
	private User user;
	private Department dept;
	
	public ResponseTemplet() {
		super();
		
	}
	public ResponseTemplet(User user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the dept
	 */
	public Department getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	
}
