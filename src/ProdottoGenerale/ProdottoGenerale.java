package ProdottoGenerale;

import java.util.Random;

public class ProdottoGenerale {
    /*
     * ATTRIBUTI
     */

    private int Codice;

    protected String Nome;

    protected String Marca;

    protected Float Prezzo;

    private int Iva;

    
    /*
    * COSTRUTTORE 
    */

    Random rand = new Random();

    public ProdottoGenerale(String nome, String marca, Float prezzo) {
        this.Codice = rand.nextInt(10000);
        this.Nome = nome;
        this.Marca = marca;
        this.Prezzo = prezzo;
        this.Iva = 20;
    }

    /*
    * MODULI 
    */

    public String getCodiceNomeProdotto() {
        return (this.Codice + "-" + this.Nome);
    }

    /*
     * GETTERS
     */

    public int getCodice() {
        return Codice;
    }

    /*
     * SETTERS e CUSTOM SETTERS
     */

    public void setNome(String nome) {
        if (nome.length() > 0){
            this.Nome = nome;
        }else{
            System.out.println("Inserire un nome!");
        }
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setPrezzo(Float prezzo) {
        if (prezzo >= 0){
            this.Prezzo = prezzo;
        }else{
            System.out.println("Inserire un prezzo corretto!");
        }

    }

    public void setIva(int iva) {
        if (iva >= 0){
            this.Iva = iva;
        }else{
            System.out.println("Inserire una corretta percentuale!");
        }
    }
}
