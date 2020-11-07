package com.export.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import javax.naming.directory.InvalidAttributeValueException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.export.domain.CampoRelatorio;
import com.export.domain.Relatorio;


public class GeradorRelatorio {

	public void gerar (List<Relatorio> dados) throws InvalidAttributeValueException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		
		validarDados(dados);

		FileOutputStream fos = new FileOutputStream(new File("relatorio.xls"));
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Relatorio");
		
		int coluna = 0;
		int linha = 0;
		
		HSSFRow row;
		
		Class<?> clazz = dados.get(0).getClass();
		
		for (Relatorio d : dados) {
			row = sheet.createRow(linha);
			
			for (Method method : clazz.getDeclaredMethods()) {
				if(method.isAnnotationPresent(CampoRelatorio.class)) {
					if (method.invoke(d) != null) {
						row.createCell(coluna).setCellValue(method.invoke(d).toString() );
					}
					
				}
				coluna++;
			}
			linha++;
			coluna =0;
		
		}
		
		
		workbook.write(fos);
		fos.flush();
		fos.close();
	}
	

	
	
	
	
	
	
	

	private void validarDados(List<Relatorio> dados) throws InvalidAttributeValueException {
		
		if (Objects.isNull(dados)) {
			throw new InvalidAttributeValueException();
		}
		
		if (dados.isEmpty()) {
			throw new InvalidAttributeValueException();
		}
		
	}
	
}
