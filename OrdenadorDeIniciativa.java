package ordenadordeiniciativa;

import java.util.Scanner;

public class OrdenadorDeIniciativa {

    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Bem Vindo ao organizador de de iniciativas para aventuras de RPG!"
                + "\n\nQuatos personagens participarão do combate?");

        int quantidade = leTeclado.nextInt();
        int soma = 0;

        //Criação do Array de Objetos Personagem
        Personagem[] personagens = new Personagem[quantidade];

        System.out.println("\nColoque as informações dos personagens: ");

        for (int i = 0; i < personagens.length; i++) {

            Personagem novoJogador = new Personagem();
            personagens[i] = novoJogador;

            System.out.println("\nNome do Personagem " + (i + 1) + ":");
            String v = leTeclado.next();
            personagens[i].setNome(v);

            System.out.println("\nClasse do Personagem " + (i + 1) + ":");
            String v3 = leTeclado.next();
            personagens[i].setClasse(v3);

            System.out.println("\nNivel do Personagem " + (i + 1) + ":");
            int v1 = leTeclado.nextInt();
            personagens[i].setNivel(v1);

            System.out.println("\nValor da Iniciativa " + (i + 1) + ":");
            int v2 = leTeclado.nextInt();
            personagens[i].setIniciativa(v2);

        }

        //Determinar o Nivel dos Jogadores
        for (Personagem personagen : personagens) {
            soma = soma + personagen.getNivel();
        }
        System.out.println("\nO nivel do grupo é: " + Math.round(soma / quantidade));

        //Algoritimo de Ordenação: Bubble Sort
        for (int i = 0; i < personagens.length - 1; i++) {
            if (personagens[i].getIniciativa() > personagens[i + 1].getIniciativa()) {
                Personagem personagemAux = new Personagem();
                personagemAux = personagens[i];
                personagens[i] = personagens[i + 1];
                personagens[i + 1] = personagemAux;
            }
        }
        
        //Implementando elementos na Lista
        Lista novaLista = new Lista(quantidade);
        for (Personagem personagen : personagens) {
            novaLista.listar(personagen);
        }

        System.out.println();

        //Mostrar na tela a lista ordenada
        for (Personagem personagen : personagens) {
            System.out.println(personagen.exibirJogador());
        }

    }
}
        //Impressão de PDF com Lista de Jogadores
        /*Document document = new Document();
        *try {
         *   PdfWriter.getInstance(document, new FileOutputStream("encontro.pdf"));

          *  document.open();
           * document.add(new Paragraph("exemplo"));

       * } catch (DocumentException | FileNotFoundException ex) {
        *    System.out.println("Error: " + ex);
        *} finally {
         *   document.close();
        *}

        *try {
         *   Desktop.getDesktop().open(new File("encontro.pdf"));

        *} catch (IOException ex) {
         *   System.out.println("Error: " + ex);
        *}

         */
