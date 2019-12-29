package com.gtguigu.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 目录列表器
 */
public class DirListExe {

	public static void main(String[] args) {
		File f = new File(".");//当前目录
		String[] ss;
		if(args.length==0) {
			ss = f.list();
		}else {
			ss = f.list(new FileFilter(args[0]));
		}
		for(String s:ss) {
			System.out.println(s);
		}
	}
}
class FileFilter implements FilenameFilter{
	String s;
	public FileFilter(String fileNm) {
		this.s = fileNm;
	}
	@Override
	public boolean accept(File dir, String name) {
		String fileNm = new File(name).getName();
		return fileNm.indexOf(s) != -1;
	}
	
}
