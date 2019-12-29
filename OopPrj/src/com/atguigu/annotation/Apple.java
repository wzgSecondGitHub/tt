package com.atguigu.annotation;

public class Apple {
	@FruitName("orange")
	private String appleName;

	@FruitColor()
	private String appleColor;

	@FruitProvider(id = 2, name = "jiang西红富士集团", address = "jiang西省西安市延安路89号红富士大厦")
	private String appleProvider;

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleName() {
		return appleName;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void displayName() {
		System.out.println("水果的名字是：苹果");
	}
}
