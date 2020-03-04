package com.designpattern.AbstractFactoryPattern;

import com.designpattern.FactoryPattern.Rectangle;
import com.designpattern.FactoryPattern.Shape;
import com.designpattern.FactoryPattern.Square;

public class ShapeFactory extends AbstractFactory {
	   @Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
	      return null;
	   }
	}