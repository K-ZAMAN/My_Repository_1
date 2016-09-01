package com.zaman.test1;

import java.util.ArrayList;

public class MultidimentionalArray {

	public static void main(String[] args) {

		ArrayList<Allin> list = new ArrayList<Allin>();
		Allin lst = new Allin();
		lst.setAddress("my home");
		lst.setName("Zaman");
		lst.setPhoneNumber(34567890);
		list.add(lst);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("the name : " +lst.getName()+" \n\t\t"+lst.getAddress());

		}

	}

}
