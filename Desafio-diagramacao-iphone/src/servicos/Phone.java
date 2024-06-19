package servicos;
import interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

    
    public void ligar(String numero){
        System.out.println("ligando para " + numero);

    }
    @Override
    public void atender(){
        System.out.println("Atendendo");

    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("deixando correio de voz");

    }

  
}