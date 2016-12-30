/***********************************************************************
 * Module:  Box.java
 * Author:  Administrator
 * Purpose: Defines the Class Box
 ***********************************************************************/
package com.zigong.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int boxId;
    private String boxName;
    private String boxPassword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box", fetch = FetchType.LAZY)
    private Set<Mail> mail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box", fetch = FetchType.LAZY)
    private Set<Log> log;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box", fetch = FetchType.LAZY)
    private Set<Site> site;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box", fetch = FetchType.LAZY)
    private Set<File> file;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "box", fetch = FetchType.LAZY)
    private Set<Box> boxs;
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.LAZY)
    @JoinColumn(name = "box")
    private Box box;

    public Box() {
    }

    public Box(String boxName, String boxPassword, Set<Mail> mail, Set<Log> log, Set<Site> site, Set<File> file, Set<Box> boxs, Box box) {
        this.boxName = boxName;
        this.boxPassword = boxPassword;
        this.mail = mail;
        this.log = log;
        this.site = site;
        this.file = file;
        this.boxs = boxs;
        this.box = box;
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

    public Set<File> getFile() {
        return file;
    }

    public void setFile(Set<File> file) {
        this.file = file;
    }

    public Set<Box> getBoxs() {
        return boxs;
    }

    public void setBoxs(Set<Box> boxs) {
        this.boxs = boxs;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
}