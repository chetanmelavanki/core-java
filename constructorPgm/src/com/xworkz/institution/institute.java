package com.xworkz.institution;

public class institute {
	public String namE;
	public String adresS;
	public String clgId;
	public double fees;
	public String course;
	public String dresscode;
	public String holliday;
	public int idNum;
	public boolean hostel;
	public int staffMembers;
	
	public institute(String name, String adress, String clgid, double fee, String cours, String descode, String holiday,int idnum, boolean hostl,int teacher)
	{
		namE = name;
		adresS = adress;
		clgId = clgid;
		fees = fee;
		course = cours;
		dresscode = descode;
		holliday = holiday;
		idNum =  idnum;
		hostel = hostl;
		staffMembers = teacher;
		System.out.println(namE +"\t"+ adresS + "\t" + clgId +  "\t" + fees + "\t" + course + "\t" + dresscode + "\t" + holliday + "\t" + idNum + "\t" + hostel + "\t" + staffMembers );
		
	}
	public void admission()
	{
		System.out.println("BCA Admission Started");
	}

	public void students()
	{
		System.out.println("Maximum 100 staudents for Admission");
	}
	
	public void classroom()
	{
		System.out.println("Morethan 15 classes");
	}
	
	public void principal()
	{
		System.out.println("Bhoosnurmath");
	}
	
	public void rating()
	{
		System.out.println("Overall rating 4.5/5 ");
	}
	

}
