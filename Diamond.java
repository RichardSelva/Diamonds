/***************************************
*	file:Selva_AsciiArt
*	class:CS 141 - Programming and Problem Solving
*
*	assignment: program 4
*	date last modified: 2/14/2017
*
*	purpose: This program compares diamonds to each other and organizing it from the
*			 best size, clarity, color and cut to the worst.
****************************************/
import java.util.*;
//public class method
public class Diamond implements Comparable<Diamond>
{
	String stockNumber;
	double carot;
	String clarity;
	char color;
	String cut;
	//default constructor: We pass in default parameters and initialize variables.
	public Diamond(String initialStockNumber, double initialCarot, String initialClarity, char initialColor, String initialCut)
	{
		stockNumber = initialStockNumber;
		carot = initialCarot;
		clarity = initialClarity;
		color = initialColor;
		cut = initialCut;
	}
	//getStock method: return stockNumber of diamond
	public String getStock()
	{
		return stockNumber;
	}
	//getCarot method: return carot of diamond
	public double getCarot()
	{
		return carot;
	}
	//getClarity method: return clarity of diamond
	public String getClarity()
	{
		return clarity;
	}
	//getColor method: return color of diamond
	public char getColor()
	{
		return color;
	}
	//getCut method: return cut of diamond
	public String getCut()
	{
		return cut;
	}
	//toString method: returns data to caller
	public String toString()
	{
		return "Stock Number: " + stockNumber + " Carot: " + carot + " Clarity: " + clarity + " Color: " + color + " Cut: " + cut;
	}
	//compareto method: compares diamonds to each other based on carot, clarity or color and cut.
	public int compareTo(Diamond other)
	{
		if (carot > other.getCarot())
		{
			return -1;
		}
		
		else if (carot < other.getCarot())
		{
			return 1;
		}
		
		if(color < other.getColor())
		{
			return -1;
		}
		
		else if (color > other.getColor())
		{
			return 1;
		}
		
		if (clarity.compareTo(other.getClarity()) < 1)
		{
			return -1;
		}
		
		else if(clarity.compareTo(other.getClarity()) > 1)
		{
			return 1;
		}

		else
		{
			return 0;
		}
	}
}