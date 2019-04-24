import java.util.Scanner;
public abstract class Book {
	
	private String title;
	private double price;
	
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
		
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	
	
	abstract void setPrice();
	
	static class Fiction extends Book{
		
		public Fiction(String title, double price) {
			super(title, price);
			
		}

		void setPrice() {}
	}
	
	
	static class NonFiction extends Book{
		
		public NonFiction(String title, double price) {
			super(title, price);
		}
		void setPrice() {}
	}
	
	public static void main(String[] args) {
		
		Fiction FBook1 = new Fiction("Ender's Game", 15.55);
		Fiction FBook2 = new Fiction("Neuromancer", 8.67);
		Fiction FBook3 = new Fiction("1984", 20.13);
		NonFiction NFBook1 = new NonFiction("Rubicon", 20.15); 
		NonFiction NFBook2 = new NonFiction("Sapiens", 15.10);
		
		Book[] bookArray = new Book[5];
		bookArray[0] = FBook1;
		bookArray[1] = FBook2;
		bookArray[2] = FBook3;
		bookArray[3] = NFBook1;
		bookArray[4] = NFBook2;
		
		int programDone = 0;
		Scanner scan = new Scanner(System.in);
		
		
		while(programDone != 5) {
			
			System.out.println("1.) List all books in the list.");
			System.out.println("2.) List all fiction titles");
			System.out.println("3.) List all non-fiction titles");
			System.out.println("4.) Choose multiple books and see total cost.");
			System.out.println("5.) Exit.");
			System.out.println("Please enter a number: ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch (choice) {
			case 1: 
				// loops through bookArray and prints all titles
				for(int i = 0; i < bookArray.length; i++) {
					System.out.println(bookArray[i].getTitle());
				}
				break;
			case 2: 
				// hardcoded to print just fiction titles
				System.out.println(bookArray[0].getTitle());
				System.out.println(bookArray[1].getTitle());
				System.out.println(bookArray[2].getTitle());
				break;
			case 3: 
				// hardcoded to print just non-fiction titles
				System.out.println(bookArray[3].getTitle());
				System.out.println(bookArray[4].getTitle());
				break;
			case 4:
				// prints all books with assigned numbers
				for(int i = 0; i < bookArray.length; i++) {
					int x = i + 1;
					System.out.println(x + ". " + bookArray[i].getTitle());
				}
				System.out.println("Please enter book numbers in the format \"3 1 4\":");
				// takes one line input with book numbers and parses + stores the integers
				String input = scan.nextLine();
				String[] bookNums = input.split(" ");
				double totalPrice = 0;
				
				// loop through the book numbers and increment to total price
				for(int i = 0; i < bookNums.length; i++) {
					int bookN = Integer.parseInt(bookNums[i]) - 1; 
					totalPrice += bookArray[bookN].getPrice();
					
				}
				
				//print out final price 
				System.out.println("$" + totalPrice);
				break;
			case 5: 
				// outer loop looks for 5 to break 
				programDone = 5;
				break;
				
				
			
				
			}
			String wait = scan.nextLine();
			
			
		}
		
		
	}
	
		
}
