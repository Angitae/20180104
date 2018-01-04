package association;

public class carMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.setModelName("audi");
		c.setCarPrice(50000000);
		Engine audiEngine = new Engine();
		audiEngine.setEngineType("가솔린");
		audiEngine.setDisplacement(5000);
		
		c.setCarEngine(audiEngine);
		
		c.display();
		System.out.println("========================");
		Car c2 = new Car("Benz", 80000000, "고급 휘발유", 4000);
		c2.display();
		System.out.println("========================");
		// c3방법 권장한다. (외부에서 받아서 쓰는거) 
		Car c3 = new Car("BMW", 60000000, new Engine("고급휘발유", 4000));
		c3.display();
		
		System.out.println(c.getModelName()+"의 엔진정보");
		c.getCarEngine().displayEngine();
	}

}
