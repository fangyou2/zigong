/***********************************************************************
 * Module:  User.java
 * Author:  Administrator
 * Purpose: Defines the Class User
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int userId;
   private String userName;
   private String userPassword;
   private String userPhone;
   private String userAddress;
   private Set<Mail> mail;
   private Set<Log> log;
   private Set<Site> site;
   private Set<Groups> group;

   public User() {
   }

   public User(int userId, String userName, String userPassword, String userPhone, String userAddress, Set<Mail> mail, Set<Log> log, Set<Site> site, Set<Groups> group) {
      this.userId = userId;
      this.userName = userName;
      this.userPassword = userPassword;
      this.userPhone = userPhone;
      this.userAddress = userAddress;
      this.mail = mail;
      this.log = log;
      this.site = site;
      this.group = group;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserPassword() {
      return userPassword;
   }

   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }

   public String getUserPhone() {
      return userPhone;
   }

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

   public String getUserAddress() {
      return userAddress;
   }

   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   public Set<Mail> getMail() {
      return mail;
   }

   public void setMail(Set<Mail> mail) {
      this.mail = mail;
   }

   public Set<Log> getLog() {
      return log;
   }

   public void setLog(Set<Log> log) {
      this.log = log;
   }

   public Set<Site> getSite() {
      return site;
   }

   public void setSite(Set<Site> site) {
      this.site = site;
   }

   public Set<Groups> getGroup() {
      return group;
   }

   public void setGroup(Set<Groups> group) {
      this.group = group;
   }
}