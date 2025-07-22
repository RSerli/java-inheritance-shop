package Carrello;

import Prodotti.Cuffie;
import Prodotti.Smartphone;
import Prodotti.Televisori;
import java.util.Scanner;

public class Carello {
    /*
     * ATTRIBUTI
     */
    private static String[] ListaSpesaUtente = new String[150];
    private static int numeroElementi=0;


    /*
     * METODI
     */

    private Scanner scan = new Scanner(System.in);
    
    private void InCarrelloTelevisore(){
        System.out.println("Ha scelto un televisore!");
        System.out.print("Indicami il nome del dispositivo: ");
        String nomeDispositivo = scan.nextLine();
        System.out.print("Indicami la marca del dispositivo: ");
        String marcaDispositivo = scan.nextLine();
        System.out.print("Indicami i pollici dello schermo del dispositivo: ");
        int dimensioniDispositivo = scan.nextInt();
        System.out.print("Indicami il prezzo del dispositivo: ");
        Float prezzoDispositivo = scan.nextFloat();
        System.out.print("Indicami è smart il dispositivo (digita 1 se lo è): ");
        int SmartDispositivo = scan.nextInt();
        boolean isSmartDispositivo = false;
        if (SmartDispositivo == 1) {
            isSmartDispositivo = true;
        }

        Televisori ProdottoScelto = new Televisori(nomeDispositivo, marcaDispositivo, prezzoDispositivo, dimensioniDispositivo, isSmartDispositivo);
        ListaSpesaUtente[numeroElementi] = ProdottoScelto.toString();
        numeroElementi++;
    }

    private void InCarrelloTSmartphone(){
        System.out.println("Ha scelto uno smartphone!");
        System.out.print("Indicami il nome del dispositivo: ");
        String nomeDispositivo = scan.nextLine();
        System.out.print("Indicami la marca del dispositivo: ");
        String marcaDispositivo = scan.nextLine();
        System.out.print("Indicami il codice IMEI del dispositivo: ");
        String codiceImeiDispositivo = scan.nextLine();
        System.out.print("Indicami la dimensione dellla memoria interna del dispositivo: ");
        int memoriaDispositivo = scan.nextInt();
        System.out.print("Indicami il prezzo del dispositivo: ");
        Float prezzoDispositivo = scan.nextFloat();

        Smartphone ProdottoScelto = new Smartphone(nomeDispositivo, marcaDispositivo, prezzoDispositivo, codiceImeiDispositivo, memoriaDispositivo);
        ListaSpesaUtente[numeroElementi] = ProdottoScelto.toString();
        numeroElementi++;
    } 
    
    private void InCarrelloCuffie(){
        System.out.println("Ha scelto un paio di cuffie!");
        System.out.print("Indicami il nome del dispositivo: ");
        String nomeDispositivo = scan.nextLine();
        System.out.print("Indicami la marca del dispositivo: ");
        String marcaDispositivo = scan.nextLine();
        System.out.print("Indicami il colore del dispositivo: ");
        String coloreDispositivo = scan.nextLine();
        System.out.print("Indicami il prezzo del dispositivo: ");
        Float prezzoDispositivo = scan.nextFloat();
        System.out.print("Indicami il tipo di connessione del dispositivo (-1- Wireless  -2-Cablato): ");
        int connesioneDispositivo = scan.nextInt();
        String tipoConnessione;
        switch (connesioneDispositivo) {
            case 1:
                tipoConnessione = "Wireless";
                break;
            case 2:
                tipoConnessione = "Cablato";
                break;
            default:
                System.out.println("La seguente voce non sarà inserita!");
                tipoConnessione = "";
                break;
        }

        Cuffie ProdottoScelto = new Cuffie(nomeDispositivo, marcaDispositivo, prezzoDispositivo, coloreDispositivo, tipoConnessione);
        ListaSpesaUtente[numeroElementi] = ProdottoScelto.toString();
        numeroElementi++;
    }

     public void main(String[] args) {
        /*
         * VARIABILI
         */

        Boolean isFinished = false;
        Boolean validAnswer;
        int sceltaProdotto;
        int checkFineSpesa;

        /*
         * MAIN FUNCTION
         */

        do { 

            //inserimento di un prodotto nel carrello
            do { 
                System.out.println("\nQuale prodotto volete inserire nel carrello?");
                System.out.println("    - 1 - Televisore");
                System.out.println("    - 2 - Smartphone");
                System.out.println("    - 3 - Cuffie");
                sceltaProdotto = scan.nextInt();
                switch (sceltaProdotto) {
                    case 1:
                        InCarrelloTelevisore();
                        validAnswer = true;
                        break;
                    case 2:
                        InCarrelloTSmartphone();
                        validAnswer = true;
                        break;
                    case 3:
                        InCarrelloCuffie();
                        validAnswer = true;
                        break;
                    default:
                        System.out.println(" --- Errore nell'inserimento della risposta! --- ");
                        validAnswer = false;
                }
            } while (validAnswer == false);

            scan.nextLine(); // rimozione del buffer o newline

            //Controllo se l'user vuole comprare qualcos'altro
            do { 
                System.out.println("\nDesiderate fare altre compere?");
                System.out.println("    - 0 - NO");
                System.out.println("    - 1 - SI");
                checkFineSpesa = scan.nextInt();
                switch (checkFineSpesa) {
                    case 0:
                        isFinished = true;
                        validAnswer = true;
                        break;
                    case 1:
                        isFinished = false;
                        validAnswer = true;
                        break;
                    default:
                        System.out.println(" --- Errore nell'inserimento della risposta! --- ");
                        validAnswer = false;
                }    
            } while (validAnswer == false);  
        } while (isFinished == false);

        // OUTPUT LISTA FINALE
         System.out.println("\n\nSono presenti "+ numeroElementi + " elemnti nel carrello\n");
        System.out.println("\n ----LISTA FINALE----");
        for (int i = 0; i < numeroElementi; i++) {
            System.out.println(" - "+ ListaSpesaUtente[i]);
        }
        System.out.println("\n");
    }
}
