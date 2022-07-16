package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Vista.Conectar;
import Modelos.VehiculosLanzadera;
import Modelos.Nave;
import Modelos.NoTripuladas;
import Modelos.Tripuladas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class ControlDatos {
    
    private Conectar conectar;
    private Nave modelo;
    private VehiculosLanzadera modelo1;
    private Connection con;
    private NoTripuladas modelo2;
    private Tripuladas modelo3;
    
    public ControlDatos() {
        //Declaramos objetos de las clases Conectar() y Nave().
        conectar = new Conectar();
        modelo = new Nave();
        modelo1 = new VehiculosLanzadera();
        modelo2 = new NoTripuladas();
        modelo3 = new Tripuladas();
    }

    //Metodo para registrar una nave VehiculoLanzadera.
    public void insertar(int tipoNave, String nombreNave, double empujeNave, double pesoNave, int combustible, double tamañoNave, double cargaUtil, int pais) {
        PreparedStatement ps;
        String sql;
        modelo.setTipoNave(tipoNave);
        modelo.setNombreNave(nombreNave);
        modelo.setEmpujeNave(empujeNave);
        modelo.setPesoNave(pesoNave);
        modelo.setTipoCombustible(combustible);
        modelo1.setTamañoNave(tamañoNave);
        modelo1.setCargaUtil(cargaUtil);
        modelo1.setPais(pais);
        try {
            con = conectar.getConexion();
            sql = "insert into lanzadera(tipo, nombre, empuje, peso, combustible, tamaño, carga, pais) values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, modelo.getTipoNave());
            ps.setString(2, modelo.getNombreNave());
            ps.setDouble(3, modelo.getEmpujeNave());
            ps.setDouble(4, modelo.getPesoNave());
            ps.setInt(5, modelo.getTipoCombustible());
            ps.setDouble(6, modelo1.getTamañoNave());
            ps.setDouble(7, modelo1.getCargaUtil());
            ps.setInt(8, modelo1.getPais());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha Registrado la nueva Nave.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public void ejecutarConsulta(Connection con) {
        try {
            String SQL = "SELECT * FROM nave";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            
            while (rs.next()) {
                modelo.setId(Integer.parseInt(rs.getArray("id").toString()));
                modelo.setNombreNave(rs.getString("nave"));
                
                JOptionPane.showMessageDialog(null, "La nave : " + "\n" + rs.getString("id") + " : " + rs.getString("nave"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ejecutarConsultaParticular(Connection con, int dato) {
        try {
            String SQL = "SELECT * FROM nave WHERE  id = " + dato;
            String SQL1 = "SELECT * FROM notripuladas WHERE  idnotri = " + dato;
            String SQL2 = "SELECT * FROM tripuladas WHERE  idtri = " + dato;
            String SQL3 = "SELECT * FROM lanzadera WHERE  idlanza = " + dato;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSet rs1 = stmt.executeQuery(SQL1);
            ResultSet rs2 = stmt.executeQuery(SQL2);
            ResultSet rs3 = stmt.executeQuery(SQL3);
            int nave;
            int id;
            
            while (rs.next() && rs3.next()) {
                modelo.setId(rs.getInt("id"));
                modelo.setTipoNave(rs.getInt("nave"));
                modelo.setNombreNave(rs.getString("nombre"));
                modelo.setTipoCombustible(rs.getInt("combustible"));
                modelo.setPesoNave(rs.getDouble("peso"));
                modelo.setEmpujeNave(rs.getDouble("empuje"));
                modelo.setPais(rs.getInt("pais"));
                modelo1.setTamañoNave(rs3.getInt("tamaño"));
                modelo1.setCargaUtil(rs3.getDouble("carga"));
            }
            while (rs.next() && rs1.next()) {
                modelo.setId(rs.getInt("id"));
                modelo.setTipoNave(rs.getInt("nave"));
                modelo.setNombreNave(rs.getString("nombre"));
                modelo.setTipoCombustible(rs.getInt("combustible"));
                modelo.setPesoNave(rs.getDouble("peso"));
                modelo.setEmpujeNave(rs.getDouble("empuje"));
                modelo.setPais(rs.getInt("pais"));
                modelo2.setPrecisancombustible(rs1.getInt("precisa"));
                modelo2.setMisionPlaneta(rs1.getInt("mision"));
            }
            while (rs.next() && rs2.next()) {
                modelo.setId(rs.getInt("id"));
                modelo.setTipoNave(rs.getInt("nave"));
                modelo.setNombreNave(rs.getString("nombre"));
                modelo.setTipoCombustible(rs.getInt("combustible"));
                modelo.setPesoNave(rs.getDouble("peso"));
                modelo.setEmpujeNave(rs.getDouble("empuje"));
                modelo.setPais(rs.getInt("pais"));
                modelo3.setMision(rs.getInt("mision"));
                modelo3.setCapacidadTripulantes(rs.getInt("capacidad"));
                modelo3.setOrbita(rs.getDouble("orbita"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
