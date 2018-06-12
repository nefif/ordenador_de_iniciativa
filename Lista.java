package ordenadordeiniciativa;

public class Lista {

    private Personagem[] listaJogadores;
    private int qtdElementos;

    public Lista(int qtdJogadores) {
        this.qtdElementos = 0;
        this.listaJogadores = new Personagem[qtdJogadores];
    }

    public Personagem[] getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(Personagem[] listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    public int getQtdElementos() {
        return qtdElementos;
    }

    public void setQtdElementos(int qtdElementos) {
        this.qtdElementos = qtdElementos;
    }

    public void listar(Personagem jogador) {
        aumentarLista();
        this.listaJogadores[this.qtdElementos] = jogador;
        this.qtdElementos++;
    }

    public void remover(String nomeJogador) {
        for (int i = 0; i < this.qtdElementos; i++) {
            if (nomeJogador.equalsIgnoreCase(this.listaJogadores[i].getNome())) {
                this.listaJogadores[i] = null;
            }
        }
    }

    public boolean isFull() {
        return this.listaJogadores.length == this.qtdElementos;
    }

    public void aumentarLista() {
        if (isFull()) {
            int v = this.listaJogadores.length * 2;
            Personagem[] novaLista = new Personagem[v];
            System.arraycopy(this.listaJogadores, 0, novaLista, 0, this.qtdElementos);
            this.listaJogadores = novaLista;
        }
    }
 
}
