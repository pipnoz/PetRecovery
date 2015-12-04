/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davideita.petrecovery;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Davide Montorsi
 */
public class NuovoIndirizzo {

    private static final Logger LOG = Logger.getLogger(NuovoIndirizzo.class.getName());

    private String indirizzo;
    private String città;
    private String provincia;
    private int cap;
    private int nr_civico;

    public NuovoIndirizzo(String indirizzo, String città, String provincia, int cap, int nr_civico) {
        this.setIndirizzo(indirizzo);
        this.setNr_civico(nr_civico);
        this.setCap(cap);
        this.setCittà(città);
        this.setProvincia(provincia);

        LOG.log(Level.INFO, "Nuovo Indirizzo: {0}, {1}, {2}, {3}, {4}, {5}", new Object[]{indirizzo, nr_civico, cap, città, provincia});
    }

    /**
     * @return the indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * @param indirizzo the indirizzo to set
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * @return the città
     */
    public String getCittà() {
        return città;
    }

    /**
     * @param città the città to set
     */
    public void setCittà(String città) {
        this.città = città;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the cap
     */
    public int getCap() {
        return cap;
    }

    /**
     * @param cap the cap to set
     */
    public void setCap(int cap) {
        this.cap = cap;
    }

    /**
     * @return the nr_civico
     */
    public int getNr_civico() {
        return nr_civico;
    }

    /**
     * @param nr_civico the nr_civico to set
     */
    public void setNr_civico(int nr_civico) {
        this.nr_civico = nr_civico;
    }

}
