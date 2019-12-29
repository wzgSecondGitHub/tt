package com.atguigu.annotationexe;

public class TwoGen<T,V> {

	private T t;
	private V v;
	public TwoGen(T t1,V v1) {
		this.t = t1;
		this.v = v1;
	}
}
