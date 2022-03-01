 public class Library 
{
	 
	private static void book()
	{
		System.out.println("Ramayan book");
	}
	
	static void book(String bookname)
	{
		System.out.println(bookname);
	}
	
	static void book(double price)
	{
		System.out.println(price);
	}
	
	public static void book(String name,String publication)
	{
		System.out.println(name + publication);
	}
	
	public static void book(int pages,String font)
	{
		System.out.println(pages + font);
	}
	
	public static void book(double price,int pages,String lang,char pageColor)
	{
		System.out.println(price +" "+ pages + lang +" "+ pageColor);
	}
	
	public static void main(String []args) {
		book();
	}

}
