package classTest;

public class Student {
	int kor;
	int eng;
	int math;
	int studnetNumber;
	int total;
	double avg;
	
	
	public Student(int kor, int eng, int math, int studnetNumber) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.studnetNumber = studnetNumber;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}
	
	
}
