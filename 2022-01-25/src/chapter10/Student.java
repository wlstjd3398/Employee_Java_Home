package chapter10;

public class Student {

	int kor;
	int eng;
	int mat;
	
	double avg;
	
//	 ��ȯŸ�� �޼����̸� (�Ű�����) {
//	 �ҽ��ڵ�
//	 }
	// ��ȯŸ�� �𸣰����� �������
	// �޼����̸��� �𸣰����� �������
	// �Ű������� �𸣰����� �������
	
	// ����� ����� �޼���
	// st1.kor �������� ����
	// st1 �ȿ� ����ִ� ���� ������ ����Ҽ� �ֱ⿡ this ��밡��
	// return ����ʿ� ������ void ����
	// �Ű������� �����ϰ� ������ ����ϰ� ������ �Ű����� �������
	void calcAvg() {
		int total = this.kor + this.eng + this.mat;
		this.avg = (double) total / 3;
	}
	
	// �ݺ������� ����ϴ� �ڵ�� "��ü�� Ư¡�� �ο��ϱ�" �޼���
	// ��ü�� Ư¡�� �ο��ϱ⸦ �޼����̸����� �׳� ���İ�� �����ؼ� �ֱ�
	// Ex2�� give..(���ڵ�)�� �־ Student �ͼ� �Ű������� �־ �Ʒ� this�� �����ؼ� �ذ� �� �� ����
	void giveCharacteristicsToObjects(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
}
