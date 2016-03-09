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
		
		Iterator<Row> itr = readIterator(); // ��ñ����� �ĵ�����
		Row row = null; // �ж���
		int index = 0;// ������

		// the first row is ommited for it stores column index
		if (itr.hasNext()) {
			row = itr.next();
		}
		// other rows stores time series data
		while (itr.hasNext()) {
			int j = 0;
			row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator(); // ����ÿ�е�Ԫ��ĵ�����
			
			Cell cell = null; 
			// the first column is ommited for it stores row index
			if(cellIterator.hasNext())
				cell = cellIterator.next();

			while (cellIterator.hasNext()) {
				cell = cellIterator.next();
				ClusterData.items[index][j++] = cell.getNumericCellValue();  
			}// һ�����ݶ�ȡ���

			index++;			
		} // �����ж�ȡ���
	}

	// ��ȡ������ ������
	final Iterator<Row> readIterator() {
		Iterator<Row> itr = null;
		try {
			File excel = new File(this.dataPath);
			FileInputStream fis = new FileInputStream(excel);
			// ����������
			XSSFWorkbook book = new XSSFWorkbook(fis);
			// �����������µĵ�һҳֽ��
			XSSFSheet sheet = book.getSheetAt(0);

			// ֽ�ŵĵ����������ڱ�����
			itr = sheet.iterator();
			// Iterating over Excel file in Java

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return itr;
	}
}
