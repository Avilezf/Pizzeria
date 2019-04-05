/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzería;

import java.util.ArrayList;

/**
 *
 * @author avilezf
 */
public class Pizzeria {

    
//----------------------------------------------------------------------------
//Pizzeria.java
//----------------------------------------------------------------------------

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables de apoyo
        ArrayList<Item> itemsTemp = new ArrayList();
        
        
        //Creando clase principal
        Pizzeria p = new Pizzeria();
        
        //Creando items
        p.addItem(new Item("Lasagna",20000));
        p.addItem(new Item("Pizza hawaiana",15000));
        p.addItem(new Item("Calzone",12500));
        p.addItem(new Item("Pasta napolitana",17200));
        p.addItem(new Item("Raviolis",2200));
        
        //Creando clientes
        p.addCliente(new Cliente("Pedro"));
        p.addCliente(new Cliente("Plutarco"));
        p.addCliente(new Cliente("Carolina"));
        p.addCliente(new Cliente("Lina"));
        p.addCliente(new Cliente("Ana"));
        
        //Creando pedidos
        
        //Pedido 1
        
        itemsTemp.add(p.getItem(0));
        itemsTemp.add(p.getItem(0));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(3));
        
        p.addPedido(new PedidoTelefono(p.getCliente(0),"3001111110",itemsTemp));
        
        
        //Pedido 2
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(0));
        itemsTemp.add(p.getItem(3));
        itemsTemp.add(p.getItem(3));
        
        p.addPedido(new PedidoTelefono(p.getCliente(1),"3001111111",itemsTemp));
        
        
        //Pedido 3
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(3));
        itemsTemp.add(p.getItem(4));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(2),"caro@latinmail.com",itemsTemp));
        
        //Pedido 4
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(0));
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(4));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(3),"lina@altavista.com",itemsTemp));
        
        
        //Pedido 5
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(4));
        itemsTemp.add(p.getItem(4));
        itemsTemp.add(p.getItem(4));
        itemsTemp.add(p.getItem(4));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(3),"lina@altavista.com",itemsTemp));
        
        
        //Pedido 6
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(4));
        itemsTemp.add(p.getItem(4));
        itemsTemp.add(p.getItem(4));
        itemsTemp.add(p.getItem(4));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(0),"pedro@metacrawler.com",itemsTemp));
        
        //Pedido 7
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(3));
        itemsTemp.add(p.getItem(1));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(0),"pedro@metacrawler.com",itemsTemp));
        
        
        //Pedido 8
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(2));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(1),"plutarco@terra.com.co",itemsTemp));
        
         //Pedido 9
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(3));
        itemsTemp.add(p.getItem(2));
        itemsTemp.add(p.getItem(2));
        
        //p.addPedido(new PedidoOnLine(p.getCliente(1),"plutarco@terra.com.co",itemsTemp));
        
        //Pedido 10
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(0));
        itemsTemp.add(p.getItem(0));
        itemsTemp.add(p.getItem(3));
        
        p.addPedido(new PedidoTelefono(p.getCliente(2),"3001111113",itemsTemp));
        
        //Pedido 11
        
        itemsTemp = new ArrayList();
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(1));
        itemsTemp.add(p.getItem(1));
        
        p.addPedido(new PedidoTelefono(p.getCliente(3),"3001111113",itemsTemp));
        
        
        int numProducto = 0;
        
//        for (int i = 0; i < p.clientes.size(); i++) {
//            numProducto = p.calcProdMasVendidoCliente(i);
//            if(numProducto !=-1)
//                System.out.println("El producto más vendido del cliente "+p.getCliente(i).getNombre()+": "+p.getItem(numProducto).getNombre());
//            else
//                System.out.println("El cliente no tiene productos");
//        
//        }        

    
}

    private void addItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Item getItem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getCliente(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addPedido(PedidoTelefono pedidoTelefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int calcProdMasVendidoCliente(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
