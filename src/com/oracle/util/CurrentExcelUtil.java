package com.oracle.util;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;

import com.oracle.entity.AccountInfo;

public class CurrentExcelUtil {
	public static List<AccountInfo> excel(int sheet, String fileName)throws Exception{
		InputStream inputStream = Resources.getResourceAsStream(fileName);
		List<AccountInfo> list = ExcelToolsImport.excelImport(inputStream, AccountInfo.class,sheet);
		return list;
	}
}
