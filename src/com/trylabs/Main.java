package com.trylabs;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите коэфициэнты для квадратного уравнения a b c");
    Scanner scanner = new Scanner(System.in);
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	int c=scanner.nextInt();
	int d=b*b-4*a*c;
	if (d>0){
	    double x1=(-b-sqrt(d))/2*a ;
	    double x2=(b-sqrt(d))/2*a ;
	    System.out.println( "х1 ="+x1+"\nx2 ="+x2 );
        } else if (d == 0) { double x = -b/2*a;
        System.out.println( "x="+x );}
     else {System.out.println("Реальных корней нет");
	}
    }
}
