
package Modelo;

public class UserService {

    public UserService() {
    }
    
    
    public java.util.List<test.User> listar(){
        try { // Call Web Service Operation
            test.NewWebService_Service service = new test.NewWebService_Service();
            test.NewWebService port = service.getNewWebServicePort();
            // TODO process result here
            
            //java.util.List<test.User> result = port.listar();
            //System.out.println("Result = "+result);
            return port.listar();
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }




}
