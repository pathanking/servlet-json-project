package com.hsb.service;

import java.util.List;

import com.hsb.model.User;

public class UserService {

	public static List<User> getUsers() {
		return List.of(new User("rama", "ra@email.com"), new User("anu", "an@email.com"));

	}

}
