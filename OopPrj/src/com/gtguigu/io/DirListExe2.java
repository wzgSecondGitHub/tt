package com.gtguigu.io;

import java.io.File;
import java.io.FilenameFilter;

public class DirListExe2 {

	/**
	 * 创建匿名内部类
	 */
	public FilenameFilter fileFilter(String fileName) {
		return new FilenameFilter() {
			String afn = fileName;
			@Override
			public boolean accept(File dir, String name) {
				return name.indexOf(afn) != -1;
			}
		};
	}
	public static void main(String[] args) {
		File f = new File(".");
		String[] s;
		if(args[0].length()==0) {
			s = f.list();
		}else {
			s = f.list(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					// TODO Auto-generated method stub
					return false;
				}
			});
		}
		for(String str:s) {
			System.out.println(str);
		}
	}
}
