package com.schumact.app.el;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * <p>Misc el functions.</p>
 */
public class Functions {
  public static boolean empty(java.lang.String s) {
    if (s == null) return true;
    else return s.isEmpty();
  }
  
  public static <T extends Comparable<? super T>> List<T> sort(List<T> c) {
	  Collections.sort(c);
	  return c;
  }
  
  public static List<String> envvars() {
	  ArrayList<String> result = new ArrayList<String>();
	  result.addAll(System.getenv().keySet());
	  return result;
  }
  
  public static String getenv(String name) {
	  return System.getenv(name);
  }
}
