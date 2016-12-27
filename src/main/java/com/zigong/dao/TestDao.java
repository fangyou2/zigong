package com.zigong.dao;

import com.zigong.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/12/27.
 */
@Component
public interface TestDao extends JpaRepository<TestModel, Integer> {
    TestModel save(TestModel testModel);
}
