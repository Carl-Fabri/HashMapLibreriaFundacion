/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Book;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Fabricio
 */
public class TiendaLibrosController implements ITiendaLibrosInterface {
    
    HashMap<String, Book> miHashMap = new HashMap<>();
    
    public TiendaLibrosController() {
        miHashMap = new HashMap<>();
    }
    
    public void loadDefaultBooks(){
        String author = "Gabriel Garcia Marquez";
        String title = "Cien años de soledad";
        String editorial = "Seix Barral";
        
        insertBook(author,title,editorial);
    }
    
    public void insertBook(String author, String title, String editorial){
        // Extraer los primeros dos caracteres y convertirlos a minúsculas
        String authorCode = author.toLowerCase().trim();
        String titleCode = title.toLowerCase().trim();
        String editorialCode = editorial.toLowerCase().trim();
        String code = authorCode + titleCode + editorialCode;
        
        Book nuevoLibro = new Book(code,author,title,editorial );
        miHashMap.put(code,nuevoLibro);   
    }
    
    public void updateBook(String codigo, String author, String title, String editorial){
        miHashMap.remove(codigo);
        insertBook(author,title,editorial);
    }
    
    public void removeBook(String code){
         miHashMap.remove(code);
    }
    
    public HashMap<String, Book> getBookMap() {
        return miHashMap;
    }
}
