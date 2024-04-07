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
public class Employee implements Comparable {
    private String name;
    private LocalDate hireDay;

    public Employee(String name, int year, int month, int day) {
        this.name = name;
        this.hireDay = LocalDate.of(year, month, day);
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        return name.compareTo(other.name);
    }
}
