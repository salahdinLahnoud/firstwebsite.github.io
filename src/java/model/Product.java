/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author salahdin
 */
public class Product {

    private String code;
    private String description;
    private double price;
    private String image;
    private int qty;

    public Product() {
    }

    public Product(String code, String description, double price, String image, int qty) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.image = image;
        this.qty = qty;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", description=" + description + ", price=" + price + ", image=" + image + ", qty=" + qty + '}';
    }
    //show List
    public static ArrayList getAll() {

        Database db = new Database();
        ArrayList allproducten = new ArrayList();
        try {
            ResultSet rs = db.executSelect("SELECT * FROM menu");
            while(rs.next()){
            
                Product pr = new Product();
                pr.code = rs.getString(1);
                pr.description = rs.getString(2);
                pr.price = rs.getDouble(3);
                pr.image = rs.getString(4);
                pr.qty = rs.getInt(5);
                allproducten.add(pr);
            }
            
        } catch (Exception e) {
        
            throw new SecurityException(e);
        }

        return allproducten;

    }
    //delete product
    
    //update product
    
    //create product
    
    //search product
    
    public static ArrayList searchProduct(String search)throws SQLException{
    
        
        Database db = new Database();
        ArrayList allproducts = new ArrayList();
        
        try{
        db.executSelect("SELECT FROM menu WHERE code LIKE%" + search+ "%"+
                "OR description LIKE% "+search+"%");
    
        }catch(Exception ex){
        ex.printStackTrace();
        
        }
        
        return allproducts;
        
        }
    
    
    /**
             public static ArrayList SeachStudent(String search)
    {
         DBConnect db = new DBConnect();
         ArrayList allStd=new ArrayList();
         try
         {
             String query="SELECT *"+
                            "FROM `std`"+
                            "WHERE `fullname` LIKE '%"+search+"%'"+
                            "OR `department` LIKE '%"+search+"%'"+
                            "OR `sclass` LIKE '%"+search+"%'"+
                            "OR `hobbies` LIKE '%"+search+"%'";
       ResultSet rs =db.excuteSelect(query);
               
       int i=0;
        while(rs.next())
        {                
            
         StudentInfo st=new StudentInfo();
         st.sid=rs.getInt(1);    
         st.fullName =rs.getString(2);
         st.department =rs.getString(3);
         st.sclass =rs.getString(4);
         st.hobbies =rs.getString(5);
           i++;
           allStd.add(st);
        }
         db.close();
         }catch(Exception ex)
         {
             System.out.print(ex);
         }
        
       return  allStd;
    } 
     
     */
    
    
    

}
