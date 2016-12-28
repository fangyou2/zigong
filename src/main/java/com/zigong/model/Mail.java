/***********************************************************************
 * Module:  Mail.java
 * Author:  Administrator
 * Purpose: Defines the Class Mail
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Mail {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   public int mailId;
   public String mailType;
   public String mailTitle;
   public Date mailTime;
   public boolean mailRead;
   public String mailRemark;
//   public Set<Resourse> resourse;
//   public Set<User> user;
//   public Set<Box> box;

   public Mail() {
   }

   public Mail(String mailType, String mailTitle, Date mailTime, boolean mailRead, String mailRemark, Set<Resourse> resourse, Set<User> user, Set<Box> box) {
      this.mailType = mailType;
      this.mailTitle = mailTitle;
      this.mailTime = mailTime;
      this.mailRead = mailRead;
      this.mailRemark = mailRemark;
//      this.resourse = resourse;
//      this.user = user;
//      this.box = box;
   }

   public int getMailId() {
      return mailId;
   }

   public void setMailId(int mailId) {
      this.mailId = mailId;
   }

   public String getMailType() {
      return mailType;
   }

   public void setMailType(String mailType) {
      this.mailType = mailType;
   }

   public String getMailTitle() {
      return mailTitle;
   }

   public void setMailTitle(String mailTitle) {
      this.mailTitle = mailTitle;
   }

   public Date getMailTime() {
      return mailTime;
   }

   public void setMailTime(Date mailTime) {
      this.mailTime = mailTime;
   }

   public boolean isMailRead() {
      return mailRead;
   }

   public void setMailRead(boolean mailRead) {
      this.mailRead = mailRead;
   }

   public String getMailRemark() {
      return mailRemark;
   }

   public void setMailRemark(String mailRemark) {
      this.mailRemark = mailRemark;
   }

//   public Set<Resourse> getResourse() {
//      return resourse;
//   }
//
//   public void setResourse(Set<Resourse> resourse) {
//      this.resourse = resourse;
//   }
//
//   public Set<User> getUser() {
//      return user;
//   }
//
//   public void setUser(Set<User> user) {
//      this.user = user;
//   }
//
//   public Set<Box> getBox() {
//      return box;
//   }
//
//   public void setBox(Set<Box> box) {
//      this.box = box;
//   }
}