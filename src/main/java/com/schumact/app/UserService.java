package com.schumact.app;

import java.util.List;

/**
 *  <p>Dara Access Object for users of this site.</p>
 */
public interface UserService {

  /**
   * <p>Add a new user to the system.</p>
   *
   *  @param username The username that uniquely identifies this user in our system.
   *  @param password The user's password in raw text. Will be hashed for storage.
   */
  public void AddUser(String username, String password);

  /**
   * <p>Get a list of all usernames in this system.</p>
   */
  public List<String> usernames();
  
  /** ask if this user authenticates with the provided credentials. */
  public boolean Authenticate(String username, String password);

  /**
   * <p>The instance of the user service will be inserted into the app context.</p>
   */
  public static final String APPLICATION_KEY = "com.schumact.app.USER_SERVICE";
}
