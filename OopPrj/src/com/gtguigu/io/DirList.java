package com.gtguigu.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirList {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
	}
}
class DirFilter implements FilenameFilter {
	String afn;

	DirFilter(String afn) {
		this.afn = afn;
	}

	public boolean accept(File dir, String name) {
		// Strip path information:
		String f = new File(name).getName();
		return f.indexOf(afn) != -1;
	}
}
