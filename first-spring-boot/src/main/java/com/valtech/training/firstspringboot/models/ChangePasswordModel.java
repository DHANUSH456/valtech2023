package com.valtech.training.firstspringboot.models;

public class ChangePasswordModel {
	
	private String username;
	private String oldPassword;
	private String newPassword;
	private String confirmPassword;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

//	public ChangePasswordModel() {
//	}
//	
//	public ChangePasswordModel(String username, String oldPassword, String newPassword, String changePassword) {
//		this.username = username;
//		this.oldPassword = oldPassword;
//		this.newPassword = newPassword;
//		this.changePassword = changePassword;
//	}
//	
}