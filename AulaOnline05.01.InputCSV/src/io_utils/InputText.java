package io_utils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class InputText {
	
	public static List<Aluno> loadAlunos() {
		
		List<Aluno> alunos = new ArrayList<>();
		
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		try {
			is = new FileInputStream("files/alunos.csv");
			isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			br = new BufferedReader(isr);
			
			String linha;
			while( (linha = br.readLine()) != null ) {
				System.out.println("Linha: (" + linha + ")");
				String[] palavras = linha.split("\\|");
				for(String palavra: palavras) {
					System.out.println("Palavra: (" + palavra + ")");
				}
				String nome = palavras[0];
				int ra = Integer.parseInt(palavras[1]);
				double nota = Double.parseDouble(palavras[2]);
				Aluno aluno = new Aluno(nome, ra, nota);
				System.out.println("Aluno criado: " + aluno);
				alunos.add(aluno);
				
			}
			
			br.close();
			isr.close();
			is.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return alunos;
		
	}

}
