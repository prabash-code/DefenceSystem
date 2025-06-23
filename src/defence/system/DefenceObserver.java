/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author 94768
 */
public interface DefenceObserver {
    public void update( int sliderLevel );
    public void updateText(String text);
    public void setAreaClearedText(String text);
    
}
