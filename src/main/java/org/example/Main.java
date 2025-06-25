package org.example;

public class Main {
    public static void main(String[] args) {
        Smartphone celular = new Smartphone();

        celular.selecionarMusica("Imagine Dragons - Believer");
        celular.tocar();
        celular.pausar();

        celular.ligar("11999998888");
        celular.atender();
        celular.iniciarCorreioVoz();

        celular.exibirPagina("https://www.google.com");
        celular.adicionarNovaAba();
        celular.atualizarPagina();

    }
}