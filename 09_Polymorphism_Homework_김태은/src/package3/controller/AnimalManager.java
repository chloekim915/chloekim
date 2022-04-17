package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		
		animal[0] = new Dog("����", "Ǫ��", 3);
		animal[1] = new Dog("�Ѷ�", "������", 7);
		animal[2] = new Dog("��ġ", "��Ƽ��", 5);
		animal[3] = new Dog("�Ǽ�", "���������", 10);
		animal[4] = new Cat("����", "�ڼ�", "�ѱ�", "��Ȳ");
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}
	}

}
