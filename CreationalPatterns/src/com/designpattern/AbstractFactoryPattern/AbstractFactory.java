package com.designpattern.AbstractFactoryPattern;

import com.designpattern.FactoryPattern.Shape;

public abstract class AbstractFactory {
	 abstract Shape getShape(String shapeType) ;
}
