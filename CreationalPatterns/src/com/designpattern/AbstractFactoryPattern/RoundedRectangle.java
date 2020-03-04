package com.designpattern.AbstractFactoryPattern;

import com.designpattern.FactoryPattern.Shape;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		 System.out.println("Inside RoundedRectangle::draw() method.");
	}

}
