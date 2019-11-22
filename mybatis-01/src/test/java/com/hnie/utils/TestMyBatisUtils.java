package com.hnie.utils;

import com.hniezxc.dao.UserDao;
import com.hniezxc.pojo.User;
import com.hniezxc.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author zxc
 */
public class TestMyBatisUtils {

    @Test
    public void Test1(){
        //获得sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
