/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author 94768
 */
public class Main {
    public static void main(String[] args) {
            //observable
            DefenceSystemControllerObservable defenceSystemControllerObesrvable=new  DefenceSystemControllerObservable();
            
              MainController mainController=new MainController( defenceSystemControllerObesrvable);
    
              Helicopter helicopter=new Helicopter();
              Submarine submarine=new Submarine();
              Tank tank=new Tank();
              
              helicopter.setMainController(mainController);
              submarine.setMainController(mainController);
              tank.setMainController(mainController);
              
             //create obesrvers
            defenceSystemControllerObesrvable.addDefenceObserver(helicopter);
             defenceSystemControllerObesrvable.addDefenceObserver(submarine);                                                                                           
             defenceSystemControllerObesrvable.addDefenceObserver(tank);
             
            
             
             
         
            
           
    }
    
}
