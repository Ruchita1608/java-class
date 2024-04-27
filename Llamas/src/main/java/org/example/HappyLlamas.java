package org.example;

import javax.swing.*;
import java.util.Scanner;

public class HappyLlamas {

    public HappyLlamas(){

    }

    /**
     * A method to determine if the provided trampolines will result in happy llamas.
     *
     * When llamas get together they like to bounce on trampolines.
     * However, llamas are very particular about the proper number of trampolines,
     * and are usually only happy if there are between 24 to 42 (inclusive!).
     * This only changes if the trampolines are made of ultra-bouncey NASA fabric.
     * In those cases, while they still require at LEAST 24, the llamas figure
     * the more trampolines the better!
     *
     * return true if the llamas will be happy with their trampolines,
     * or false otherwise.
     *
     * @param ultraBouncy True if trampolines are made of UltraBouncy NASA fabric.
     * @param trampolines The number of trampolines
     * @return boolean indicating if the llamas are happy
     */
        int noOfTrampolines;
        static boolean bouncy;
    public static boolean areTheLlamasHappy(boolean ultraBouncy, int trampolines){

        //throw new UnsupportedOperationException("Logic not yet supplied");

        try {
            if (ultraBouncy) {
                // Ultra-bouncy trampolines, llamas are happy with at least 24 trampolines
                bouncy= trampolines >= 24 && trampolines <= 42;
            } else {
                // Regular trampolines, llamas are happy with 24 to 42 trampolines (inclusive)
                bouncy= trampolines >= 24 && trampolines <= 42;
            }
        }

        catch (Exception e){
            System.out.println("Llamas are not happy");
        }
        return bouncy;
    }



    public static void main(String args[]){

        HappyLlamas hllamas= new HappyLlamas();

        int tramp;
        boolean bouncy;


        Scanner sc= new Scanner(System.in);

        System.out.println("How many trampolines are there?");
        tramp=sc.nextInt();

        System.out.println("Is trampoline extra bouncy ?");
        bouncy=sc.nextBoolean();

        hllamas.areTheLlamasHappy(bouncy,tramp);

    }
}
