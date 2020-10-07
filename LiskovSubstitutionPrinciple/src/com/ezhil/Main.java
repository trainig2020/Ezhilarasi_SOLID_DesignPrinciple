package com.ezhil;

public class Main {

	public void calculateArea(Rectangle r)
	{
	r.setBreadth(2);
	r.setLength(3);
	r.area();
	
	}
	
	public static void main(String[] args)
	{
	Main lsp = new Main();
	// An instance of Rectangle is passed
	System.out.println("Rectangle : ");
	lsp.calculateArea(new Rectangle());
	// An instance of Square is passed
	System.out.println("Square : ");
	lsp.calculateArea(new Square());
	}

}
