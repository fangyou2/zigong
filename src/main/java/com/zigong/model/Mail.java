/***********************************************************************
 * Module:  Mail.java
 * Author:  Administrator
 * Purpose: Defines the Class Mail
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.*;
import java.util.*;

@Entity
public class Mail {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int mailId;
   private String mailType;
   private String mailTitle;
   private Date mailTime;
   private boolean mailRead;
   private String mailRemark;
   @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
   @JoinColumn(name = "user")
   private User user;

   @OneToMany(cascade=CascadeType.ALL,mappedBy ="mail",fetch = FetchType.LAZY)
   private Set<Resourse> resourse;

   @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
   @JoinColumn(name = "box")
   private Box box;

   public Mail() {
   }

   public Mail(String mailType, String mailTitle, Date mailTime, boolean mailRead, String mailRemark, Set<Resourse> resourse, User user, Set<Box> box) {
      this.mailType = mailType;
      this.mailTitle = mailTitle;
      this.mailTime = mailTime;
      this.mailRead = mailRead;
      this.mailRemark = mailRemark;
//      this.resourse = resourse;
      this.user = user;
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

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }
}