/***********************************************************************
 * Module:  Box.java
 * Author:  Administrator
 * Purpose: Defines the Class Box
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Box {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int boxId;
   private java.lang.String boxName;
   private java.lang.String boxPassword;

   private Set<Mail> mail;
   private Set<Log> log;
   private Set<Site> site;
   private Set<Box> boxB;
   private Set<File> file;
   private Box boxA;

   public Box() {
   }

   public Box(String boxName, String boxPassword, Set<Mail> mail, Set<Log> log, Set<Site> site, Set<Box> boxB, Set<File> file, Box boxA) {

      this.boxName = boxName;
      this.boxPassword = boxPassword;
      this.mail = mail;
      this.log = log;
      this.site = site;
      this.boxB = boxB;
      this.file = file;
      this.boxA = boxA;
   }

   public int getBoxId() {
      return boxId;
   }

   public void setBoxId(int boxId) {
      this.boxId = boxId;
   }

   public String getBoxName() {
      return boxName;
   }

   public void setBoxName(String boxName) {
      this.boxName = boxName;
   }

   public String getBoxPassword() {
      return boxPassword;
   }

   public void setBoxPassword(String boxPassword) {
      this.boxPassword = boxPassword;
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

   public Set<Box> getBoxB() {
      return boxB;
   }

   public void setBoxB(Set<Box> boxB) {
      this.boxB = boxB;
   }

   public Set<File> getFile() {
      return file;
   }

   public void setFile(Set<File> file) {
      this.file = file;
   }

   public Box getBoxA() {
      return boxA;
   }

   public void setBoxA(Box boxA) {
      this.boxA = boxA;
   }
}