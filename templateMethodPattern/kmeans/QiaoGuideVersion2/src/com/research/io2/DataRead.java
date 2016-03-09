package com.research.io2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.research.pojo2.ClusterData;

/**
 * @author Rong Tang
 * @version 1.0
 * @since 20150911
 */
public class DataRead {
	private String dataPath;

	public DataRead(String dataPath) {
		this.dataPath = ClusterData.dir + dataPath;
	}

	// read data from xlsx to array
	public final void readDataToArray() {
		
		Iterator<Row> itr = readIterator(); // 获得遍历行 的迭代器
		Row row = null; // 行对象
		int index = 0;// 行索引

		// the first row is ommited for it stores column index
		if (itr.hasNext()) {
			row = itr.next();
		}
		// other rows stores time series data
		while (itr.hasNext()) {
			int j = 0;
			row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator(); // 遍历每行单元格的迭代器
			
			Cell cell = null; 
			// the first column is ommited for it stores row index
			if(cellIterator.hasNext())
				cell = cellIterator.next();

			while (cellIterator.hasNext()) {
				cell = cellIterator.next();
				ClusterData.items[index][j++] = cell.getNumericCellValue();  
			}// 一行数据读取完毕

			index++;			
		} // 数据行读取完毕
	}

	// 获取数据行 迭代器
	final Iterator<Row> readIterator() {
		Iterator<Row> itr = null;
		try {
			File excel = new File(this.dataPath);
			FileInputStream fis = new FileInputStream(excel);
			// 创建工作簿
			XSSFWorkbook book = new XSSFWorkbook(fis);
			// 创建工作簿下的第一页纸张
			XSSFSheet sheet = book.getSheetAt(0);

			// 纸张的迭代器，用于遍历行
			itr = sheet.iterator();
			// Iterating over Excel file in Java

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return itr;
	}
}
