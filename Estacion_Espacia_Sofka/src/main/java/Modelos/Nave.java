package Modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carol
 */
public class Nave {

    //Declaración de variables.
    private int id;
    private int tipoNave = 0;
    private String nombreNave = "";
    private double empujeNave = 0;
    private double pesoNave = 0;
    private int tipoCombustible = 0;
    private int pais = 0;

    //Constructor sin parametros.
    public Nave() {
        tipoNave = 1;
        nombreNave = "Saturno V";
        empujeNave = 3500;
        pesoNave = 2900;
        tipoCombustible = 1;
        pais = 1;
    }
    //Constructor con parametros.
    public Nave(int tipoNave, double empuje, double pesoNave, int tipoCombustible, int pais) {
        this.tipoNave = tipoNave;
        this.empujeNave = empuje;
        this.pesoNave = pesoNave;
        this.tipoCombustible = tipoCombustible;
        this.pais = pais;
    }
    //Set y Get de las variables.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(int tipoNave) {
        this.tipoNave = tipoNave;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public double getEmpujeNave() {
        return empujeNave;
    }

    public void setEmpujeNave(double empujeNave) {
        this.empujeNave = empujeNave;
    }

    public double getPesoNave() {
        return pesoNave;
    }

    public void setPesoNave(double pesoNave) {
        this.pesoNave = pesoNave;
    }

    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public String TipodeNave(int dato) {
        String nave = "";
        if (dato == 1) {
            nave = "Vehiculo Lanzadera";
        } else {
            if (dato == 2) {
                nave = "No Tripuladas";
            } else {
                if (dato == 3) {
                    nave = "Tripuladas";
                } else {
                    if (dato >= 4) {
                        nave = "Tipo de Nave no valido";
                    } 
                }
            }
        }
        return nave;
    }
    
    public String TipoNave(){
        String nave = "";
        if(getTipoNave() == 1){
            nave = "Vehiculo Lanzadera";
        }else{
            if(getTipoNave() == 2){
                nave = "No tripuladas";
            }else{
                if(getTipoNave() == 3){
                    nave = "Tripuladas";
                }else{
                    if(getTipoNave() >= 4){
                        nave = "Tipo de Nave no valido";
                    }
                }
            }
        }
        return nave;
    }
    
}
