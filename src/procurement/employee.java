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
 * @author MAHNOOR SHAD
 */
public class employee {
    private String name;
    private String cnic;
    private String phoneNumber;
    public employee(String name,String cnic, String phoneNumber)
    {
        this.name = name;
        this.cnic = cnic;
        this.phoneNumber = phoneNumber;
    }
    

    public String getCnic() {
        return cnic;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    void saveEmployee()
    {
        try {      
            FileWriter save = new FileWriter("employee.txt",true);
            
            save.write(this.getName());
//              System.out.println("1");
            save.write(",");
            save.write(this.getCnic());
            save.write(",");
            save.write(this.getPhoneNumber());
            save.write("\n");
          
            save.flush();
            save.close();
            JOptionPane.showMessageDialog(null,"Data of employee has been saved");
        } catch (IOException ex) {
            Logger.getLogger(OwnerTab.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Invalid Attemt");
        }
    }
    
    
}
