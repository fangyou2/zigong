package com.zigong.dao;

import com.zigong.model.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/12/30.
 */
@Component
public interface LeadDao extends JpaRepository<Project,Integer> {
    Set<Project> findByProjectXmfl(String type);
    Project findByProjectNumber(Integer id);
}
