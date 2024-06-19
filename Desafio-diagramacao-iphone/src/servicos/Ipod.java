package servicos;
import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

    public void tocar(){
        System.out.println("tocando musica");

    }
    public void pausar(){
        System.out.println("pausando musica");

    }
    public void selecionarMusica(String musica){
        System.out.println("musica selecionada " + musica);

    }
   
}