package com.zigong.dao;

import com.zigong.model.Box;
import com.zigong.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public interface BoxDao extends JpaRepository<Box, Integer> {
}
