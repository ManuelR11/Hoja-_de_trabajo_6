/**
 * 
 */

/**
 * @author rodas
 *
 */
public class generics<T> {

    T prod; 

    generics(T o){
    	prod=o;
    }

    T getOb(){
        return prod; 
    }

    public void tipo(){
        System.out.println("Tipo T: "+ prod.getClass().getName());
    }
}
