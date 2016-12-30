package com.zigong.service;

import com.zigong.dao.ProjectDao;
import com.zigong.model.project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by 罗健 on 2016/12/29.
 */
@Component
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;
}
