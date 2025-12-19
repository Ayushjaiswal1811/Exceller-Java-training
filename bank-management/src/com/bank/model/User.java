package com.bank.model;

import com.bank.util.IDGenerator;

public class User {
  private String UserId;
  private String name;
  private String email;
  private String mobileNumber;
  IDGenerator id = new IDGenerator();
  
  //constructor
  public User( String name, String email, String mobileNumber) {
      this.UserId = id.generateUserID();
      this.name = name;
      this.email = email;
      this.mobileNumber = mobileNumber;
  }
  public String getUserId() {
      return UserId;
  }
  public String getName() {
      return name;
  }
  public String getEmail() {
      return email;
  }
  public String getMobileNumber() {
      return mobileNumber;
  }
  public void setName(String name) {
      this.name = name;
  }
  public void setEmail(String email) {
      this.email = email;
  }
  public void setMobileNumber(String mobileNumber) {
      this.mobileNumber = mobileNumber;
  }


}