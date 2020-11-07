package com.export;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.InvalidAttributeValueException;

import com.export.domain.Relatorio;
import com.export.service.GeradorRelatorio;
import com.export.teste.Pessoa;

public class Main {

	public static void main(String[] args) {
		try {
			
			
			List<Relatorio> dados = new ArrayList<Relatorio>();
			
			dados.add(new Pessoa("Jerffeson", 1.66));
			dados.add(new Pessoa("Pedro", 30));
			dados.add(new Pessoa("Neto", 20));
			
		
			new GeradorRelatorio().gerar(dados);
			
		} catch (InvalidAttributeValueException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
