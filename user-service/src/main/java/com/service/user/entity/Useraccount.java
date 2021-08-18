/**
 * 
 */
package com.service.user.entity;

/**
 * @author danielf
 *
 */
public class Useraccount {

	private String username;
	private String password;
	private String email;

	public Useraccount(String username, String password, String email) {
		// TODO Auto-generated constructor stub

		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Useraccount() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
