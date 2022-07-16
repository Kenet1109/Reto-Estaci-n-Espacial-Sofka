package Modelos;


import Modelos.Nave;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class Tripuladas extends Nave{
    //Declaración de variables.
    private int mision = 0;
    private int capacidadTripulantes = 0;
    private double orbita = 0;
    //Constructor.
    public Tripuladas() {
    }
    //Set y Get de las variables.
    public int getMision() {
        return mision;
    }

    public void setMision(int mision) {
        this.mision = mision;
    }

    public int getCapacidadTripulantes() {
        return capacidadTripulantes;
    }

    public void setCapacidadTripulantes(int capacidadTripulantes) {
        this.capacidadTripulantes = capacidadTripulantes;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }
    //Metodo para trasnformar la variable Pais de tipo Entero a cadena de Caracteres.
    public String Pais(){
        String pa = "";
        if(getPais() == 1){
            pa = "EEUU";
        }else{
            if(getPais() == 2){
                pa = "RUSIA";
            }else{
                if(getPais() == 3){
                    pa = "INTERNACIONAL";
                }else{
                    if(getPais() == 4){
                        pa = "CHINA";
                    }
                }
            }
        }
        return pa;
    }
    //Metodo con parametro para trasnformar la variable Pais de tipo Entero a cadena de Caracteres.
    public String Pais(int dato){
        String pa = "";
        if(dato == 1){
            pa = "EEUU";
        }else{
            if(dato == 2){
                pa = "RUSIA";
            }else{
                if(dato == 3){
                    pa = "INTERNACIONAL";
                }else{
                    if(dato == 4){
                        pa = "CHINA";
                    }
                }
            }
        }
        return pa;
    }
    //Metodo para trasnformar la variable Mision de tipo Entero a cadena de Caracteres.
    public String Mision(){
        String mi = "";
        if(getMision() == 1){
            mi = "Misiones lunares (Apolo, Módulo Lunar, Soyuz)";
        }else{
            if(getMision() == 2){
                mi = "Experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula";
            }else{
                if(getMision() == 3){
                    mi = "Mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos";
                }else{
                    mi = "Mision No Registrada";
                }
            }
        }
        return mi;
    }
    //Metodo con parametro para trasnformar la variable Mision de tipo Entero a cadena de Caracteres.
    public String Mision(int dato){
        String mi = "";
        if(dato == 1){
            mi = "Misiones lunares (Apolo, Módulo Lunar, Soyuz)";
        }else{
            if(dato == 2){
                mi = "Experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula";
            }else{
                if(dato == 3){
                    mi = "Mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos";
                }else{
                    mi = "Mision No Registrada";
                }
            }
        }
        return mi;
    }
    //Metodo para trasnformar la variable Combustible de tipo Entero a cadena de Caracteres.
    public String Combustible(){
        String combustible = "";
        if(getTipoCombustible() == 1){
            combustible = "Solido";
        }else{
            if(getTipoCombustible() == 2){
                combustible = "NO4 + UDMH";
            }else{
                if(getTipoCombustible() == 3){
                    combustible = "Aerozina50** + NO4";
                }else{
                    if(getTipoCombustible() == 4){
                        combustible = "Queroseno + H(liq)";
                    }else{
                        if(getTipoCombustible() == 5){
                            combustible = "NO + Amina";
                        }else{
                            if(getTipoCombustible() == 6){
                                combustible = "N2O4 + UDMH";
                            }else{
                                if(getTipoCombustible() == 7){
                                    combustible = "N2O4 + MMH";
                                }else{
                                    combustible = "Combustible No Registrado";
                                }
                            }
                        }
                    }
                }
            }
        }
        return combustible;
    }
    //Metodo con parametro para trasnformar la variable Combustible de tipo Entero a cadena de Caracteres.
    public String Combustible(int dato){
        String combustible = "";
        if(dato == 1){
            combustible = "Solido";
        }else{
            if(dato == 2){
                combustible = "NO4 + UDMH";
            }else{
                if(dato == 3){
                    combustible = "Aerozina50** + NO4";
                }else{
                    if(dato == 4){
                        combustible = "Queroseno + H(liq)";
                    }else{
                        if(dato == 5){
                            combustible = "NO + Amina";
                        }else{
                            if(dato == 6){
                                combustible = "N2O4 + UDMH";
                            }else{
                                if(dato == 7){
                                    combustible = "N2O4 + MMH";
                                }else{
                                    combustible = "Combustible No Registrado";
                                }
                            }
                        }
                    }
                }
            }
        }
        return combustible;
    }
}
