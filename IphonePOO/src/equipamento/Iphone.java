package equipamento;
import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página internet");
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando aba na página internet");
    };
    public void atualizarPagina(){
        {
            System.out.println("Atualizando página internet");
        };
    };
    public void tocar () {
        System.out.println("Tocando música");
    };
    public void pausar (){
        System.out.println("Pausanod música");
    };
    public void selecionarMusica (String musica){
        System.out.println("Tocando a música " + musica);
    };
    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    };
    public void atender(){
        System.out.println("Atendendo a chamada...");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Ouvindo a mensagem de voz selecionada");
    };


}
