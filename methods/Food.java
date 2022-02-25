class Food
{
		public static void main(String []a)
	{
		break_fast();
		
		break_fast("idly");

		float result=Food.break_fast(0.0f);
		System.out.println(result);
		
		break_fast("idly",34.99f);
		
		break_fast("having idly",39.99f," spicy taste");
		
		float response=break_fast(" chicken ", 45.99f , 200);
		System.out.println( response );
	
		float average=break_fast(" chicken ", 45.99f , 200,100);
		System.out.println("Avg price ="+ average );
	

	}


		static void break_fast()
		{
			System.out.println("having break fast");
		}



		static void break_fast(String name)
		{
			System.out.println("having  "+ name);
		}

		
		static float break_fast(float price)
		{
			price=39.99f;
			return price;
		}	


		static void break_fast(String name,float price)
		{
			System.out.println(name + price);	
		}


		static void break_fast(String name,float price,String taste)
		{
			System.out.println( name + " price=" + price + taste  );
		}


		static float break_fast(String name,float price,int quantity)
		{
			float totalprice=price*quantity;
			System.out.println("Total price for"+name+"="+totalprice);
			return totalprice;
		}
		
		static float break_fast(String name,float price,int quantity,int noOfpeople)
		{
			float totalprice=price*quantity;
			float avg=totalprice/noOfpeople;
			return avg;
		}
		
}




















