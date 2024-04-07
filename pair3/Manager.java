/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pair3;

import java.time.LocalDate;
/**
 *
 * @author Dzaka Fadhlillah Hakim
 */
public class Manager extends Employee implements Comparable {
    private double bonus;
    
    public Manager(String name, double bonus, int year, int month, int day) {
        super(name, year, month, day);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
