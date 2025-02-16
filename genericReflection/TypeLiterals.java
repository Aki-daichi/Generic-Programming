/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package genericReflection;

import java.util.*;
/**
 * @version 1.01 2018-04-10
 * @author Cay Horstmann
 */
public class TypeLiterals {
    public static class Sample {
        ArrayList<Integer> nums;
        ArrayList<Character> chars;
        ArrayList<String> strings;
        public Sample() {
            nums = new ArrayList<>();
            nums.add(42); 
            nums.add(1729);
            
            chars = new ArrayList<>();
            chars.add('H'); 
            chars.add('i');
            
            strings = new ArrayList<>();
            strings.add("Hello"); 
            strings.add("World");
        }
    }
    
    private static <T> String join(String separator, ArrayList<T> elements) {
        var result = new StringBuilder();
        
        for (T e : elements) {
            if (result.length() > 0) {
                result.append(separator);
            }
            
            result.append(e.toString());
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) throws Exception {
        var formatter = new Formatter();
        
        formatter.forType(new TypeLiteral<ArrayList<Integer>>(){}, lst -> join(" ", lst));
        formatter.forType(new TypeLiteral<ArrayList<Character>>(){}, lst -> "\"" + join("", lst) + "\"");
        
        System.out.println(formatter.formatFields(new Sample()));
    }
}
