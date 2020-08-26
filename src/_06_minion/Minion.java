package _06_minion;

public class Minion {
	private String name = "Stuart";
	private String color = "Yellow";
	private String leader = "T-Rex";
	private int eyes = 1;
	Minion(String name,int eyes,String color,String leader){
		this.name = name;
		this.color = color;
		this.leader = leader;
		this.eyes = eyes;
	}
	String getName(){
		return name;
	}
	String	getColor() {
		return color;
	}String getMaster(){
		return leader;
	}
	int	getEyes() {
		return eyes;	
}
public void setName(String name) {
	this.name = name;
}
public void setColor(String color) {
	this.color = color;
}
public void setMaster(String leader) {
	this.leader = leader;
}
public void setEyes(int eyes) {
	this.eyes = eyes;
}

}