package com.zigong.service;

import com.zigong.dao.FileDao;
import com.zigong.dao.LogDao;
import com.zigong.model.Log;
import com.zigong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2016/12/28.
 */
@Component
public class LogService {
    @Autowired
    private LogDao logDao;

    public boolean addLog(Log log){
        boolean result=false;
        if(logDao.save(log)!=null){
            result=true;
        }
        return result;
    }
    public boolean deleteLog(int id){
        logDao.delete(id);
        return true;
    }
    public Log getLog(int id){
        return logDao.getLogByLogId(id);
    }
    public Set<Log> getLogs(User user){
        return logDao.getLogByUser(user);
    }
}
