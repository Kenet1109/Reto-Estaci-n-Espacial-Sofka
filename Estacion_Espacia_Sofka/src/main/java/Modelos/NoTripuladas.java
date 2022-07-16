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
public class NoTripuladas extends Nave{
    //Declaración de variables.
    private int misionPlaneta = 0;
    private int precisancombustible = 0;
    //Constructor.
    public NoTripuladas() {
    }
    //Constructor con parametros.
    
    //Set y Get de las variables.
    public int getMisionPlaneta() {
        return misionPlaneta;
    }

    public void setMisionPlaneta(int misionPlaneta) {
        this.misionPlaneta = misionPlaneta;
    }

    public int getPrecisancombustible() {
        return precisancombustible;
    }

    public void setPrecisancombustible(int precisancombustible) {
        this.precisancombustible = precisancombustible;
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
                    pa = "EUROPA ESA/ASI";
                }else{
                    pa = "Pais No Registrado";
                }
            }
        }
        return pa;
    }
    //Metodo con parakmetro para trasnformar la variable Pais de tipo Entero a cadena de Caracteres.
    public String Pais(int dato){
        String pa = "";
        if(dato == 1){
            pa = "EEUU";
        }else{
            if(dato == 2){
                pa = "RUSIA";
            }else{
                if(dato == 3){
                    pa = "EUROPA ESA/ASI";
                }else{
                    pa = "Pais No Registrado";
                }
            }
        }
        return pa;
}
    //Metodo para trasnformar la variable Combustible de tipo Entero a cadena de Caracteres.
    public String Combustible(){
        String combustible = "";
        if(getTipoCombustible() == 1){
            combustible = "Solido* + Liquido****";
        }else{
            if(getTipoCombustible() == 2){
                combustible = "NH4 + MMH**";
            }else{
                if(getTipoCombustible() == 3){
                    combustible = "N2H4****";
                }else{
                    if(getTipoCombustible() == 4){
                        combustible = "N2H4 + He";
                    }else{
                        if(getTipoCombustible() == 5){
                            combustible = "N(comp) + N2H4";
                        }else{
                            if(getTipoCombustible() == 5){
                                combustible = "PuO2";
                            }else{
                                if(getTipoCombustible() == 6){
                                    combustible = "N2O4 + UDMH";
                                }else{}
                                if(getTipoCombustible() == 7){
                                    combustible = "N2H4*** + Amina";
                                }else{
                                    if(getTipoCombustible() == 8){
                                        combustible = "MMH** + NO";
                                    }else{
                                        if(getTipoCombustible() == 9){
                                            combustible = "N/A";
                                        }else{
                                            combustible = "Combustible No Registrado";
                                        }
                                    }
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
            combustible = "Solido* + Liquido****";
        }else{
            if(dato == 2){
                combustible = "NH4 + MMH**";
            }else{
                if(dato == 3){
                    combustible = "N2H4****";
                }else{
                    if(dato == 4){
                        combustible = "N2H4 + He";
                    }else{
                        if(dato == 5){
                            combustible = "N(comp) + N2H4";
                        }else{
                            if(dato == 5){
                                combustible = "PuO2";
                            }else{
                                if(dato == 6){
                                    combustible = "N2O4 + UDMH";
                                }else{}
                                if(dato == 7){
                                    combustible = "N2H4*** + Amina";
                                }else{
                                    if(dato == 8){
                                        combustible = "MMH** + NO";
                                    }else{
                                        if(dato == 9){
                                            combustible = "N/A";
                                        }else{
                                            combustible = "Combustible No Registrado";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return combustible;
    }
    //Metodo para trasnformar la variable PrecisanCombustible de tipo Entero a cadena de Caracteres.
    public String NecesitaCombustible(){
        String necesita = "";
        if(getPrecisancombustible() == 1){
            necesita = "Si";
        }else{
            if(getPrecisancombustible() == 2){
                necesita = "Celdas Fotovoltaicas";
            }else{
                necesita = "Opción No Registrada";
            }
        }
        return necesita;
    }
    //Metodo con parametros para trasnformar la variable PrecisanCombustible de tipo Entero a cadena de Caracteres.
    public String NecesitaCombustible(int dato){
        String necesita = "";
        if(dato == 1){
            necesita = "Si";
        }else{
            if(dato == 2){
                necesita = "Celdas Fotovoltaicas";
            }else{
                necesita = "Opción No Registrada";
            }
        }
        return necesita;
    }
    //Metodo para trasnformar la variable MisionPlaneta de tipo Entero a cadena de Caracteres.
    public String MisionPlaneta(){
        String mision = "";
        if(getMisionPlaneta() == 1){
            mision = "Satruno y sus lunas";
        }else{
            if(getMisionPlaneta() == 2){
                mision = "Júpiter";
            }else{
                if(getMisionPlaneta() == 3){
                    mision = "Marte";
                }else{
                    if(getMisionPlaneta() == 4){
                        mision = "Mercurio";
                    }else{
                        if(getMisionPlaneta() == 5){
                            mision = "Plutón";
                        }else{
                            if(getMisionPlaneta() == 6){
                                mision = "Urano y Neptuno";
                            }else{
                                if(getMisionPlaneta() == 7){
                                    mision = "Sol";
                                }else{
                                    if(getMisionPlaneta() == 8){
                                        mision = "Venus";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return mision;
    }
    //Metodo con parametro para trasnformar la variable MisionPlaneta de tipo Entero a cadena de Caracteres.
    public String MisionPlaneta(int dato){
        String mision = "";
        if(dato == 1){
            mision = "Satruno y sus lunas";
        }else{
            if(dato == 2){
                mision = "Júpiter";
            }else{
                if(dato == 3){
                    mision = "Marte";
                }else{
                    if(dato == 4){
                        mision = "Mercurio";
                    }else{
                        if(dato == 5){
                            mision = "Plutón";
                        }else{
                            if(dato == 6){
                                mision = "Urano y Neptuno";
                            }else{
                                if(dato == 7){
                                    mision = "Sol";
                                }else{
                                    if(dato == 8){
                                        mision = "Venus";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return mision;
    }
}