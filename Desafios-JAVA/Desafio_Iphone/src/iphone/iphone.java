package iphone;

import reprodutormusical.ReprodutorMusical;
import aparelhotelefonico.AparelhoTelefonico;
import navegadornainternet.NavegadorInternet;

public class iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;
    
    public iphone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }
    
    public void tocarMusica() {
        reprodutorMusical.tocar();
    }
    
    public void pausarMusica() {
        reprodutorMusical.pausar();
    }
    
    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }
    
    public void ligar() {
        aparelhoTelefonico.ligar();
    }
    
    public void atenderChamada() {
        aparelhoTelefonico.atender();
    }
    
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }
    
    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }
    
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }
    
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
