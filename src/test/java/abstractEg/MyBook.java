package abstractEg;

abstract class Book {
    String title;
    String author;
  
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
       abstract void display();
}
class MyBook extends Book{


    int price;
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author,int price){
        super(title,author);
        this.price =price;
    }

	@Override
	void display() {
		System.out.println();
		
	}
    
     
}
