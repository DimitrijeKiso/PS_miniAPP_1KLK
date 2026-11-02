/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author Dimitrije
 */
public class Controller {
    private List<Knjiga> listaKnjiga;
    private List<Autor> listaAutora;

    private static Controller instance;
    public static Controller getInstance(){
        if (instance == null) {
            instance = new Controller(); 
        }
        return instance;
    }
     
    
    
    
    private Controller() {
        Autor a1 = new Autor("Ivo ", "Andric", 1892, "Biografija");
         Autor a2 = new Autor("Danilo", "Kis", 1935, "Biografija");
          Autor a3 = new Autor("Mesa", "Selimovic", 1910, "Biografija");
          
        Knjiga k1 = new Knjiga(a1,"Na drini cuprija" , "1234567", 1945, Zanr.ROMAN);
         Knjiga k2 = new Knjiga(a2,"Basta,pepeo" , "1234555", 1982, Zanr.ISTORIJSKI);
          Knjiga k3 = new Knjiga(a3,"Tvrdjava" , "1234577", 1970, Zanr.ISTORIJSKI);
          
        
        listaKnjiga = new ArrayList();
        
        listaAutora = new ArrayList<>();
        
        listaKnjiga.add(k1);
        listaKnjiga.add(k2);
        listaKnjiga.add(k3);
        
        listaAutora.add(a1);
         listaAutora.add(a2);
          listaAutora.add(a3);
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }

    public void obrisiKnjigu(int selektovaniRed) {
        listaKnjiga.remove(selektovaniRed);
    }

    public void dodajNovuKnjigu(Knjiga k) {
        listaKnjiga.add(k);
    }

    
    
    
    
    
    
    
    
    
    
}
