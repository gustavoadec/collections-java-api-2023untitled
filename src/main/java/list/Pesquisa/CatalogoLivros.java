package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
     public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
     }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
            return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
            Livro livroPorTitulo = null;
            if (!livroList.isEmpty()){
                for (Livro l : livroList){
                    if (l.getTitulo().equalsIgnoreCase(titulo)){
                        livroPorTitulo = l;
                        break;
                    }
                }
            }
            return livroPorTitulo;

        }
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Livro1", "autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro1", "autor 2", 2017);
        catalogoLivros.adicionarLivro("Livro2", "autor 2", 2009);
        catalogoLivros.adicionarLivro("Livro3", "autor 3", 2012);
        catalogoLivros.adicionarLivro("Livro4", "autor 4", 2013);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("autor 4"));

//        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
//        System.out.println(catalogoLivros.pesquisarPorAutor(""));
//
//        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
//       Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015, 2030));
//
//        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("titulo 1"));
//
//        // Exibindo livros por título (caso em que não há livros com o título especificado)
//        System.out.println(catalogoLivros.pesquisarPorTitulo(""));
    }
}
