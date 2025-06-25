/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence.system;

import java.util.ArrayList;

/**
 *
 * @author 94768
 */
public class DefenceSystemControllerObservable  {
     private int sliderLevel;
    private final ArrayList<DefenceObserver> defenceObserverList=new ArrayList<>();
    
    public void addDefenceObserver(DefenceObserver defence){
        defenceObserverList.add(defence);
    }
    
    public void removeDefenceObserver(DefenceObserver defence){
        defenceObserverList.remove(defence);
    }
    
    public void setSliderLevel(int sliderLevel){
        this.sliderLevel=sliderLevel;
        observerNotifyButtons();    
    }
    
    public void observerNotifyButtons(){
        for(DefenceObserver defenceObserver: defenceObserverList)
            defenceObserver.update(sliderLevel);
    }

    
      public void observerNotifyText(String text){
        for(DefenceObserver defenceObserver: defenceObserverList)
            defenceObserver.updateText(text);
    }
   
    public void setAreaCleared(String text){
        for(DefenceObserver defenceObserver: defenceObserverList)
            defenceObserver.setAreaClearedText(text);
    }
    
    public void sendPrivate(String text,String item){
    if("Helicopter".equalsIgnoreCase(item)){
            for(DefenceObserver defenceObserver:defenceObserverList){
              //  if(defenceObserver instanceof Helicopter){
                        defenceObserver.updateText(text);
              //  }
            }
            
    } else if ("Tank".equalsIgnoreCase(item)){
            for(DefenceObserver defenceObserver:defenceObserverList){
                if(defenceObserver instanceof Tank){
                        defenceObserver.updateText(text);
                }
            }
            
    }else if("Submerine".equalsIgnoreCase(item)){
            for(DefenceObserver defenceObserver:defenceObserverList){
                if(defenceObserver instanceof Submarine){
                        defenceObserver.updateText(text);
                }
            }
        }  
    }
}