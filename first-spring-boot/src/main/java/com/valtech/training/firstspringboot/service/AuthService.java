package com.valtech.training.firstspringboot.service;

import com.valtech.training.firstspringboot.entity.User;
import com.valtech.training.firstspringboot.models.ChangePasswordModel;
import com.valtech.training.firstspringboot.models.RegisterUserModel;

public interface AuthService {

	User createUser(RegisterUserModel registerUserModel);

	boolean changePassword(ChangePasswordModel changePasswordModel);

	void upgradeUseToAdmin(long id);

	void enableUser(long id);

	void disableUser(long id);

}