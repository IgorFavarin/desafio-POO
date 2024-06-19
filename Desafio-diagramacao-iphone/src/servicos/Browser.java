package servicos;
import interfaces.NavegadorInternet;

public class Browser implements NavegadorInternet {
    
    public void exibirPagina(String url){
        System.out.println("abrindo página " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("nova aba ");
    }

    public void atualizarPagina(){
        System.out.println("pagina atualizada ");
    }
  
   
}