package com.atguigu.annotationexe;

import java.lang.reflect.Field;

/**
 * ×¢½â´¦ÀíÆ÷
 */
public class CarInfoUtil {

	public static void getCarInfo(Class<Car> clazz) {
		Field[] fs = clazz.getDeclaredFields();
		for(Field f:fs) {
			if(f.isAnnotationPresent(CarName.class)) {
				CarName c = (CarName)f.getAnnotation(CarName.class);
				System.out.println(c.value());
			}
		}
	}
}
