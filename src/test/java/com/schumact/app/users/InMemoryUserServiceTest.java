package com.schumact.app.users;

import static com.google.common.truth.Truth.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public final class InMemoryUserServiceTest {

  @Test
  public void testHelloWorld() {
    String hello = "hello world!";
    assertThat(hello).isEqualTo("hello world!");
  }

  @Test
  public void testBasicFunctionality() {
    InMemoryUserService userService = new InMemoryUserService();

    userService.AddUser("testUser", "password");
    assertThat(userService.Authenticate("testUser", "wrong")).isEqualTo(false);
    assertThat(userService.Authenticate("testUser", "password")).isEqualTo(true);
  }
}
