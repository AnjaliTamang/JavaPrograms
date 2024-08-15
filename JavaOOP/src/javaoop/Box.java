/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author user
 */
class Box
{
private int l,b,h; //default value=0
public Box(int L, int B, int H)
{
l=L;
b=B;
h=H;
}
Box() //default constructor created only when user doesnot create a constructor
{
    
}
public static void main(String []args)
{
    Box obj = new Box(12,10,15);    //invoked implicitly when an obj is crated  
                                    //used to initialize objects 
     //Box b1 new Box();
}
}
 