package iphone.aparelho;

public class Aparelho implements AparelhoTelefonico {
    public void ligar(){
      System.out.println("Ligando...");
    }
    public void atender(){
      System.out.println("Atendeu...");
    }
    public void correioVoz() {
      System.out.println("Correio de voz acionado");
    }
}
