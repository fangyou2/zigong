/***********************************************************************
 * Module:  Log.java
 * Author:  Administrator
 * Purpose: Defines the Class Log
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.*;
import java.util.*;

@Entity
public class Log {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int logId;
   private String logTitle;
   private String logContent;
   @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
   @JoinColumn(name = "box")
   private Box box;

   @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
   @JoinColumn(name = "user")
   private User user;

   public Log() {
   }

   public Log(String logTitle, String logContent, User user, Box box) {
      this.logTitle = logTitle;
      this.logContent = logContent;
      this.user = user;
      this.box = box;
   }

   public int getLogId() {
      return logId;
   }

   public void setLogId(int logId) {
      this.logId = logId;
   }

   public String getLogTitle() {
      return logTitle;
   }

   public void setLogTitle(String logTitle) {
      this.logTitle = logTitle;
   }

   public String getLogContent() {
      return logContent;
   }

   public void setLogContent(String logContent) {
      this.logContent = logContent;
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public Box getBox() {
      return box;
   }

   public void setBox(Box box) {
      this.box = box;
   }

}