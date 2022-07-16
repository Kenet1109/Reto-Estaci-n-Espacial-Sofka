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
public class VehiculosLanzadera extends Nave {

    //Declaración de variables.
    private double tamañoNave = 0;
    private double cargaUtil = 0;

    //Constructor sin parametros.
    public VehiculosLanzadera() {
        tamañoNave = 100;
        cargaUtil = 118;
    }

    //Constructor con parametros.
    public VehiculosLanzadera(double tamañoNave, double cargaUtil) {
        this.tamañoNave = tamañoNave;
        this.cargaUtil = cargaUtil;

    }

    //Set y Get de las variables.
    public double getTamañoNave() {
        return tamañoNave;
    }

    public void setTamañoNave(double tamañoNave) {
        this.tamañoNave = tamañoNave;
    }

    public double getCargaUtil() {
        return cargaUtil;
    }

    public void setCargaUtil(double cargaUtil) {
        this.cargaUtil = cargaUtil;
    }

    //Metodo para trasnformar la variable Pais de tipo Entero a cadena de Caracteres.
    public String Pais() {
        String pa = "";
        if (getPais() == 1) {
            pa = "EEUU";
        } else {
            if (getPais() == 2) {
                pa = "RUSIA";
            } else {
                if (getPais() == 3) {
                    pa = "EUROPA";
                } else {
                    if (getPais() == 4) {
                        pa = "JAPÓN";
                    } else {
                        if (getPais() == 5) {
                            pa = "CHINA";
                        }
                    }
                }
            }
        }
        return pa;
    }

    //Metodo con parametro para trasnformar la variable Pais de tipo Entero a cadena de Caracteres.
    public String Pais(int dato) {
        String pa = "";
        if (dato == 1) {
            pa = "EEUU";
        } else {
            if (dato == 2) {
                pa = "RUSIA";
            } else {
                if (dato == 3) {
                    pa = "EUROPA";
                } else {
                    if (dato == 4) {
                        pa = "JAPÓN";
                    } else {
                        if (dato == 5) {
                            pa = "CHINA";
                        }
                    }
                }
            }
        }
        return pa;
    }

    //Metodo para trasnformar la variable Combustible de tipo Entero a cadena de Caracteres.
    public String Combustible() {
        String combustible = "";
        if (getTipoCombustible() == 1) {
            combustible = "H(liq) + O(liq)";
        } else {
            if (getTipoCombustible() == 2) {
                combustible = "Solido + Queroseno + N(liq)";
            } else {
                if (getTipoCombustible() == 3) {
                    combustible = "Quesoreno + O(liq)";
                } else {
                    if (getTipoCombustible() == 4) {
                        combustible = "C2H8N2 + NO";
                    } else {
                        if (getTipoCombustible() == 5) {
                            combustible = "UDMH + N2=4";
                        } else {
                            combustible = "Combustible No Registrado";
                        }
                    }
                }
            }
        }
        return combustible;
    }

    //Metodo con parametro para trasnformar la variable Combustible de tipo Entero a cadena de Caracteres.
    public String Combustible(int dato) {
        String combustible = "";
        if (dato == 1) {
            combustible = "H(liq) + O(liq)";
        } else {
            if (dato == 2) {
                combustible = "Solido + Queroseno + N(liq)";
            } else {
                if (dato == 3) {
                    combustible = "Quesoreno + O(liq)";
                } else {
                    if (dato == 4) {
                        combustible = "C2H8N2 + NO";
                    } else {
                        if (dato == 5) {
                            combustible = "UDMH + N2=4";
                        } else {
                            combustible = "Combustible No Registrado";
                        }
                    }
                }
            }
        }
        return combustible;
    }
}
