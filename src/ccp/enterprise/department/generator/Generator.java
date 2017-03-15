/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp.enterprise.department.generator;

import ccp.enterprise.department.cliente.Cliente;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alejandroquintero
 */
public class Generator {

    /**
     * @return the HOUR
     */
    public static long getHOUR() {
        return HOUR;
    }

    /**
     * @param aHOUR the HOUR to set
     */
    public static void setHOUR(long aHOUR) {
        HOUR = aHOUR;
    }

    /**
     * @return the lista_cliente
     */
    public static List<Cliente> getLista_cliente() {
        return lista_cliente;
    }

    /**
     * @param aLista_cliente the lista_cliente to set
     */
    public static void setLista_cliente(List<Cliente> aLista_cliente) {
        lista_cliente = aLista_cliente;
    }
    private List<String> opciones_ciudad;
    private List<String> opciones_direccion;
    private List<String> opciones_tipo_de_embalaje;
    private List<String> opciones_sitio_de_embarque;
    private List<String> opciones_posicion_carga;
    private List<String> opciones_tratamiento_de_carga;
    private List<String> opciones_caracteristicas_transporte;
    private List<String> opciones_conductor;
    private List<String> opciones_estado_entrega;
    private List<String> opciones_observaciones_cliente;
    private List<Date> opciones_fecha_pedido;
    private List<Integer> opciones_cantidad;
    private List<String> opciones_prioridad;
    private List<String> opciones_forma_de_pago;
    private List<String> opciones_tipo;
    private List<Integer> opciones_tiempo_activo;
    public static long HOUR = 3600*1000;
    public static List<Cliente> lista_cliente;

    /**
     * @return the opciones_ciudad
     */
    public List<String> getOpciones_ciudad() {
        return opciones_ciudad;
    }

    /**
     * @param opciones_ciudad the opciones_ciudad to set
     */
    public void setOpciones_ciudad(List<String> opciones_ciudad) {
        this.opciones_ciudad = opciones_ciudad;
    }

    /**
     * @return the opciones_direccion
     */
    public List<String> getOpciones_direccion() {
        return opciones_direccion;
    }

    /**
     * @param opciones_direccion the opciones_direccion to set
     */
    public void setOpciones_direccion(List<String> opciones_direccion) {
        this.opciones_direccion = opciones_direccion;
    }

    /**
     * @return the opciones_tipo_de_embalaje
     */
    public List<String> getOpciones_tipo_de_embalaje() {
        return opciones_tipo_de_embalaje;
    }

    /**
     * @param opciones_tipo_de_embalaje the opciones_tipo_de_embalaje to set
     */
    public void setOpciones_tipo_de_embalaje(List<String> opciones_tipo_de_embalaje) {
        this.opciones_tipo_de_embalaje = opciones_tipo_de_embalaje;
    }

    /**
     * @return the opciones_sitio_de_embarque
     */
    public List<String> getOpciones_sitio_de_embarque() {
        return opciones_sitio_de_embarque;
    }

    /**
     * @param opciones_sitio_de_embarque the opciones_sitio_de_embarque to set
     */
    public void setOpciones_sitio_de_embarque(List<String> opciones_sitio_de_embarque) {
        this.opciones_sitio_de_embarque = opciones_sitio_de_embarque;
    }

    /**
     * @return the opciones_posicion_carga
     */
    public List<String> getOpciones_posicion_carga() {
        return opciones_posicion_carga;
    }

    /**
     * @param opciones_posicion_carga the opciones_posicion_carga to set
     */
    public void setOpciones_posicion_carga(List<String> opciones_posicion_carga) {
        this.opciones_posicion_carga = opciones_posicion_carga;
    }

    /**
     * @return the opciones_tratamiento_de_carga
     */
    public List<String> getOpciones_tratamiento_de_carga() {
        return opciones_tratamiento_de_carga;
    }

    /**
     * @param opciones_tratamiento_de_carga the opciones_tratamiento_de_carga to set
     */
    public void setOpciones_tratamiento_de_carga(List<String> opciones_tratamiento_de_carga) {
        this.opciones_tratamiento_de_carga = opciones_tratamiento_de_carga;
    }

    /**
     * @return the opciones_caracteristicas_transporte
     */
    public List<String> getOpciones_caracteristicas_transporte() {
        return opciones_caracteristicas_transporte;
    }

    /**
     * @param opciones_caracteristicas_transporte the opciones_caracteristicas_transporte to set
     */
    public void setOpciones_caracteristicas_transporte(List<String> opciones_caracteristicas_transporte) {
        this.opciones_caracteristicas_transporte = opciones_caracteristicas_transporte;
    }

    /**
     * @return the opciones_conductor
     */
    public List<String> getOpciones_conductor() {
        return opciones_conductor;
    }

    /**
     * @param opciones_conductor the opciones_conductor to set
     */
    public void setOpciones_conductor(List<String> opciones_conductor) {
        this.opciones_conductor = opciones_conductor;
    }

    /**
     * @return the opciones_estado_entrega
     */
    public List<String> getOpciones_estado_entrega() {
        return opciones_estado_entrega;
    }

    /**
     * @param opciones_estado_entrega the opciones_estado_entrega to set
     */
    public void setOpciones_estado_entrega(List<String> opciones_estado_entrega) {
        this.opciones_estado_entrega = opciones_estado_entrega;
    }

    /**
     * @return the opciones_observaciones_cliente
     */
    public List<String> getOpciones_observaciones_cliente() {
        return opciones_observaciones_cliente;
    }

    /**
     * @param opciones_observaciones_cliente the opciones_observaciones_cliente to set
     */
    public void setOpciones_observaciones_cliente(List<String> opciones_observaciones_cliente) {
        this.opciones_observaciones_cliente = opciones_observaciones_cliente;
    }

    /**
     * @return the opciones_fecha_pedido
     */
    public List<Date> getOpciones_fecha_pedido() {
        return opciones_fecha_pedido;
    }

    /**
     * @param opciones_fecha_pedido the opciones_fecha_pedido to set
     */
    public void setOpciones_fecha_pedido(List<Date> opciones_fecha_pedido) {
        this.opciones_fecha_pedido = opciones_fecha_pedido;
    }

    /**
     * @return the opciones_cantidad
     */
    public List<Integer> getOpciones_cantidad() {
        return opciones_cantidad;
    }

    /**
     * @param opciones_cantidad the opciones_cantidad to set
     */
    public void setOpciones_cantidad(List<Integer> opciones_cantidad) {
        this.opciones_cantidad = opciones_cantidad;
    }

    /**
     * @return the opciones_prioridad
     */
    public List<String> getOpciones_prioridad() {
        return opciones_prioridad;
    }

    /**
     * @param opciones_prioridad the opciones_prioridad to set
     */
    public void setOpciones_prioridad(List<String> opciones_prioridad) {
        this.opciones_prioridad = opciones_prioridad;
    }

    /**
     * @return the opciones_forma_de_pago
     */
    public List<String> getOpciones_forma_de_pago() {
        return opciones_forma_de_pago;
    }

    /**
     * @param opciones_forma_de_pago the opciones_forma_de_pago to set
     */
    public void setOpciones_forma_de_pago(List<String> opciones_forma_de_pago) {
        this.opciones_forma_de_pago = opciones_forma_de_pago;
    }

    /**
     * @return the opciones_tipo
     */
    public List<String> getOpciones_tipo() {
        return opciones_tipo;
    }

    /**
     * @param opciones_tipo the opciones_tipo to set
     */
    public void setOpciones_tipo(List<String> opciones_tipo) {
        this.opciones_tipo = opciones_tipo;
    }

    /**
     * @return the opciones_tiempo_activo
     */
    public List<Integer> getOpciones_tiempo_activo() {
        return opciones_tiempo_activo;
    }

    /**
     * @param opciones_tiempo_activo the opciones_tiempo_activo to set
     */
    public void setOpciones_tiempo_activo(List<Integer> opciones_tiempo_activo) {
        this.opciones_tiempo_activo = opciones_tiempo_activo;
    }
    
}
