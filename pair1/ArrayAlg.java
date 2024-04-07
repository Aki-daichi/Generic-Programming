/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pair1;

/**
 * @version 1.01 2012-01-26
 * @author Cay Horstmann
 */
class ArrayAlg {
    /**
    * Gets the minimum and maximum of an array of strings.
    * @param a an array of strings
    * @return a pair with the min and max value, or null if a is null or empty
    */
    public static Pair<String> minmax (String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        
        String min = a[0];
        String max = a [0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a [i];
            }
            
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }                   
        }
        return new Pair<>(min,max);
    }
}
