package com.schumact.app.users;

import java.nio.charset.Charset;
import java.util.HashMap;
import com.schumact.app.UserService;
import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * <p>A simple in-memory list of registered users of this system.</p>
 * 
 * <p>Has no persistence, is thread-safe.</p>
 * @author schumact
 */
public class InMemoryUserService implements UserService {

  public InMemoryUserService() {
    usermap = new HashMap<String,String>();
  }
  
  private String passwordHash(String username, String password) {
    HashFunction hf = Hashing.sha512();
    HashCode hc = hf.newHasher().putString(username, Charsets.UTF_8).hash();
    HashCode hc2 = hf.newHasher().putString(password, Charsets.UTF_8).hash();
	  return(hc.toString() + hc2.toString()); 
  }

  @Override
  public synchronized void AddUser(String username, String password) {
    if (username == null
        || password == null
        || password.length() < 8
        || usermap.get(username) != null) {
      return;
    } else {
    	usermap.put(username, passwordHash(username, password));
    }
  }

  @Override
  public synchronized List<String> usernames() {
    List<String> result = new LinkedList<String>();
    for (String username : usermap.keySet()) {
    	result.add(username);
    }
    return result;
  }
  
  @Override
  public synchronized boolean Authenticate(String username, String password) {
	  if (username == null || password == null) {
		  return false;
	  } 
	  if (passwordHash(username, password).equals(usermap.get(username))) {
		  return true;
	  }
	  return false;
  }

  private HashMap<String, String> usermap;
}
