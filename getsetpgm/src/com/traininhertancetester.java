package com;

import com.xworkz.oops.inheritance.bullet;
import com.xworkz.oops.inheritance.metro;

public class traininhertancetester {
	public static void main(String[] args) {
		metro metr=new metro();
		bullet met=new bullet();
		
		metr.Ac_nonAc="ac";
		System.out.println(metr.Ac_nonAc);
		
		metr.travelling="travel to destination";
		System.out.println(metr.travelling);
		
		metr.bhogi=28;
		System.out.println(metr.bhogi);
		
		metr.service="goods and people";
		System.out.println(metr.service);
		
		metr.station="kuvempu ";
		System.out.println(metr.station);
		
		metr.platform();
		metr.booking();
		
		metr.name="metro";
		System.out.println(metr.name);
		
		metr.electric="electric metro trsin";
		System.out.println(metr.electric);
		
		metr.noOftrain=24;
		System.out.println(metr.noOftrain);
		
		metr.digitalticekt="qr code ticket";
		System.out.println(metr.digitalticekt);
		
		metr.autoDoor="metro has automatioc door mode";
		System.out.println(metr.autoDoor);
		
		metr.time();
		metr.station();
		
		
		met.bullet();
		met.time();
		
		
	}

}
