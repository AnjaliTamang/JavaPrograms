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
class Cube {
    protected double
            height, width, depth;
    Cube(int x){
        System.out.println("inside default Constructor: CUBE");
    }
    double volume(){
        return height*width*depth;
    }
}
 
class CubeWeight extends Cube{
    double weight;
    CubeWeight(double h, double w, double d, double m)
    { super(5); //super works for default consructor so parameter should be passed
        System.out.println("inside Constructor CUBEWEIGHT");
        height = h;
        width = w;
        depth = d;
        weight = w;
    }
}
class CubeInherit{
    public static void main(String[] args) {
        CubeWeight cw1 = new
                     CubeWeight(10,10,10,20.5);
        CubeWeight cw2 = new 
                    CubeWeight(100, 100, 100, 200.5);
        System.out.println("cw1.volume=" +cw1.volume());
        System.out.println("cw2.volume=" +cw2.volume());
    }
}
