/***********************************************************************
 * Module:  Groups.java
 * Author:  Administrator
 * Purpose: Defines the Class Groups
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.*;
import java.util.*;

@Entity
public class Groups {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int groupId;
   private String groupName;
   @OneToMany(cascade=CascadeType.ALL,mappedBy ="groups",fetch = FetchType.LAZY)
   private Set<User> user;

   @ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
   private Set<Premission> premission;

   public Groups() {
   }

   public Groups(String groupName, Set<User> user) {
      this.groupName = groupName;
      this.user = user;
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

   public Set<User> getUser() {
      return user;
   }

   public void setUser(Set<User> user) {
      this.user = user;
   }

   public Set<Premission> getPremission() {
      return premission;
   }

   public void setPremission(Set<Premission> premission) {
      this.premission = premission;
   }
}