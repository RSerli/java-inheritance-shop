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

    public Televisori(String nome, String marca, Float prezzo, int dimenesioni, Boolean isSmart) {
       super(nome, marca, prezzo);
       this.Dimensioni = dimenesioni;
       this.isSmart = isSmart;
    }

    /*
     * MODULI
     */

    @Override
    public String toString(){
      return ("PREZZO: "+ this.Prezzo + " TELEVISORE:" + this.Nome + " MARCA: " + this.Marca );
    }
     
}
