/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.io.FileInputStream;

/**
 *
 * @author user
 */

class SimpleRead {
    public static void main(String[] args) {
        try{
            try (FileInputStream fin = new FileInputStream("abc.txt")) {
                int i=0;
                while((i = fin.read()) != -1){
                    System.out.print((char) i);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    } 
}

