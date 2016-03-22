package ifelse;

public class FirstGrade {
	String name;
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(String aName, int aScore, String bName, int bScore, String cName, int cScore) {
		if (aScore>bScore) {
			if (aScore>cScore) {
				score = aScore;
				name = aName;
			} else {
				score = cScore;
				name = cName;
			}
		} else {
			if (bScore>cScore) {
				score = bScore;
				name = bName;
			} else {
				score = cScore;
				name = cName;
			}
		}
	}
	
}
