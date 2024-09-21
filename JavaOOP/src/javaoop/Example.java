/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.io.File;
import java.io.IOException;
public class Example {
    public static void main(String[] args) throws IOException
    {
        File f1  =new File("PK.txt");
        f1.createNewFile();
        System.out.println("File exists:" +f1.exists());
        //System.out.println("Location:" +f1.getPath());
        System.out.println("Location:" +f1.getAbsolutePath());
        System.out.println("Length:"+f1.length());
    }
}
