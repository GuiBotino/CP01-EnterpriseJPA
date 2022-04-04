package br.com.fiap;

import br.com.fiap.entity.Livro;
import br.com.fiap.service.impl.LivroServiceImpl;

public class App {

	public static void main(String[] args) {

		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		
		Livro livro1 = new Livro("Livro 1", "Botino", 10, 2022);
		Livro livro2 = new Livro("Livro 2", "George Orwell", 5, 2021);
		Livro livro3 = new Livro("Livro 3", "Guilherme", 15, 2025);
		
		livroService.inserir(livro1);
		livroService.inserir(livro2);
		livroService.inserir(livro3);
		
		livroService.listar().forEach(System.out::println);
		
		livroService.remover(2L);
		
		livroService.atualizar(livro1);
		livroService.atualizar(livro3);
	}
}
