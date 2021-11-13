package com.finalkeyword;


class Bike9{  
	final void run(){  
		System.out.println("running");
	} 
}
class Honda extends Bike9{
	public static void main(String args[]){  
		Honda bj = new Honda();
		bj.run();  
	}//end of class  
}
