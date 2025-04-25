
package facade;

import facade.CheckFacade;

public class App {

    
    public static void main(String[] args) {
            CheckFacade usuario1 = new CheckFacade ();
            usuario1.buscar(19, 3, "Windows", "Computador");
        
            CheckFacade usuario2 = new CheckFacade ();
            usuario2.buscar(17, 1, "Mac", "Portatil");
    }
    
}
