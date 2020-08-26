package _04_tea_maker;

public class Tea_Maker_2 {
	public static void main(String[] args) {
TeaBag T = new TeaBag("Mint");
Kettle K = new Kettle();
Cup c = new Cup();
K.boil();
c.makeTea(T, K.getWater());
}
}