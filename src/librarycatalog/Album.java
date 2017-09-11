/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalog;

/**
 *
 * @author Blo
 */
public class Album extends Book {
    
    private String name;
    private short pages;
    
    private final String definition = " With paper quality";
    
    public Album(){
    
        name = "Eminem's library";
        pages = 88;
    }
    
    public Album(String albumName, short albumPages){
        
        name = albumName;
        pages = albumPages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public short getPages() {
        return pages;
    }
    
    
}
