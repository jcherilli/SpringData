package com.example.springDataJPA.principal;

import com.example.springDataJPA.model.Artista;
import com.example.springDataJPA.model.TipoArtista;
import com.example.springDataJPA.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {

    private final ArtistaRepository repositorio;
    private Scanner leitura = new Scanner(System.in);

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;

        while (opcao!= 9) {
            var menu = """
                    *** Screen Sound Músicas ***
                    
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                    
                    9 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void pesquisarDadosDoArtista() {
    }

    private void buscarMusicasPorArtista() {
    }

    private void listarMusicas() {
    }

    private void cadastrarMusicas() {
    }

    private void cadastrarArtistas() {
        System.out.println("Informe o nome desse artista: ");
        var nome = leitura.nextLine();
        System.out.println("Informe o tipo desse artista: (solo, dupla ou banda)");
        var tipo = leitura.nextLine();
        TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
        Artista artista = new Artista(nome, tipoArtista);
        repositorio.save(artista);
    }
}
