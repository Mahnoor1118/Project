<<<<<<< Updated upstream
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class products {
     
    private String productname;
    private int productquantity;
    private String company;
    
    public products(String productname, String company)
    {
        this.productname = productname;
        this.company = company;
    }
    public products()
    {
       
    }
//setters
    public void setProductname(String productname) {
        this.productname = productname;
    }
    
    public void setProductquantity(int productquantity) {
        this.productquantity = productquantity;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    //getters
    public String getProductname() {
        return productname;
    }

    public int getProductquantity() {
        return productquantity;
    }

    public String getCompany() {
        return company;
    }
    // methods
    
    
    void save()
    {
        try {
            FileWriter save = new FileWriter(" Products.txt",true);
            save.write(this.getProductname());
            save.write(",");
            save.write(String.valueOf(this.productquantity));
            save.write(",");
            save.write(this.getCompany());
            save.write("\n");
            
            save.flush();
            save.close();
            JOptionPane.showMessageDialog(null, "Product has been saved");
        } catch (IOException ex) {
            Logger.getLogger(products.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Invalid Attempt");

        }
    }
    void Loadlist()
    {
    }
    
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class products {
     
    private String productname;
    private int productquantity;
    private String company;
    
    public products(String productname, String company)
    {
        this.productname = productname;
        this.company = company;
    }
    public products()
    {
       
    }
//setters
    public void setProductname(String productname) {
        this.productname = productname;
    }
    
    public void setProductquantity(int productquantity) {
        this.productquantity = productquantity;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    //getters
    public String getProductname() {
        return productname;
    }

    public int getProductquantity() {
        return productquantity;
    }

    public String getCompany() {
        return company;
    }
    // methods
    
    
    void save()
    {
        try {
            FileWriter save = new FileWriter(" Products.txt",true);
            save.write(this.getProductname());
            save.write(",");
            save.write(String.valueOf(this.productquantity));
            save.write(",");
            save.write(this.getCompany());
            save.write("\n");
            
            save.flush();
            save.close();
            JOptionPane.showMessageDialog(null, "Product has been saved");
        } catch (IOException ex) {
            Logger.getLogger(products.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Invalid Attempt");

        }
    }
    void Loadlist()
    {
    }
    
    
}
>>>>>>> Stashed changes
