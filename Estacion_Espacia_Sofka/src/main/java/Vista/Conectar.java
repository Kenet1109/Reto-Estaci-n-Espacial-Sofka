package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Controlador.ControlDatos;
import Modelos.Nave;
import Modelos.NoTripuladas;
import Modelos.Tripuladas;
import Modelos.VehiculosLanzadera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author carol
 */
public class Conectar {

    public static final String URL = "jdbc:mysq l://localhost:3306/pruebasofka";
    public static final String USER = "root";
    public static final String CLAVE = "";

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysq l.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de la clases y creacioón de objetos de estas.
        Nave nave = new Nave();
        NoTripuladas notripuladas = new NoTripuladas();
        VehiculosLanzadera lanzadera = new VehiculosLanzadera();
        Tripuladas tripuladas = new Tripuladas();
        ControlDatos datos = new ControlDatos();
        Conectar con = new Conectar();
        //Declaración e Inicialización de variables para los menú.
        int Op = 0;
        int Op1 = 0;
        //Validación para el menú infinito.
        while (Op != 3) {
            //Solicitud de Opción del menú.
            Op = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL SIMULADOR DE NAVES SOFKA. " + "\n"
                    + "Selecione una de las siguiente opciones: " + "\n" + "1. Simular Naves. " + "\n" + "2. Inventario." + "\n" + "3. Salir."));
            //Inicialización del menú.
            switch (Op) {
                //Caso 1 del menú
                case 1:
                    //Validación de la opción de menú.
                    while (Op == 1) {
                        //Solicitud del valor para el segundo menú.
                        Op1 = Integer.parseInt(JOptionPane.showInputDialog(" Menú principal, opciones :" + "\n"
                                + "Seleccione el tipo de Nave : " + "\n" + "1. Vehiculo Lanzadera" + "\n" + "2. No Tripuladas" + "\n" + "3. Tripuladas"));
                        nave.setTipoNave(Op1);
                        //Validación de opción menú 2.
                        if (Op1 == 1) {
                            //Solicitud de datos y asignación a variables.
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Nave : ");
                            nave.setNombreNave(nombre);
                            double empuje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del empuje de la Nave (Toneladas): "));
                            nave.setEmpujeNave(empuje);
                            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del peso de la Nave (Toneladas): "));
                            nave.setPesoNave(peso);
                            int combustible = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de combustible : " + "\n" + "1. H(liq) + O(liq)      2. Solido + Queroseno + N(liq)" + "\n"
                                    + "3. Quesoreno + O(liq        4. C2H8N2 + NO" + "\n"
                                    + "5. UDMH + N2=4 "));
                            nave.setTipoCombustible(combustible);
                            int pais = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el pais : " + "\n" + "1. EEUU       2. RUSIA" + "\n"
                                    + "3. EUROPA     4. JAPÓN" + "\n"
                                    + "5. CHINA "));
                            nave.setPais(pais);
                            Double tamaño = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamaño de la Nave (Metros) : "));
                            lanzadera.setTamañoNave(tamaño);
                            Double carga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la carga util de la Nave (Toneladas): "));
                            lanzadera.setCargaUtil(carga);
                            //Mensaje de confirmacion de la captura de los datos.
                            JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente ! ");
                            //Se crean variables para capturar el retorno de los metodos para convertir de enteros a cadenas de caracteres.
                            String dato = nave.TipodeNave(Op1);
                            String dato1 = lanzadera.Combustible(combustible);
                            String dato2 = lanzadera.Pais(pais);
                            //Mensaje que presenta el resultado de la simulación.
                            JOptionPane.showMessageDialog(null, "La simulación da como resultado lo siguiente : " + "\n" + "Tipo de Nave : " + dato + "\n"
                                    + "Nombre de la Nave : " + nave.getNombreNave() + "\n" + "Empuje de la Nave (Toneladas) : " + nave.getEmpujeNave() + "\n"
                                    + "Peso de la Nave (Toneladas) : " + nave.getPesoNave() + "\n" + "Combustible de la nave : " + dato1 + "\n"
                                    + "Pais de la Nave : " + dato2 + "\n" + "Tamaño de la Nave (Metros): " + lanzadera.getTamañoNave() + "\n"
                                    + "Carga Util de la Nave (Toneladas) : " + lanzadera.getCargaUtil());
                            //Cierre del condicional.
                            break;
                        } else {
                            //Validación de opción menú 2.
                            if (Op1 == 2) {
                                //Solicitud de datos y asignación a variables.
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Nave : ");
                                nave.setNombreNave(nombre);
                                double empuje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del empuje de la Nave (Toneladas): "));
                                nave.setEmpujeNave(empuje);
                                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del peso de la Nave (Kg): "));
                                nave.setPesoNave(peso);
                                int combustible = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de combustible : " + "\n" + "1. Solido* + Liquido****      2. SNH4 + MMH**" + "\n"
                                        + "3. N2H4****        4. N2H4 + He" + "\n"
                                        + "5. PuO2        6. N2O4 + UDMH " + "\n"
                                        + "7. N2H4*** + Amina      8. MMH** + NO" + "\n"
                                        + "9. N/A "));
                                nave.setTipoCombustible(combustible);
                                int pais = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el pais : " + "\n" + "1. EEUU       2. RUSIA" + "\n"
                                        + "3. EUROPA ESA/ASI "));
                                nave.setPais(pais);
                                int mision = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el planeta de misión para la Nave : " + "\n" + "1. Saturno y sus lunas " + "\n"
                                        + "2. Júpiter " + "\n" + "3. Marte" + "\n"
                                        + "4. Mercurio " + "\n" + "5. Plutón " + "\n"
                                        + "6. Urano y Neptuno " + "\n" + "7. Sol" + "\n"
                                        + "8. Venus "));
                                notripuladas.setMisionPlaneta(mision);
                                int precisacombustible = Integer.parseInt(JOptionPane.showInputDialog("Seleccione si la Nave precisa combustible : " + "\n" + "1. Sí " + "\n" + "2. Celdas Fotovoltaicas "));
                                notripuladas.setPrecisancombustible(precisacombustible);
                                //Mensaje de confirmacion de la captura de los datos.
                                JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente ! ");
                                //Se crean variables para capturar el retorno de los metodos para convertir de enteros a cadenas de caracteres.
                                String dato = nave.TipodeNave(Op1);
                                String dato1 = notripuladas.Combustible();
                                String dato2 = notripuladas.Pais();
                                String dato3 = notripuladas.MisionPlaneta();
                                String dato4 = notripuladas.NecesitaCombustible();
                                //Mensaje que presenta el resultado de la simulación.
                                JOptionPane.showMessageDialog(null, "La simulación da como resultado lo siguiente : " + "\n" + "Tipo de Nave : " + dato + "\n"
                                        + "Nombre de la Nave : " + nave.getNombreNave() + "\n" + "Empuje de la Nave (Toneladas) : " + nave.getEmpujeNave() + "\n"
                                        + "Peso de la Nave (Kg) : " + nave.getPesoNave() + "\n" + "Combustible de la nave : " + dato1 + "\n"
                                        + "Pais de la Nave : " + dato2 + "\n" + "Planeta al que va dirigida la misión : " + dato3 + "\n"
                                        + "Necesita combustible la Nave : " + dato4);
                                //Cierre del condicional.
                                break;
                            } else {
                                //Validación de opción menú 2.
                                if (Op1 == 3) {
                                    //Solicitud de datos y asignación a variables.
                                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la Nave : ");
                                    nave.setNombreNave(nombre);
                                    double empuje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del empuje de la Nave (Toneladas): "));
                                    nave.setEmpujeNave(empuje);
                                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del peso de la Nave (Toneladas): "));
                                    nave.setPesoNave(peso);
                                    int combustible = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de combustible : " + "\n" + "1. Solido      2. NO4 + UDMH" + "\n"
                                            + "3. Aerozina50** + NO4   4. Queroseno + H(liq)" + "\n"
                                            + "5. NO + Amina        6. N2O4 + UDMH " + "\n"
                                            + "7. N2O4 + MMH "));
                                    nave.setTipoCombustible(combustible);
                                    int pais = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el pais : " + "\n" + "1. EEUU       2. RUSIA" + "\n"
                                            + "3. INTERNACIONAL      4. CHINA "));
                                    nave.setPais(pais);
                                    int mision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de mision de la Nave : " + "\n" + "1. Misiones lunares (Apolo, Módulo Lunar, Soyuz)" + "\n"
                                            + "2. Experimentación y estudio del comportamiento humano en " + "\n" + "condiciones ingrávidas y en el exterior " + "\n" + "de la cápsula" + "\n"
                                            + "3. Mantenimiento de satélites, probar acoplamientos con " + "\n" + "otras naves y equipos electrónicos"));
                                    tripuladas.setMision(mision);
                                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de pasajeros de la Nave :"));
                                    tripuladas.setCapacidadTripulantes(capacidad);
                                    double orbita = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la orbita de la Nave en (KM) : "));
                                    tripuladas.setOrbita(orbita);
                                    //Mensaje de confirmacion de la captura de los datos.
                                    JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente ! ");
                                    //Se crean variables para capturar el retorno de los metodos para convertir de enteros a cadenas de caracteres.
                                    String dato = nave.TipodeNave(Op1);
                                    String dato1 = tripuladas.Combustible();
                                    String dato2 = tripuladas.Pais();
                                    String dato3 = tripuladas.Mision();
                                    //Mensaje que presenta el resultado de la simulación.
                                    JOptionPane.showMessageDialog(null, "La simulación da como resultado lo siguiente : " + "\n" + "Tipo de Nave : " + dato + "\n"
                                            + "Nombre de la Nave : " + nave.getNombreNave() + "\n" + "Empuje de la Nave (Toneladas) : " + nave.getEmpujeNave() + "\n"
                                            + "Peso de la Nave (Toneladas) : " + nave.getPesoNave() + "\n" + "Combustible de la nave : " + dato1 + "\n"
                                            + "Pais de la Nave : " + dato2 + "\n" + "La misión va dirigida a : " + dato3 + "\n" + "La orbita en (KM) de la Nave es : " + tripuladas.getOrbita() + "\n"
                                            + "La capacidad (Pasajeros) es : " + tripuladas.getCapacidadTripulantes());
                                    //Cierre del condicional.
                                    break;
                                }
                            }

                        }

                        break;
                    }
                case 2:
                    while (Op == 2) {
                        Op1 = Integer.parseInt(JOptionPane.showInputDialog("Opciones del inventario : " + "\n" + " 1. Ver Naves Registradas " + "\n" + " 2. Buscar Nave en Particular "));
                        if (Op1 == 1) {
                            datos.ejecutarConsulta(con.getConexion());
                            break;
                        } else {
                            if (Op1 == 2) {
                                int Op3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de registro de la nave a consultar rango (1-9) : "));

                                if (Op3 >= 1 && Op3 <= 3) {
                                    datos.ejecutarConsultaParticular(con.getConexion(), Op3);
                                    //Se crean variables para capturar el retorno de los metodos para convertir de enteros a cadenas de caracteres.
                                    String dato = nave.TipoNave();
                                    String dato1 = lanzadera.Combustible();
                                    String dato2 = lanzadera.Pais();
                                    //Mensaje que presenta el resultado de la simulación.
                                    JOptionPane.showMessageDialog(null, "La simulación da como resultado lo siguiente : " + "\n" + "Tipo de Nave : " + dato + "\n"
                                            + "Nombre de la Nave : " + nave.getNombreNave() + "\n" + "Empuje de la Nave (Toneladas) : " + nave.getEmpujeNave() + "\n"
                                            + "Peso de la Nave (Toneladas) : " + nave.getPesoNave() + "\n" + "Combustible de la nave : " + dato1 + "\n"
                                            + "Pais de la Nave : " + dato2 + "\n" + "Tamaño de la Nave (Metros): " + lanzadera.getTamañoNave() + "\n"
                                            + "Carga Util de la Nave (Toneladas) : " + lanzadera.getCargaUtil());
                                    //Cierre del condicional.
                                    break;
                                } else {
                                    if (Op3 >= 4 && Op3 <= 6) {
                                        datos.ejecutarConsultaParticular(con.getConexion(), Op3);
                                        //Se crean variables para capturar el retorno de los metodos para convertir de enteros a cadenas de caracteres.
                                        String dato = nave.TipodeNave(Op1);
                                        String dato1 = notripuladas.Combustible();
                                        String dato2 = notripuladas.Pais();
                                        String dato3 = notripuladas.MisionPlaneta();
                                        String dato4 = notripuladas.NecesitaCombustible();
                                        //Mensaje que presenta el resuNavesltado de la simulación.
                                        JOptionPane.showMessageDialog(null, "La simulación da como resultado lo siguiente : " + "\n" + "Tipo de Nave : " + dato + "\n"
                                                + "Nombre de la Nave : " + nave.getNombreNave() + "\n" + "Empuje de la Nave (Toneladas) : " + nave.getEmpujeNave() + "\n"
                                                + "Peso de la Nave (Kg) : " + nave.getPesoNave() + "\n" + "Combustible de la nave : " + dato1 + "\n"
                                                + "Pais de la Nave : " + dato2 + "\n" + "Planeta al que va dirigida la misión : " + dato3 + "\n"
                                                + "Necesita combustible la Nave : " + dato4);
                                        //Cierre del condicional.
                                        break;
                                    } else {
                                        if (Op3 >= 5 && Op3 <= 6) {
                                            datos.ejecutarConsultaParticular(con.getConexion(), Op3);
                                            //Mensaje de confirmacion de la captura de los datos.
                                            JOptionPane.showMessageDialog(null, "Datos Registrados Exitosamente ! ");
                                            //Se crean variables para capturar el retorno de los metodos para convertir de enteros a cadenas de caracteres.
                                            String dato = nave.TipodeNave(Op1);
                                            String dato1 = tripuladas.Combustible();
                                            String dato2 = tripuladas.Pais();
                                            String dato3 = tripuladas.Mision();
                                            //Mensaje que presenta el resultado de la simulación.
                                            JOptionPane.showMessageDialog(null, "La simulación da como resultado lo siguiente : " + "\n" + "Tipo de Nave : " + dato + "\n"
                                                    + "Nombre de la Nave : " + nave.getNombreNave() + "\n" + "Empuje de la Nave (Toneladas) : " + nave.getEmpujeNave() + "\n"
                                                    + "Peso de la Nave (Toneladas) : " + nave.getPesoNave() + "\n" + "Combustible de la nave : " + dato1 + "\n"
                                                    + "Pais de la Nave : " + dato2 + "\n" + "La misión va dirigida a : " + dato3 + "\n" + "La orbita en (KM) de la Nave es : " + tripuladas.getOrbita() + "\n"
                                                    + "La capacidad (Pasajeros) es : " + tripuladas.getCapacidadTripulantes());
                                            //Cierre del condicional.
                                            break;
                                        }
                                    }
                                }

                                break;
                            }
                        }
                    }
            }
        }
        while (Op == 3) {
            JOptionPane.showMessageDialog(null, "¡Se cerro exitosamente el programa!");
            System.exit(Op);
            break;
        }
    }

}
