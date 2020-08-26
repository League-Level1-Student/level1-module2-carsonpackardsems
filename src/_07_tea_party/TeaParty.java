package _07_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String status = "";
		if (isWoman == true) {
			if (isKnighted == true) {
				status = "Lady";
			} else {
				status = "Ms.";
			}
		} else {
			if (isKnighted == true) {
				status = "Sir";
			} else {
				status = "Mr.";
			}
		}
		return "Hello " + status + " " + name;
	}
}