/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class managerClass {
    List<products> productList = new ArrayList<products>();

    
    
    void loadList()
    {
        
        products p;
        p = new products();
        try{
            
         FileReader fr= new FileReader("Products.txt");
            System.out.println("1");
         BufferedReader br= new BufferedReader(fr);
         String line = br.readLine();
         while (line!=null) {
         
         String []split = line.split(",");
           p = new products();             
            p.setProductname(split[0]);
            p.setProductquantity(Integer.parseInt(split[1]));
            p.setCompany(split[2]);
            this.productList.add(p);     
            line = br.readLine();
        }
        
         
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Enable to find file");
        }
    }
   
    
    
}
