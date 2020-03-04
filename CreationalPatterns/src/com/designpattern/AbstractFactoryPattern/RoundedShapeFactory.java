package com.designpattern.AbstractFactoryPattern;

import com.designpattern.FactoryPattern.Shape;

public class RoundedShapeFactory extends AbstractFactory {
	
	@Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RoundedRectangle();         
	      }else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	 
	      return null;
	   }
	}
 