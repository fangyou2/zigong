/***********************************************************************
 * Module:  Resourse.java
 * Author:  Administrator
 * Purpose: Defines the Class Resourse
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.*;
import java.util.*;

/**项目
 * 资源model
 */
//@Entity
public class Resourse {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int resourseId;
   private String resourseName;
   private String resourseUrl;
   @ManyToOne
   private Mail mail;

   public Resourse() {
   }

   public Resourse(String resourseName, String resourseUrl, Mail mail) {
      this.resourseName = resourseName;
      this.resourseUrl = resourseUrl;
      this.mail = mail;
   }

   public int getResourseId() {
      return resourseId;
   }

   public void setResourseId(int resourseId) {
      this.resourseId = resourseId;
   }

   public String getResourseName() {
      return resourseName;
   }

   public void setResourseName(String resourseName) {
      this.resourseName = resourseName;
   }

   public String getResourseUrl() {
      return resourseUrl;
   }

   public void setResourseUrl(String resourseUrl) {
      this.resourseUrl = resourseUrl;
   }

   public Mail getMail() {
      return mail;
   }

   public void setMail(Mail mail) {
      this.mail = mail;
   }
}