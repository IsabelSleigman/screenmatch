package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        var favorito = new Filme("The Matrix", 1999);
        favorito.avalia(6);
        var outro = new Filme("John Wick", 2014);
        outro.avalia(1);
        var serie = new Serie("La Casa de Papel", 2017);

        var listaDeAssistidos = new ArrayList<Titulo>();
        listaDeAssistidos.add(favorito);
        listaDeAssistidos.add(outro);
        listaDeAssistidos.add(serie);

        System.out.println("Tamanha da lista: " + listaDeAssistidos.size());
        System.out.println("Primeiro filme: " + listaDeAssistidos.get(0).getNome());

        listaDeAssistidos.forEach(filmeOuSerie -> {
            System.out.println(filmeOuSerie.getNome());
            // Não é o mais correto a se fazer, apenas um exemplo.
            if(filmeOuSerie instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        });

        //exemplo de outra forma com forEach
        listaDeAssistidos.forEach(System.out::println);

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Isabel");
        buscaPorArtista.add("Felipe");
        buscaPorArtista.add("Gabriel");

        System.out.println("Sem ordenar: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Ordenada: " + buscaPorArtista);

        Collections.sort(listaDeAssistidos);

        System.out.println("Ordenando por Nome: " + listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por Ano: " + listaDeAssistidos);



    }

}
