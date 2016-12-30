package com.zigong.service;

import com.zigong.dao.FileDao;
import com.zigong.model.Box;
import com.zigong.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class FileService {
    @Autowired
    private FileDao fileDao;

    public boolean addFile(File file){
        boolean result=false;
        if(fileDao.save(file)!=null){
            result=true;
        }
        return result;
    }
    public boolean deleteFile(int id){
        fileDao.delete(id);
        return true;
    }
    public File getFile(int id){
        return fileDao.getFileByFileId(id);
    }
    public Set<File> getFiles(Box box){
        return fileDao.getFileByBox(box);
    }
}
