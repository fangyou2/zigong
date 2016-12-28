/***********************************************************************
 * Module:  Premission.java
 * Author:  Administrator
 * Purpose: Defines the Class Premission
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Premission {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int premissionId;
   private String premissionName;

   public Premission() {
   }

   public Premission(String premissionName) {
      this.premissionName = premissionName;
   }

   public int getPremissionId() {
      return premissionId;
   }

   public void setPremissionId(int premissionId) {
      this.premissionId = premissionId;
   }

   public String getPremissionName() {
      return premissionName;
   }

   public void setPremissionName(String premissionName) {
      this.premissionName = premissionName;
   }
}