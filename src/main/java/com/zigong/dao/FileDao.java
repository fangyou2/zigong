package com.zigong.dao;

import com.zigong.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public interface FileDao extends JpaRepository<File, Integer> {
    public File getFileByFileId(int id);
    public Set<File> getFileByBox(Box box);
}
