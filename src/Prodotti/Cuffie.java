package Prodotti;

import ProdottoGenerale.ProdottoGenerale;

public class Cuffie extends ProdottoGenerale{
    /*
     * ATTRIBUTI
     */
    private String Colore;

    private String TipoConnessione;

    /*
     * COSTRUTTORE
     */

    public Cuffie(String nome, String marca, Float prezzo, String colore, String tipoConnessione) {
        super(nome, marca, prezzo);
        this.Colore = colore;
        this.TipoConnessione = tipoConnessione;
    }

    /*
     * MODULI
     */

    @Override 
    public String toString(){
      return ("PREZZO: "+ this.Prezzo + " CUFFIE:" + this.Nome + " MARCA: " + this.Marca );
    }
    
}
