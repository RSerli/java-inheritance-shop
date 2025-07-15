package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Televisori extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */

    protected int Dimensioni;

    protected Boolean isSmart;

    /*
    * COSTRUTTORE
    */

    public Televisori(String nome, String marca, Float prezzo, int iva, int dimenesioni, Boolean isSmart) {
       super(nome, marca, prezzo, iva);
       Dimensioni = dimenesioni;
       this.isSmart = isSmart;
    }

    /*
     * MODULI
     */

    public void showProdotto(){
        System.out.println("Info Prodotto");
        System.out.println("Nome: " + this.Nome);
        System.out.println("Marca: " + this.Marca);
        System.out.println("Prezzo: " + this.Prezzo);
        System.out.println("Pollici: " + this.Dimensioni);
        System.out.println("Smart: " + this.isSmart);
    }


     
}
