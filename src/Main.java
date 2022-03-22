

/**
 * @author Manuel Rodas
 * Algoritmos y estructura de datos
 * Hoja de trabajo 6 
 */

import java.io.IOException;
import java.lang.invoke.VarHandle.AccessMode;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		int opcion2 = 0; 
		int hash = 0; 
        boolean salir=false; 
        
        //lector del docuemnto txt
        Read_Datos arch = new Read_Datos(); 
        Scanner scan = new Scanner(System.in);
        
        //Instnaciar los MAP
        Mapas map = new Mapas();
        
        //Arraylist con los objetos en la lista txt
        ArrayList<String> datos = new ArrayList<>();
        datos=arch.leer(); 
        map.Pro(datos);
        
        //Primer menu a usar 
        String menuInicial = "\n---------------Menu Inicial----------------- \n" +
        		"\nColoque el tipo de MAP que desea usar: \n" +
                "1. HashMap\n" +
                "2. TreeMap\n" +
                "3. LinkedHashMap\n";
        
        
        //Segundo menu a usar 
        String SegundoMenu = "\nSeleccione la opcion quer desea usar: \n" +
                "1. Nuevo Producto\n" +
                "2. Ver producto ya en tienda\n" +
                "3. Ver categorias\n" +
                "4. Ver categorias ordenadas\n" +
                "5. Ver informacion completa\n" +
                "6. Salir\n";   
        System.out.println(menuInicial);
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Opcion invalida, porfavor ingresar una opcion correcta");
            }  
            
        //Opciones de primer menu     
        switch (opcion) {
            case 1:
                hash=1; 
                map.Hash();
                break;
            case 2:
                hash=2; 
                map.Tree();
                break;
            case 3:
                hash=3;
                System.out.println(hash);
                map.Linked(); 
                break;
            default:
                System.out.println("Opcion invalida, porfavor ingresar una opcion correcta");
                break;
        }                
        while (salir == false) {
            System.out.println(SegundoMenu); 
            try {
                opcion2 = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Opcion invalida, porfavor ingresar una opcion correcta");
            }
            
            
            //Opciones de segundo menu 
            switch (opcion2) {
                case 1:
                    System.out.println("Nombre de la categoria:");
                    String v1=scan.nextLine(); 
                    System.out.println("Nombre del producto: ");
                    String v2=scan.nextLine(); 
                    map.AddValor(v1, v2, hash);
                    break;
                case 2:
                    System.out.println("Nombre de producto a buscar: ");
                    String name=scan.nextLine();
                    map.Nombre_de_producto(name, hash);
                    break;
                case 3: 
                     map.Pro_producto(hash);   
                     break;  
                case 4:
                    map.Pro_producto_nombres(hash);
                    break;   
                case 5:
                    map.Everything(hash);;
                    break;          
                case 6: 
                    System.out.println("Cerrando programa........................ GRACIAS");
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion invalida, porfavor ingresar una opcion correcta");
                    break;
            }         
        }
    }

}
