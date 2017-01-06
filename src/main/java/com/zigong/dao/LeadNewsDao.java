package com.zigong.dao;

import com.zigong.model.lead.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2017/1/6.
 */
@Component
public interface LeadNewsDao extends JpaRepository<News,Integer> {
    News findByNewsPublishTime(String data);
}
