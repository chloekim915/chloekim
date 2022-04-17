package package3.model.vo;

public class Dog extends Animal{
	public String PLACE = "�ְ�ī��";
	private int weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	public String getPLACE() {
		return PLACE;
	}

	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		System.out.println(super.toString()+"�����Դ� "+weight+"kg �Դϴ�.");
	}
}
