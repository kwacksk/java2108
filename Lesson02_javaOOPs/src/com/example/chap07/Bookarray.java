package com.example.chap07;

public class Bookarray {

	public static void main(String[] args) {
	book[] library = new Book[5];
	library[0] = new Book("�¹���","������");
	library[1] = new Book("�¹���","������");
	library[2] = new Book("�¹���","������");
	library[3] = new Book("�¹���","������");
	library[4] = new Book("�¹���","������");
	for(int i=0; <library.lenght; i++) {
		library[i].showInfo();
	}
	}

}
