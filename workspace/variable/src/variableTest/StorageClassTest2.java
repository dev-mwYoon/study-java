package variableTest;

public class StorageClassTest2 {
	public static void main(String[] args) {
		StorageClassTest1 object = new StorageClassTest1();
		
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s(); // static ������ Ŭ������ ������ �ؾ��Ѵ�. static ���� = Ŭ���� ����.
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		object = new StorageClassTest1(); // static �ʵ�� new�� ������ ���� �ʴ´�. static�� �����Ϸ��� �ø���.(��� �޸𸮿� �ö� �ִ´�.)
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		object.increaseData_s();
		
		
		
		
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object = new StorageClassTest1(); // �ʱ�ȭ�� �ǰ� �ٽ� ���� �����Ѵ�. ������ �ִ� ���� ����.
////		��, ���������� new�� ������ ������ �ִ� �ּ� ���� ���ο� �ּ� ���� ��� ���ϱ� ������ �ִ� �ּ� ���� �������� ���� �����Ѵ�.
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();		
//		
		
	}
}
