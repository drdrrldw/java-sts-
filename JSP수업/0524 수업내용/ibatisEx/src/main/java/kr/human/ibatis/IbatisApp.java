package kr.human.ibatis;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisApp {
	// 정적멤버는 클래스가 로드 될때 자동으로 메모리에 올라간다.
	private static SqlMapClient sqlMapClient;
	
	// 1줄로 정적멤버를 초기화 할수 없을 때는 정적초기화블록을 이용한다.
	static {
		String resource = "SqlMapConfig.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader (resource);
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 밖에서 사용하기 위해 메서드를 public으로 만든다.
	public static SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}
	
}
