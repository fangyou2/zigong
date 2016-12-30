/***********************************************************************
 * Module:  File.java
 * Author:  Administrator
 * Purpose: Defines the Class File
 ***********************************************************************/
package com.zigong.model;
import javax.persistence.*;
import java.util.*;

@Entity
public class File {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int fileId;
   private String fileName;
   private String fileUrl;

   @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
   @JoinColumn(name = "box")
   private Box box;

   public File() {
   }

   public File(String fileName, String fileUrl, Box box) {

      this.fileName = fileName;
      this.fileUrl = fileUrl;
      this.box = box;
   }

   public int getFileId() {
      return fileId;
   }

   public void setFileId(int fileId) {
      this.fileId = fileId;
   }

   public String getFileName() {
      return fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName;
   }

   public String getFileUrl() {
      return fileUrl;
   }

   public void setFileUrl(String fileUrl) {
      this.fileUrl = fileUrl;
   }

   public Box getBox() {
      return box;
   }

   public void setBox(Box box) {
      this.box = box;
   }
}