package Carrello;

import java.util.Scanner;

public class Carello {

    private static String[] ListaSpesaUtente;

    public static void main(String[] args) {
        /*
         * VARIABILI
         */

        Scanner scan = new Scanner(System.in);
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
                        System.out.println("Ha scelto un televisore!");
                        validAnswer = true;
                        break;
                    case 2:
                        System.out.println("Ha scelto uno smartphone!");
                        validAnswer = true;
                        break;
                    case 3:
                        System.out.println("Ha scelto un paio di cuffie!");
                        validAnswer = true;
                        break;
                    default:
                        System.out.println(" --- Errore nell'inserimento della risposta! --- ");
                        validAnswer = false;
                }
            } while (validAnswer == false);

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

    }
}
