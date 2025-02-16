/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pair3;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
public class PairTest3 {
    public static void main(String[] args) {
        var ceo = new Manager("Gus Greedy", 80000, 2003, 12, 15);
        var cfo = new Manager("Sid Sneaky", 60000, 2003, 12, 15);
        var buddies = new Pair<Manager>(ceo, cfo);
        printBuddies(buddies);
        
        ceo.setBonus(1_000_000);
        cfo.setBonus(500_000);
        Manager[] managers = {ceo, cfo};
        
        var result = new Pair<Employee>();
        minmaxBonus(managers, result);
        System.out.println("first: " + result.getFirst().getName()
            + ", second: " + result.getSecond().getName());
        
        maxminBonus(managers, result);
        System.out.println("first: " + result.getFirst().getName()
            + ", second: " + result.getSecond().getName());
    }
    
    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }
    
    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) {
            return;
        }
        
        Manager min = a[0];
        Manager max = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()) {
                min = a[i];
            }
            if (max.getBonus() < a[i].getBonus()) {
                max = a[i];
            }
        }
        
        result.setFirst(min);
        result.setSecond(max);
    }
    
    public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
        minmaxBonus(a, result);
        PairAlg.swapHelper(result); // OK--swapHelper captures wildcard typ
    }
    // can't write public static <T super manager> . . .
}
    