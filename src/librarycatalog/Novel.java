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
public class Novel extends Book {
    
        
    private String name;
    private short pages;
    
    private final String definition = " Of type";
    
    public Novel(){
    
        name = "Mystery";
        pages = 95;
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
