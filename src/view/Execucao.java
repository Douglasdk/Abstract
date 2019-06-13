package view;

import javax.swing.JOptionPane;

import model.Professor;


public class Execucao {
	
	public static void main(String[] args) {
	 
	int dis = 0;
	int cur = 0;
	String impressao = "";
	String impressao1 = "";
	
	
	
	Professor professor = new Professor();
	
	professor.setNome(JOptionPane.showInputDialog(null, "Nome"));
	professor.setEndereco(JOptionPane.showInputDialog(null, "Endereco"));
	professor.setBairro(JOptionPane.showInputDialog(null, "Bairro"));
	professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep")));
	professor.setCidade(JOptionPane.showInputDialog(null, "Cidade"));
	professor.setEstado(JOptionPane.showInputDialog(null, "Estado"));
	professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Rg")));
	professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Cpf")));

	try {
		 dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui? "));
		String disciplinas [] = new String [100];
		for (int i = 0; i < dis; i++ ) {
			disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);
			
		}
		professor.setDisciplinas(disciplinas);
	} catch (Exception e) {
		e.printStackTrace();

	}
	try {
		 cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui? "));
		String cursos [] = new String[100];
		for (int i = 0; i < cur; i++) {
			cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso " + i);
			
		}
		for (int j = 0; j < dis; j++) {
			impressao1 = impressao1 + professor.getCursos();
		}
		for (int j = 0; j < cur; j++) {
			impressao = impressao + professor.getDisciplinas();
		}
		
		
		professor.setCursos(cursos);
		
		JOptionPane.showMessageDialog(null,professor.getnome() +  "\n" + professor.getEndereco() + "\n" + professor.getBairro() + "\n" + professor.getCep() + "\n" + professor.getCidade()  + "\n" + professor.getEstado() + "\n" + professor.getRg()  + "\n" + professor.getCpf () );
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
