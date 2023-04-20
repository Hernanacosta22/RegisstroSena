/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author APRENDIZ
 */
public class Aprendiz {
    int id; 
    int Docuapre,Teleapre;
    String Nombre,Apellido,EmailA;  

    public Aprendiz() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocuapre() {
        return Docuapre;
    }

    public void setDocuapre(int Docuapre) {
        this.Docuapre = Docuapre;
    }

    public int getTeleapre() {
        return Teleapre;
    }

    public void setTeleapre(int Teleapre) {
        this.Teleapre = Teleapre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmailA() {
        return EmailA;
    }

    public void setEmailA(String EmailA) {
        this.EmailA = EmailA;
    }
    
}
