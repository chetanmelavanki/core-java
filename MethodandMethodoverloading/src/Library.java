 public class Library 
{
	 
	private static void book()
	{
		System.out.println("Ramayan book");
	}
	
	static void bookname()
	{
		System.out.println("Ramayan book");
	}
	
	static void bookPrice(double price)
	{
		System.out.println(price);
	}
	
	public static void bookAuthor(String name,String publication)
	{
		System.out.println(name + publication);
	}
	
	public static void bookPages(int page,String font)
	{
		System.out.println(page + font);
	}
	
	public static void book(double price,int pages,String lang,char pageColor)
	{
		System.out.println(price +" "+ pages + lang +" "+ pageColor);
	}
	
	public static void main(String []args) {
		book();
	}

}
