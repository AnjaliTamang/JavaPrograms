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
class A {
    int x;
    public void f1()
    {
    int x;
}
}
class B extends A
{
    int x;
    public void f1(){
        int x;
        this.x = 5;
        super.x = 7;
    }
}