package com.gtguigu.io;

class Weeble {

}

public class ArraySize {

	public static void main(String[] args) {
		//Arrays of Object
		Weeble[] a;
		Weeble[] b = new Weeble[5];
		Weeble[] c = new Weeble[4];
		for(int i=0; i<c.length; i++) {
			c[i] = new Weeble();
		}
		Weeble[] d = new Weeble[] {new Weeble(),new Weeble(),new Weeble()};
//		System.out.println("a.length="+a.length);
		System.out.println("b.length="+b.length);
		for(int i=0; i<b.length; i++) {
			System.out.println("b["+i+"]="+b[i]);
		}
		a = d;
		System.out.println(a.length);
		a = new Weeble[] {new Weeble(),new Weeble()};
		System.out.println("a.length="+a.length);
		//Arrays of primitives
		int[] e;
		int[] f = new int[5];
		int[] g = new int[4];
		for(int i=0; i<g.length; i++) {
			g[i] = i*i;
		}
		int[] h = {17,54,78};
		e = h;
		System.out.println("e.length="+e.length);
		e = new int[] {33,23};
		System.out.println("e.length="+e.length);
	}
}
