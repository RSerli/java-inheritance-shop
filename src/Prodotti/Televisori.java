package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Televisori extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */

    private int Dimensioni;

    private Boolean isSmart;

    /*
    * COSTRUTTORE
    */

    public Televisori(String nome, String marca, Float prezzo, int iva, int dimenesioni, Boolean isSmart) {
       super(nome, marca, prezzo, iva);
       this.Dimensioni = dimenesioni;
       this.isSmart = isSmart;
    }

    /*
     * MODULI
     */


     
}
