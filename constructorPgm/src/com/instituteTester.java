package com;

import com.xworkz.institution.institute;

public class instituteTester 
{
	public static void main(String []args)
	{
	institute inst = new institute( "Basaveshwar" , "BVVS" , "A2387" , 122222.28 , "BCA" , "White" , "every sunday and festival" , 12133 , true , 25);
	
	institute insti = new institute("Bgmit","bvvs","G2767",12633.34,"BE","Blue","every sunday and festival",23233,true,30);
	
	institute instit = new institute("S R Shettar","guledagudda","J3844",46486.98,"MCA","Blue","every sunday and festival",886786,true,35);
	
	inst.admission();
	inst.classroom();
	inst.principal();
	inst.rating();
	inst.students();
	
	} 

}
