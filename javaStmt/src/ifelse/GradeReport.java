package ifelse;

public class GradeReport {
	String name, subject, result;
	int score;
	
	
	
	public GradeReport(String name, String subject, int score) {
		if (score>=90) {
			result = "A";
		} else if(score>=80) {
			result = "B";
		} else if(score>=70) {
			result = "C";
		} else if(score>=60) {
			result = "D";
		} else if(score>=50) {
			result = "E";
		} else if(score<50) {
			result = "F";
		} else {
			result = "잘 못 입력하셨습니다.";
			return;
		}
		
		this.name = name;
		this.subject = subject;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "\t" + subject + "\t" + score + "\t" + result;
	}
	
	
}
