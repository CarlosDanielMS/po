/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("A Moreninha", "Joaquim Manuel de Macedo", 1844);
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Livros de Machado de Assis:");
        for (Livro livro : biblioteca.buscarPorAutor("Machado de Assis")) {
            System.out.println(livro);
        }

        System.out.println("Livros com o título 'Dom Casmurro':");
        for (Livro livro : biblioteca.buscarPorTitulo("Dom Casmurro")) {
            System.out.println(livro);
        }

        biblioteca.removerLivro("A Moreninha");

        System.out.println(biblioteca);
    }
}
