package com.examle.chapter06;

public class School {
	//2. Ŭ���� ���ο��� static ���� �����ϰ� ������ �ν��Ͻ� ����
	private static School instance = new School();
	//1.�����ڴ� access modifier private ���� �Ѵ�.
	private School1() {
		//none operation
		//3.�ܺο��� ������ �� �ֵ��� public �޼��带 �����.
		public static School getInstance() {
			if(instance == null) {
				instance = new School
			}
		}
	}

}
