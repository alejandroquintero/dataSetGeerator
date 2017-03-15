/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasetgeerator;

import ccp.enterprise.department.cliente.Cliente;
import ccp.enterprise.department.entrega.Entrega;
import ccp.enterprise.department.generator.Generator;
import ccp.enterprise.department.pedido.Pedido;
import ccp.enterprise.department.producto.Producto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import com.google.gson.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alejandroquintero
 */
public class DataSetGeerator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        BufferedWriter bw = null;
		FileWriter fw = null;
                BufferedWriter bw1 = null;
		FileWriter fw1 = null;
        Random randomGenerator = new Random();
        Generator dataset =new Generator();
        List<Integer> cant=new ArrayList<>();
        List<String> transp=new ArrayList<>();
        List<String> ciudad=new ArrayList<>();
        List<String> conductor=new ArrayList<>();
        List<String> direccion=new ArrayList<>();
        List<String> estado_entrega=new ArrayList<>();
        List<Date> fecha_pedido=new ArrayList<>();
        List<String> forma_de_pago=new ArrayList<>();
        List<String> observaciones_cliente=new ArrayList<>();
        List<String> posicion_carga=new ArrayList<>();
          List<String> prioridad=new ArrayList<>();
          List<String> sitio_de_embarque=new ArrayList<>();
          List<Integer> activo=new ArrayList<>();
          List<String> tipo=new ArrayList<>();
          List<String> tipo_de_embalaje=new ArrayList<>();
          List<String> tratamiento_de_carga=new ArrayList<>();
          List<Cliente> cliente=new ArrayList<>();
          List<Pedido> pedido=new ArrayList<>();
          List<Producto> producto=new ArrayList<>();
           List<Entrega> entrega=new ArrayList<>();
          
        for(int i=1; i<48;i++){
            cant.add(i);
        
                }
        dataset.setOpciones_cantidad(cant);
        
        
        transp.add("aereo avianca");
        transp.add("aereo lan");
        transp.add("aereo american");
        transp.add("aereo servientrega");
        transp.add("aereo fedex");
        transp.add("aereo ups");
        transp.add("maritimo norwegian");
        transp.add("terrestre servientrega");
        transp.add("terrestre fedex");
        transp.add("terrestre ups");
        dataset.setOpciones_caracteristicas_transporte(transp);
        
        ciudad.add("cali");
        ciudad.add("bogota");
        ciudad.add("barranquilla");
        ciudad.add("medellin");
        ciudad.add("cucuta");
        ciudad.add("cartagena");
        ciudad.add("pasto");
        dataset.setOpciones_ciudad(ciudad);
        
        conductor.add("pedro castro");
        conductor.add("juan santos");
        conductor.add("juan caicedo");
        conductor.add("miguel castro");
        conductor.add("ramon ruiz");
        conductor.add("julio dominguez");
        conductor.add("martin gonzalez");
        conductor.add("david aparicio");
        dataset.setOpciones_conductor(conductor);
        
        direccion.add("norte");
        direccion.add("sur");
        direccion.add("oriente");
        direccion.add("occidente");
        direccion.add("nororiente");
        direccion.add("noroccidente");
        direccion.add("suroccidente");
        direccion.add("suroriente");
        dataset.setOpciones_direccion(direccion);
        
        estado_entrega.add("en trafico");
        estado_entrega.add("en bodega central");
        estado_entrega.add("entregado");
        estado_entrega.add("cancelado");
        estado_entrega.add("rechazado");
        dataset.setOpciones_estado_entrega(estado_entrega);
        
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date inicial = format.parse("01/02/2017 00:00:00");
        for(int i=0;i<=24;i++){
        fecha_pedido.add(new Date(inicial.getTime() + 2 * Generator.HOUR));
        }
        dataset.setOpciones_fecha_pedido(fecha_pedido);
        
       forma_de_pago.add("contado");
       forma_de_pago.add("10 dias");
        forma_de_pago.add("30 dias");
         forma_de_pago.add("45 dias");
          forma_de_pago.add("60 dias");
           forma_de_pago.add("90 dias");
       observaciones_cliente.add("no llego a tiempo");
       observaciones_cliente.add("llego averiado");
       observaciones_cliente.add("falta referencia a");
       observaciones_cliente.add("falta referencia b");
       observaciones_cliente.add("falta referencia c");
       observaciones_cliente.add("el conductor fue grosero");
       observaciones_cliente.add("el pedido llego incompleto");
       observaciones_cliente.add("llegaron referencias de mas");
       observaciones_cliente.add("el conductor rompio una caja en la entrega");
       observaciones_cliente.add("el producto llego antes de tiempo");
       observaciones_cliente.add("se perdio el cargo");
       observaciones_cliente.add("el producto llego mojado");
       observaciones_cliente.add("el producto llego ok");
       dataset.setOpciones_observaciones_cliente(observaciones_cliente);
       posicion_carga.add("arriba");
       posicion_carga.add("abajo");
       posicion_carga.add("centro");
       dataset.setOpciones_posicion_carga(posicion_carga);
       prioridad.add("alta");
       prioridad.add("media");
       prioridad.add("baja");
       dataset.setOpciones_prioridad(prioridad);
       sitio_de_embarque.add("bodega central");
       sitio_de_embarque.add("bodega alterna");
       dataset.setOpciones_sitio_de_embarque(sitio_de_embarque);
       for(int i=0;i<20;i++){
           activo.add(i);
       
               }
       dataset.setOpciones_tiempo_activo(activo);
       tipo.add("grandes superficies");
       tipo.add("tienda");
       tipo.add("supermercado");
       tipo.add("hipermercado");
       tipo.add("galeria");
       dataset.setOpciones_tipo(tipo);
       tipo_de_embalaje.add("carton");
       tipo_de_embalaje.add("plastico");
       tipo_de_embalaje.add("madera");
       tipo_de_embalaje.add("icopor");
       dataset.setOpciones_tipo_de_embalaje(tipo_de_embalaje);
       tratamiento_de_carga.add("normal");
       tratamiento_de_carga.add("fragil");
       dataset.setOpciones_tratamiento_de_carga(tratamiento_de_carga);
              
        producto.add(new Producto(0,"leche",50, "perecederos"));
         producto.add(new Producto(1,"pan",20, "perecederos"));
         producto.add(new Producto(2,"huevos",20, "perecederos"));
         producto.add(new Producto(3,"salchichas",30, "perecederos"));
         producto.add(new Producto(4,"tomates",40, "perecederos"));
         producto.add(new Producto(5,"cebolla",50, "perecederos"));
         producto.add(new Producto(6,"yogurt",60, "perecederos"));
         producto.add(new Producto(7,"queso",70, "perecederos"));
         producto.add(new Producto(8,"mantequilla",80, "perecederos"));
       String[] zona= {"sur","norte","oriente","occidente","nororiente","noroccidente","suroriente","suroccidente"};
      
       for(int i=0;i<1000;i++){
           
       cliente.add(new Cliente("almacenes la "+i));
       cliente.get(i).setForma_pago(forma_de_pago.get(randomGenerator.nextInt(5)));
       cliente.get(i).setTiempoActivo(dataset.getOpciones_tiempo_activo().get(randomGenerator.nextInt(18)));
       cliente.get(i).setTipo(tipo.get(randomGenerator.nextInt(4)));
       cliente.get(i).setZona(zona[randomGenerator.nextInt(6)]);
       cliente.get(i).setProductos(producto);
       }
       
        
       
      /*   
         
         for(int i =0; i<100000;i++){
         pedido.add(new Pedido(i));
         pedido.get(i).setCantidad(dataset.getOpciones_cantidad().get(randomGenerator.nextInt(45)));
         pedido.get(i).setCliente(cliente.get(randomGenerator.nextInt(900)).getNombre());
         pedido.get(i).setFecha_pedido(dataset.getOpciones_fecha_pedido().get(randomGenerator.nextInt(24)));
         pedido.get(i).setPrioridad(dataset.getOpciones_prioridad().get(randomGenerator.nextInt(2)));
         pedido.get(i).setValor(producto.get(randomGenerator.nextInt(7)).getCantidad()*pedido.get(i).getCantidad());
         pedido.get(i).setRefproducto(producto.get(randomGenerator.nextInt(7)).getReferencia());
         entrega.add(new Entrega(i));
         entrega.get(i).setCiudad(dataset.getOpciones_ciudad().get(randomGenerator.nextInt(6)));
         entrega.get(i).setConductor(dataset.getOpciones_conductor().get(randomGenerator.nextInt(7)));
         entrega.get(i).setDireccion(dataset.getOpciones_direccion().get(randomGenerator.nextInt(7)));
         entrega.get(i).setTipo_de_embalaje(dataset.getOpciones_tipo_de_embalaje().get(randomGenerator.nextInt(3)));
         entrega.get(i).setSitio_de_embarque(dataset.getOpciones_sitio_de_embarque().get(randomGenerator.nextInt(1)));
         entrega.get(i).setPosicion_carga(dataset.getOpciones_posicion_carga().get(randomGenerator.nextInt(2)));
         entrega.get(i).setTratamiento_de_carga(dataset.getOpciones_tratamiento_de_carga().get(randomGenerator.nextInt(1)));
         entrega.get(i).setCaracteristicas_transporte(dataset.getOpciones_caracteristicas_transporte().get(randomGenerator.nextInt(9)));
    
         entrega.get(i).setEstado_entrega(dataset.getOpciones_estado_entrega().get(randomGenerator.nextInt(4)));
         entrega.get(i).setObservaciones_cliente(dataset.getOpciones_observaciones_cliente().get(randomGenerator.nextInt(12)));
        System.out.println(i);
         }
         
    */
  String json = new Gson().toJson(cliente);
    /** String json1 = new Gson().toJson(cliente);
         String csv ="pedido_id,ciudad,direccion,estado_entrega,conductor,caracteristicas_de_transporte,posicion_de_carga,sitio_de_embarque,tipo_de_embalaje,tratamiento_de_carga,observaciones_cliente";
         String csvp="id,producto,cantidad,cliente,fecha,prioridad,valor";
         String csvpt="id,referencia,precio,descripcion";
         String csvc="nombre,forma_de_pago,tiempo_activo,tipo";
       int counter1=0;
       int counter2=0;
       int counter3=0;
       int counter4=0;
         for(Entrega e: entrega){
          csv+="\n"+e.toString();
          System.out.println(counter1++);
         }
        for(Pedido p: pedido){
            
            csvp+="\n"+p.toString();
             System.out.println(counter2++);
         }
       for(Producto pt:producto){
       csvpt+="\n"+pt.toString();
       System.out.println(counter3++);
       }
         for(Cliente c:cliente){
         csvc+="\n"+c.toString();
         System.out.println(counter4++);
         }
    
*/

		try {

			 

		/*	fw = new FileWriter("entregas.csv");
			bw = new BufferedWriter(fw);
			bw.write(csv);
                        fw = new FileWriter("pedidos.csv");
			bw = new BufferedWriter(fw);
			bw.write(csvp);
			 fw = new FileWriter("producto.csv");
			bw = new BufferedWriter(fw);
			bw.write(csvpt);
*/
                        fw = new FileWriter("client.json");
			bw = new BufferedWriter(fw);
			bw.write(json);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

         
    }
}

    
        // TODO code application logic here
    
    
   

  
     
    
    

