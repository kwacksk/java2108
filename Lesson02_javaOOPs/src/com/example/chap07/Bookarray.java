package com.example.chap07;

public class Bookarray {

	public static void main(String[] args) {
	book[] library = new Book[5];
	library[0] = new Book("태백산맥","조정래");
	library[1] = new Book("태백산맥","조정래");
	library[2] = new Book("태백산맥","조정래");
	library[3] = new Book("태백산맥","조정래");
	library[4] = new Book("태백산맥","조정래");
	for(int i=0; <library.lenght; i++) {
		library[i].showInfo();
	}
	}

}
