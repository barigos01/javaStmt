package whileloop;

public class Trinomial {
	private String name, result;
	private int score, kor, eng, math, avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int score) {
		this.avg = (int)(kor + eng + math) / 3;
	}

	public String getResult() {
		return result;
	}

	public void setResult(int avg) {
		this.result = (avg>=60) ? "합격" : "불합격";
	}

	@Override
	
	public String toString() {
		return "성적표 [이름=" + name + ", 국어=" + kor + ", 영어=" + eng +
				", 수학=" + math + ", 평균=" + avg + ", 합격여부=" + result + "]";
	}
	
}
