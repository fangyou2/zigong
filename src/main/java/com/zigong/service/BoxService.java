package com.zigong.service;

import com.zigong.dao.BoxDao;
import com.zigong.dao.LogDao;
import com.zigong.model.Box;
import com.zigong.model.Log;
import com.zigong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class BoxService {
    @Autowired
    private BoxDao boxDao;

    public boolean addBox(Box box){
        boolean result=false;
        if(boxDao.save(box)!=null){
            result=true;
        }
        return result;
    }
    public boolean deleteBox(int id){
        boxDao.delete(id);
        return true;
    }
}
