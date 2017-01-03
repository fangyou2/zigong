package com.zigong.dao;

import com.zigong.model.Mail;
import com.zigong.model.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * Created by 罗健 on 2016/12/29.
 */
@Component
public  interface  ProjectDao extends JpaRepository<Project, Integer> {

}
