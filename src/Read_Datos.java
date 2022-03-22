/**
 * 
 */

/**
 * @author rodas
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;



public class Read_Pro {

	public Read_Pro(){
		
	}

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

