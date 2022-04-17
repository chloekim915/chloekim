package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		
		animal[0] = new Dog("ÄáÀÌ", "Çªµé", 3);
		animal[1] = new Dog("»Ñ¶ì", "½ºÇÇÃ÷", 7);
		animal[2] = new Dog("¹¶Ä¡", "¸»Æ¼Áî", 5);
		animal[3] = new Dog("»Ç¼õ", "ºñ¼õÇÁ¸®Á¦", 10);
		animal[4] = new Cat("¸¸µÎ", "ÄÚ¼ô", "ÇÑ±¹", "ÁÖÈ²");
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].speak();
		}
	}

}
