package Presentation_Layer;
import java.io.*;
import java.util.*;

import Presentation_Layer.Presentation.Presented;

import java.math.*;
public class SimpleIntrest_CompoundIntrest implements Presented {
	public static void main(String[] args) {
		SimpleIntrest_CompoundIntrest object=new SimpleIntrest_CompoundIntrest();
		Scanner scanObject=new Scanner(System.in);
		System.out.format("Principle Amount : ");
		int Principle_Amount=scanObject.nextInt();
		System.out.format("Rate of Interest : ");
		int Rate_Of_Interest=scanObject.nextInt();
		System.out.format("Time : ");
		int Time=scanObject.nextInt();
		System.out.format("Simple Interest : %d\n",object.Simple_Interest(Principle_Amount,Rate_Of_Interest,Time));
		System.out.format("Compound Interest : %d",object.Compound_Interest(Principle_Amount,Rate_Of_Interest,Time));

	}

	public int Simple_Interest(int Principle_Amount, int Rate_Of_Interest, int Time) {
		int Simple_Interest_result=(Principle_Amount*Time*Rate_Of_Interest)/100;
		return Simple_Interest_result;
	}

	public int Compound_Interest(int Principle_Amount, int Rate_Of_Interest, int Time) {
		double Compound_Interest_result=Principle_Amount*(Math.pow(1.0+Rate_Of_Interest/100.0,Time)-1.0);
		//float result=(float)Compound_Interest_result;
		return (int)Math.round(Compound_Interest_result);
	}
}
