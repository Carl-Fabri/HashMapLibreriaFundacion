/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import Model.Book;
import java.util.HashMap;

/**
 *
 * @author Carlos Fabricio
 */
public interface ITiendaLibrosInterface {
    
    void loadDefaultBooks();
    
    void insertBook(String author, String title, String editorial);
    
    void updateBook(String code, String author, String title, String editorial);
    
    void removeBook(String code);
    
    HashMap<String, Book> getBookMap();
}