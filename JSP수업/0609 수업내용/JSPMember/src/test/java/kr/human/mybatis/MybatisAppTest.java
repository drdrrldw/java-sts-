package kr.human.mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.human.member.dao.MemberDAOImpl;

public class MybatisAppTest {
	
	static SqlSessionFactory sqlSessionFactory;
	
	@BeforeClass
	public static void  beforeClass() {
		sqlSessionFactory = MybatisApp.getSqlSessionFactory();
	}
	
	
	@Test
	public void getSession() {
		assertNotNull(MybatisApp.getSqlSessionFactory());
	}
	
	@Test
	public void selectByIdx() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			assertEquals(MemberDAOImpl.getInstance().selectByIdx(sqlSession, 1).getUserid(), "root");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	
}

