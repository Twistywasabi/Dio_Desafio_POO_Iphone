package estabelecimento;

import equipamento.*;

public class Fabrica {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        celular.selecionarMusica("The The - This is the day");
        celular.tocar();
        celular.pausar();
        celular.ligar("(11)90123-4567");
        celular.atender();
        celular.iniciarCorreioVoz();
        celular.exibirPagina("https://www.dio.me/");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
        
    }
}
