package com.oracle.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.oracle.entity.AccountInfo;
import com.oracle.mapper.AccountInfoMapper;
import com.oracle.util.CurrentExcelUtil;

public class MybatisTest {

	public static void main(String[] args) throws Exception {
		String resource = "config/mybatis-configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sessionFactory.openSession();
		AccountInfoMapper mapper = session.getMapper(AccountInfoMapper.class);
		List<AccountInfo> accountList  = CurrentExcelUtil.excel(0,"data/data.xlsx");
		mapper.batchInsertAccountInfoUseSeq(accountList);
		session.commit();
	}
}
