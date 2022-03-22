
/**
 @author Manuel Rodas
 * Algoritmos y estructura de datos
 * Hoja de trabajo 6 
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;



public class Read_Datos {

	public Read_Datos(){
		
	}

	/**
	 * Se crea un Arraylist, donde se guarden los datos del archivo 
	 * @return list
	 */
	
	public ArrayList leer(){
	   ArrayList<String> list = new ArrayList<>();
	   try {
	      File Li = new File("ListadoProducto.txt");
	      Scanner myReader = new Scanner(Li);
	   while (myReader.hasNextLine()) {
	      String linea = myReader.nextLine();
	      list.add(linea);
	      }
	   myReader.close();
	        } 
	   
	   catch (FileNotFoundException e) {
	          e.printStackTrace();
	        }
	   
	   
	   return list; 
	      }

	}

