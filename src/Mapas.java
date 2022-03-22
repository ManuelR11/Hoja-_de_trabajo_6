/**
 * 
 */

/**
 * @author rodas
 *
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.security.PublicKey;
import java.util.ArrayList;





public class Mapas {

    private ArrayList<String> Pro = new ArrayList<>();
    private LinkedHashMap<String, ArrayList> ProductosLinked = new LinkedHashMap<String, ArrayList>();
    private TreeMap <String, ArrayList> ProductosTree = new TreeMap<String, ArrayList>();
    private HashMap<String, ArrayList> Productos = new HashMap<String, ArrayList>();


    public void Tree(){
        for (int i = 0; i < Pro.size(); i++) {
            ArrayList<String> Nombres=new ArrayList<>();
            String K=Pro.get(i);
            String V=Pro.get(i+1);
            if (ProductosTree.size()==0) {
                Nombres.add(V);
                ProductosTree.put(K, Nombres);
            } else if(ProductosTree.get(K)!= null){
                Nombres=ProductosTree.get(K);
                Nombres.add(V);
                ProductosTree.put(K, Nombres);                
            }else{
                Nombres.add(V);
                ProductosTree.put(K, Nombres);
            }
            i+=1;
        }
        for(Map.Entry<String, ArrayList> m: ProductosTree.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());  
        }
    }

    public void Linked(){
        for (int i = 0; i < Pro.size(); i++) {
            ArrayList<String> Nombres=new ArrayList<>();
            String K=Pro.get(i);
            String V=Pro.get(i+1);
            if (ProductosLinked.size()==0) {
                Nombres.add(V);
                ProductosTree.put(K, Nombres);
            } else if(ProductosTree.get(K)!= null){
                Nombres=ProductosTree.get(K);
                Nombres.add(V);
                ProductosTree.put(K, Nombres);                
            }else{
                Nombres.add(V);
                ProductosTree.put(K, Nombres);
            }
            i+=1;
        }
        for(Map.Entry<String, ArrayList> m: ProductosLinked.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());  
        }
    }
    
    
    public void Hash(){
        for (int i = 0; i < Pro.size(); i++) {
            ArrayList<String> Nombres=new ArrayList<>();
            String K=Pro.get(i);
            String V=Pro.get(i+1);
            if (Productos.size()==0) {
                Nombres.add(V);
                Productos.put(K, Nombres);
            } else if(Productos.get(K)!= null){
                Nombres = Productos.get(K);
                Nombres.add(V);
                Productos.put(K, Nombres);
            }else{
                Nombres.add(V);
                Productos.put(K, Nombres);
            }
            i+=1;
        }
        for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
            System.out.println(m.getKey() + " : " + m.getValue());  
        }
         
    }


    public void Pro(ArrayList data){
       for (int i = 0; i < data.size(); i++) {
           String value =(String) data.get(i);
           String[] lista= value.split("-");
           Pro.add(lista[0]);
           Pro.add(lista[1]);
       } 
    }

    //info productos nombre 
    public void Pro_producto_nombres(int n){
        String message="";
        switch (n) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }    
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosTree.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                } 
                break;      
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosLinked.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+ " :Producto "+m.getValue()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }      
            default:
                break;
        }
    }
    public void Nombre_de_producto(String n, int hash){
        switch (hash) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(n)){
                            System.out.println("Categoria "+m.getKey()+" : producto"+productos); 
                        }
                    }
                }
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosTree.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(n)){
                            System.out.println("Categoria "+m.getKey()+" : producto"+productos); 
                        }
                    }
                }
                break;    
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosLinked.entrySet()){
                    ArrayList<String> Nombres=m.getValue();
                    for(String productos: Nombres){
                        if (productos.equals(n)){
                            System.out.println("Categoria "+m.getKey()+" : producto"+productos); 
                        }
                    }
                }
                break;    
        
            default:
                break;
        }
    }

    //info producto
    public void Pro_producto(int n){
        String message="";
        switch (n) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }    
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosTree.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                } 
                break;      
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosLinked.entrySet()){
                    ArrayList<String> Nombres=m.getValue();    
                    message=message+"\n"+"Categoria "+m.getKey()+" Cantidad "+Nombres.size();
                    System.out.println(message);
                }      
            default:
                break;
        }
    }

    public void AddValor(String v1, String v2, int n){
        String message="Se ha agregado de manera exitosa";
        ArrayList<String> values=new ArrayList<>(); 
        switch (n) {
            case 1:
                if (Productos.get(v1)!=null) {
                    values=Productos.get(v1);
                    values.add(v2);
                    System.out.println(message);
                } else {
                    message="Categoria no encontrada";
                    System.out.println(message);
                }
                break;
            case 2:
                if (ProductosTree.get(v1)!=null) {
                    values=Productos.get(v1);
                    values.add(v2);
                    System.out.println(message);
                } else {
                    message="Categoria no encontrada";
                    System.out.println(message);
                }
                break;
            case 3:
                if (ProductosLinked.get(v1)!=null) {
                    values=Productos.get(v1);
                    values.add(v2);
                    System.out.println(message);
                } else {
                    message="Categoria no encontrada";
                    System.out.println(message);
                }
                break;    
            default:
                break;
        }
    }
    
    public void Everything(int n){
        String message="";
        switch (n) {
            case 1:
                for(Map.Entry<String, ArrayList> m: Productos.entrySet()){
                    message=message+ "\n" + m.getKey() + " : " + m.getValue();
                    System.out.println(message);
                }    
                break;
            case 2:
                for(Map.Entry<String, ArrayList> m: ProductosTree.entrySet()){
                    message=message+ "\n" + m.getKey() + " : " + m.getValue();
                    System.out.println(message);
                } 
                break;      
            case 3:
                for(Map.Entry<String, ArrayList> m: ProductosLinked.entrySet()){
                    message=message+ "\n" + m.getKey() + " : " + m.getValue();
                    System.out.println(message);
                }      
            default:
                break;
        }
    }


}
