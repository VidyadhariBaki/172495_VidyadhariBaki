package com.cg.lambda;

public class ArthematicOperations {
public static void main(String[] args) {
	
Calculations addition=(x,y)->x+y;
System.out.println("Addition= "+addition.arthmeticOperation(12,5));

Calculations substraction=(x,y)->x+y;
System.out.println("substraction= "+substraction.arthmeticOperation(32,4));

Calculations multiplication=(x,y)->x+y;
System.out.println("multiplication= "+multiplication.arthmeticOperation(3,6));

Calculations division=(x,y)->x+y;
System.out.println("division= "+division.arthmeticOperation(50,3));

}
}
