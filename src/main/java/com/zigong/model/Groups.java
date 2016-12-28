/***********************************************************************
 * Module:  Groups.java
 * Author:  Administrator
 * Purpose: Defines the Class Groups
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Groups {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int groupId;
   private String groupName;
//   private Set<User> user;

   public Groups() {
   }

   public Groups(String groupName, Set<User> user) {
      this.groupName = groupName;
//      this.user = user;
   }

   public int getGroupId() {
      return groupId;
   }

   public void setGroupId(int groupId) {
      this.groupId = groupId;
   }

   public String getGroupName() {
      return groupName;
   }

   public void setGroupName(String groupName) {
      this.groupName = groupName;
   }

//   public Set<User> getUser() {
//      return user;
//   }
//
//   public void setUser(Set<User> user) {
//      this.user = user;
//   }
}