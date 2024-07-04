package iphone.rodaroda;

import org.jcp.xml.dsig.internal.dom.ApacheTransform;

import iphone.aparelho.Aparelho;
import iphone.navegador.Chrome;
import iphone.reprodutormusical.Spotify;

public class Testando {
    public static void main(String[] args) {
        Spotify reprodutormusical = new Spotify();
        Chrome navegadorinternet = new Chrome();
        Aparelho aparelhoetelefonico = new Aparelho();
        reprodutormusical.tocar();
        navegadorinternet.adicionarNovaAba();
        aparelhoetelefonico.ligar();
    }
}
