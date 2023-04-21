/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeldao;

import Interfaz.MeAprendiz;
import confi.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.Aprendiz;

/**
 *
 * @author APRENDIZ
 */
public class AprendizDao implements MeAprendiz { 
    
    Conexion co= new Conexion(); 
    Connection cn;
    PreparedStatement pc; 
    ResultSet rs; 
    Aprendiz ape = new Aprendiz();
    
    @Override
    public Aprendiz list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listadoA() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean resgistrar(Aprendiz ap) {  
         String sql="insert into Aprendiz(Docu,NombreA,ApellidoA,EmailA,TelefonoA)values('"+ap.getDocuapre()+"','"+ap.getNombre()+"','"+ap.getApellido()+"','"+ap.getEmailA()+"','"+ap.getTeleapre()+"')";
        try{
         cn=co.getConnection(); 
        pc=cn.prepareStatement(sql); 
        pc.executeUpdate(); 
        
        /*while(rs.next()){ 
            ape.setId(rs.getInt("id")); 
            ape.setDocuapre(rs.getInt("Docu")); 
            ape.setNombre(rs.getString("NombreA")); 
            ape.setApellido(rs.getString("ApellidoA"));  
            ape.setEmailA(rs.getString("EmailA")); 
            ape.setTeleapre(rs.getInt("TelefonoA"));*/
            
        
        
        }catch(Exception el) 
        {
        }
         return false;
    }

    @Override
    public boolean actualizar(Aprendiz ap) {
        
        return false;
        
    }

    @Override
    public boolean eliminar(Aprendiz ap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
