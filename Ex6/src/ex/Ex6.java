package ex;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ex6_1
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
	}

}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
