/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Knjiga;

/**
 *
 * @author Dimitrije
 */
public class ModelTabele extends AbstractTableModel {

    private List<Knjiga> lista;
    private final String[] kolona = {"Autor","Naslov","ISBN","Godina izdanja","Zanr"};
    
    public ModelTabele(List<Knjiga> listaKnjiga){
    this.lista = listaKnjiga;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolona.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Knjiga k = lista.get(rowIndex);
        switch (columnIndex) {
            
            case 0:
                return k.getAutor();
            case 1:
                return k.getNaslov();
            case 2: 
                return k.getISBN();
            case 3: 
                return k.getGodinaIzdanja();
            case 4: 
                return k.getZanr();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolona[column];
    }

    void osveziTabelu() {
        fireTableDataChanged();
    }

   

    

    
}
















