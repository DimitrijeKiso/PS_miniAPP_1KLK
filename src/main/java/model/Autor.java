/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Dimitrije
 */
public class Autor {
    
    private String ime;
    private String prezime;
    private int datumRodjenja;
    private String biografija;

    public Autor() {
    }

    public Autor(String ime, String prezime, int datumRodjenja, String biografija) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.biografija = biografija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(int datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    
    @Override
    public String toString() {
        return "Autor{" + "ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja + ", biografija=" + biografija + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.datumRodjenja != other.datumRodjenja) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        return Objects.equals(this.prezime, other.prezime);
    }
    
    
    
    
    
    
    
    
    
    
}
