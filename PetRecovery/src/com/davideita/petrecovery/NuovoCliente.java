package com.davideita.petrecovery;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Davide Montorsi
 */
public class NuovoCliente {

    private static final Logger LOG = Logger.getLogger(NuovoCliente.class.getName());

    private String nome;
    private String cognome;
    private String cod_fiscale;
    private int telefono;

//    String[] animale = {Anatra, Cane, Coniglio, Criceto, Furetto, Gatto, Iguana, Ragno, Scorpione}
    public void NuovoCliente(String nome, String cognome, String cod_fiscale, int telefono) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setCod_fiscale(cod_fiscale);
        this.setTelefono(telefono);
        LOG.log(Level.INFO, "Nuovo Cliente: {0}, {1}, {2}, {3}", new Object[]{nome, cognome, cod_fiscale, telefono});
    }

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
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the cod_fiscale
     */
    public String getCod_fiscale() {
        return cod_fiscale;
    }

    /**
     * @param cod_fiscale the cod_fiscale to set
     */
    public void setCod_fiscale(String cod_fiscale) {
        this.cod_fiscale = cod_fiscale;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
