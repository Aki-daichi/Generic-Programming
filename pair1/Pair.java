/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pair1;

/**
 *
 * @author author Cay Horstmann
 */
public class Pair<T> {
    private T first;
    private T second;
    
    public Pair() { 
        first = null; 
        second = null; 
    }
    
    public Pair(T first, T second) { 
        this.first = first; 
        this.second = second; 
    }
    
    public T getFirst() { 
        return first; 
    }
    
    public T getSecond() { 
        return second; 
    }
    
    public void setFirst(T newValue) {
        first = newValue; 
    }
    public void setSecond(T newValue) {
        second = newValue; 
    }
}
