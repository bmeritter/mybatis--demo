package com.test.demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ritter on 16-10-17.
 */
public class JDBCUtil {
    public static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            String resource = "mybatis/mybatis.xml";
            InputStream reader = Resources.getResourceAsStream(resource);

            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

    public static void colseSession(SqlSession session){
        if(session != null){
            session.close();
        }
    }
}
