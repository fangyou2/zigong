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
    //    根据类型指定查询
    Set<Project> findByProjectXmfl(String type);
    //    根据id指定查询
    Project findByProjectNumber(Integer id);
    //    根据日期和所在区县查询所有
    Set<Project> findByProjectSzqxAndProjectBssjLike(String add,String date);

}
