package com.oracle.mapper;

import java.util.List;

import com.oracle.entity.AccountInfo;

public interface AccountInfoMapper {
	/**
	 * 查询所有的数据
	 * @return
	 */
	List<AccountInfo> queryAllAccountInfo();
	
	/**
	 * 批量插入数据
	 * 
	 * @param accountInfoList
	 * @return
	 */
	int batchInsertAccountInfo(List<AccountInfo> accountInfoList);
	
	/**
	 * 批量插入数据，使用Oracle的序列获取唯一键
	 * 
	 * @param accountInfoList
	 * @return
	 */
	int batchInsertAccountInfoUseSeq(List<AccountInfo> accountInfoList);
	
	/**
	 * 批量插入数据，使用Oracle的序列获取唯一键
	 * 
	 * @param accountInfoList
	 * @return
	 */
	int insertOne(AccountInfo accountInfo);
}
