package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto " + "e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " Também é um dos que todo mundo esta astá " + "curtindo");
        }
    }
}
