package com.zigong.dao;

import com.zigong.model.File;
import com.zigong.model.Mail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public interface FileDao extends JpaRepository<File, Integer> {
}
