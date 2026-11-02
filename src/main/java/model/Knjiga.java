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
public class Knjiga {
    
    private Autor autor;
    private String naslov;
    private String ISBN;
    private int godinaIzdanja;
    private Zanr zanr;

    public Knjiga() {
    }

    public Knjiga(Autor autor, String naslov, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.autor = autor;
        this.naslov = naslov;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }
    
    
    
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "autor=" + autor + ", naslov=" + naslov + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + ", zanr=" + zanr + '}';
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
        final Knjiga other = (Knjiga) obj;
        if (!Objects.equals(this.naslov, other.naslov)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
    
    
    

   
    
    
    
    
    
    
}
