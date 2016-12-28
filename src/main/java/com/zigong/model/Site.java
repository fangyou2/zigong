/***********************************************************************
 * Module:  Site.java
 * Author:  Administrator
 * Purpose: Defines the Class Site
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Site {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int siteId;
   private String siteName;
   private String siteUrl;
   private Box box;
   private User user;

   public Site() {
   }

   public Site(String siteName, String siteUrl, Box box, User user) {
      this.siteName = siteName;
      this.siteUrl = siteUrl;
      this.box = box;
      this.user = user;
   }

   public int getSiteId() {
      return siteId;
   }

   public void setSiteId(int siteId) {
      this.siteId = siteId;
   }

   public String getSiteName() {
      return siteName;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteUrl() {
      return siteUrl;
   }

   public void setSiteUrl(String siteUrl) {
      this.siteUrl = siteUrl;
   }

   public Box getBox() {
      return box;
   }

   public void setBox(Box box) {
      this.box = box;
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }
}