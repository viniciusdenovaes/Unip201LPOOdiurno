package io_utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import entity.Aluno;

public class OutputText {
	
	public static void saveAluno(List<Aluno> alunos) {
		
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;
		
		try {
			os = new FileOutputStream("files/alunos1.csv");
			osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
			pw = new PrintWriter(osw, true);
			
			for(Aluno aluno: alunos) {
				pw.println(aluno.getNome()+"|"+aluno.getRa()+"|"+aluno.getNota());
			}
			
			os.close();
			osw.close();
			pw.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
