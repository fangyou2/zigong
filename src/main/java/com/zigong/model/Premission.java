/***********************************************************************
 * Module:  Premission.java
 * Author:  Administrator
 * Purpose: Defines the Class Premission
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.*;
import java.util.*;

/**
 * 许可model
 */
@Entity
public class Premission {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int premissionId;
   private String premissionName;
   @ManyToMany(cascade=CascadeType.ALL,mappedBy = "premission",fetch = FetchType.LAZY)
   private Set<Groups> groups;

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

   public Set<Groups> getGroups() {
      return groups;
   }

   public void setGroups(Set<Groups> groups) {
      this.groups = groups;
   }
}