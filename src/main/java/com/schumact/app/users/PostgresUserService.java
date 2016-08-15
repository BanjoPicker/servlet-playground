package com.schumact.app.users;

import java.util.List;

import com.schumact.app.UserService;

public class PostgresUserService implements UserService {

	@Override
	public void AddUser(String username, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> usernames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
