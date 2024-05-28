package practice;

public class ObjectTest {
	int i;// declaration
	int j; // declaration
	public ObjectTest(){//constructor
		i =10;
		j =20;
	}
	public ObjectTest(int i,int j) {
		this.i=i;
		this.j=j;
	}
	
	public static void main(String[] args) {
		
		ObjectTest t1=new ObjectTest();
		ObjectTest t2=new ObjectTest(15,25);
		ObjectTest t3=new ObjectTest(80,50);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.add());
		System.out.println(t3.add());
		
	}
	public int add() {
		return i+j;
	}

}
