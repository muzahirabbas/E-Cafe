/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsb2.cafe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Mushaf Ali
 */
public class serialization {
    void serialization(){
    }
public static void ser(listofdish database){
    try{ 
      FileOutputStream f; 
        f = new FileOutputStream("data.ser",false);
      ObjectOutputStream oos;
        oos = new ObjectOutputStream(f);
      oos.writeObject(database);
      oos.close();
      f.close();
   }catch(IOException ioe){
      System.out.println(ioe);
    }
}   
public static listofdish deser(){
    listofdish object1 = new listofdish();
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file;
        file = new FileInputStream("data.ser");
            ObjectInputStream in;
        in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            object1 = (listofdish)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
   return object1; 
}
}
