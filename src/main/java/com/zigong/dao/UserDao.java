package com.zigong.dao;

import com.zigong.model.TestModel;
import com.zigong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public interface UserDao extends JpaRepository<User, Integer> {
    public User getUserByUserId(int id);
}
