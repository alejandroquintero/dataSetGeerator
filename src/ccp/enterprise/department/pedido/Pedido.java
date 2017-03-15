/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp.enterprise.department.pedido;

import ccp.enterprise.department.cliente.Cliente;
import ccp.enterprise.department.generator.IgeneratorLogic;
import ccp.enterprise.department.producto.Producto;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author alejandroquintero
 */
public class Pedido implements  Serializable {
    private Integer id;
    private Date fecha_pedido;
    private String refproducto;
    private Integer cantidad;
    private Integer valor;
    private String prioridad;
    private String cliente;
    

    /**
     * @return the id
     */
    public Pedido(int id){
    this.id=id;
    }
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the fecha_pedido
     */
    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    /**
     * @param fecha_pedido the fecha_pedido to set
     */
    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    /**
     * @return the refproducto
     */
    public String getRefproducto() {
        return refproducto;
    }

    /**
     * @param refproducto the refproducto to set
     */
    public void setRefproducto(String refproducto) {
        this.refproducto = refproducto;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the valor
     */
    public Integer getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the forma_de_pago
     */
  
 public String toString(){
    
 return getId()+","+getRefproducto()+","+getCantidad()+","+getCliente()+","+getFecha_pedido()+","+getPrioridad()+","+getValor();
 }
 
    
    
}
