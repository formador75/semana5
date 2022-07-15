/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.ConexionBD;

/**
 *
 * @author fido
 */
public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private String categoria;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, String categoria, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }

    public Producto getProducto(int id) {
        ConexionBD conexion = new ConexionBD();
        String sql = "select * from productos WHERE id="+id+";";
        try {
            ResultSet rs = conexion.consultarBD(sql);
            if (rs.next()) {
                this.id = rs.getInt("id");
                this.cantidad = rs.getInt("cantidad");
                this.nombre = rs.getString("nombre");
                this.categoria = rs.getString("categoria");
                this.precio = rs.getDouble("precio");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            conexion.cerrarConexion();
        }
        return this;
    }

    public List<Producto> listarProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        ConexionBD conexion = new ConexionBD();
        String sql = "select * from productos;";
        try {
            ResultSet rs = conexion.consultarBD(sql);
            Producto p;
            while (rs.next()) {
                p = new Producto();
                p.setId(rs.getInt("id"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setNombre(rs.getString("nombre"));
                p.setCategoria(rs.getString("categoria"));
                p.setPrecio(rs.getDouble("precio"));
                listaProductos.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        } finally {
            conexion.cerrarConexion();
        }
        return listaProductos;
    }

    public boolean guardarProducto() {
        ConexionBD conexion = new ConexionBD();
        String sql = "INSERT INTO productos(id,nombre,categoria,cantidad,precio)"
                + "VALUES("+this.id+",'" + this.nombre + "','" + this.categoria + "'," + this.cantidad + "," + this.precio + ");";
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.insertarBD(sql)) {
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        } else {
            conexion.cerrarConexion();
            return false;
        }
    }

    public boolean actualizarProducto() {
        ConexionBD conexion = new ConexionBD();
        String sql = "UPDATE productos SET nombre='"
                + this.nombre + "',categoria='" + this.categoria
                + "',cantidad=" + this.cantidad + ",precio="
                + this.precio + " WHERE id=" + this.id + ";";
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.actualizarBD(sql)) {
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        } else {
            conexion.cerrarConexion();
            return false;
        }
    }

    public boolean eliminarProducto() {
        ConexionBD conexion = new ConexionBD();
        String sql = "DELETE FROM productos WHERE id=" + this.id + ";";
        if (conexion.setAutoCommitBD(false)) {
            if (conexion.actualizarBD(sql)) {
                conexion.commitBD();
                conexion.cerrarConexion();
                return true;
            } else {
                conexion.rollbackBD();
                conexion.cerrarConexion();
                return false;
            }
        } else {
            conexion.cerrarConexion();
            return false;
        }
    }

}
