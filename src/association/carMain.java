package association;

public class carMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.setModelName("audi");
		c.setCarPrice(50000000);
		Engine audiEngine = new Engine();
		audiEngine.setEngineType("���ָ�");
		audiEngine.setDisplacement(5000);
		
		c.setCarEngine(audiEngine);
		
		c.display();
		System.out.println("========================");
		Car c2 = new Car("Benz", 80000000, "��� �ֹ���", 4000);
		c2.display();
		System.out.println("========================");
		// c3��� �����Ѵ�. (�ܺο��� �޾Ƽ� ���°�) 
		Car c3 = new Car("BMW", 60000000, new Engine("����ֹ���", 4000));
		c3.display();
		
		System.out.println(c.getModelName()+"�� ��������");
		c.getCarEngine().displayEngine();
	}

}
