package iphone.navegador;

public class Chrome implements NavegadorInternet{
    public void exibirPagina(){
        System.out.println("Exibindo página");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }
}
