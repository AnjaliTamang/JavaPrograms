/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.io.FileOutputStream;

/**
 *
 * @author user
 */
 class FileOutDemo {
     public static void main(String[] args) {
         try{
             
             FileOutputStream fout = new FileOutputStream("abc.txt");
             String s = "Rohit Sharma is my favourite player.";
             byte b[] = s.getBytes();
             fout.write(b);
             fout.close();
             System.out.println("Success...");
         }catch (Exception e){
             System.out.println("e");
         }
     }
}
