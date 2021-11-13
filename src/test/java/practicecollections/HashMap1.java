package practicecollections;
import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name, String author, String publisher,int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
public class HashMap1 {
	public static void main(String[] args) {
		//creating map of books
		Map<Integer,Book> mm = new HashMap<Integer,Book>();
		//Creating Book
		Book b1 = new Book(101," Yale"," YD Roy","Penguin publishing",112);
		Book b2 = new Book(102," YOLO"," Lisa Ray","Penguin publishing",112);
		Book b3 = new Book(103," London"," Deepika  Padukone","Penguin publishing",112);
		Book b4 = new Book(104," Thames"," Sara Khan","Penguin publishing",112);
		//adding books to Map
		mm.put(1,b1);mm.put(2,b2);mm.put(3,b3);mm.put(4,b4);
		//traversing map
		for(Map.Entry<Integer, Book> mu : mm.entrySet()) {
			int key = mu.getKey(); System.out.println(key +" details - ");
			Book b = mu.getValue();
			System.out.println(b.id + b.name + b.author +b.publisher + b.quantity);
		}
	}

}
