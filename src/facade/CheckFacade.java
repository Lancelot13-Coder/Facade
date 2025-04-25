
package facade;

import api.SonicForcesAPI;
import api.SonicGenerationsAPI;
public class CheckFacade {
    
    private SonicForcesAPI sonicForcesAPI;
    private SonicGenerationsAPI sonicGenerationsAPI;
    
    public CheckFacade(){
           sonicForcesAPI = new SonicForcesAPI();
           sonicGenerationsAPI = new SonicGenerationsAPI();
    }
    
    public void buscar(int Version, int Cantidad, String SistemaOperativo, String Dispositivo){
           sonicForcesAPI.buscarVersion(Version, Cantidad, SistemaOperativo, Dispositivo);
           sonicGenerationsAPI.buscarVersion(Version, Cantidad, SistemaOperativo, Dispositivo);
    }
    
}
