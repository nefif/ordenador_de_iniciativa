/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadordeiniciativa;

/**
 *
 * @author nefif
 */
public class Personagem {
    private String nome;
    private int nivel;
    private int iniciativa;
    private String classe;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the iniciativa
     */
    public int getIniciativa() {
        return iniciativa;
    }

    /**
     * @param iniciativa the iniciativa to set
     */
    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    /**
     * @return the classe
     */
    public String getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public String exibirJogador(){
    
        String v = "";
        
        v += "Nome: " + getNome() + "/ ";
        v += "Classe: " + getClasse() +"/ " ;
        v += "Nivel: "+ getNivel() +"/ " ;
        v += "Iniciativa: " + getIniciativa()+ "/ ";
        
        
    return v;
    }
}
