package association;

public class Car {
		private String modelName;// 모델명
		private int carPrice;// 가격
		private Engine carEngine;// 엔진  -> 포함 관계 ( has a 관계) < Direct Association>
		// ->  car 클래스와 Engine 클래스의 포함관계
		public Car() {
			// TODO Auto-generated constructor stub
		}
		
		// 엔진 정보를 전달받아 엔진 인스턴스를 생성하여 포함
		public Car(String modelName, int carPrice, String engineType, int displacement) {
			super();
			this.modelName = modelName;
			this.carPrice = carPrice;
			carEngine = new Engine(engineType, displacement);
		}
		
		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public int getCarPrice() {
			return carPrice;
		}

		public void setCarPrice(int carPrice) {
			this.carPrice = carPrice;
		}

		public Engine getCarEngine() {
			return carEngine;
		}

		public void setCarEngine(Engine carEngine) {
			this.carEngine = carEngine;
		}

		public void display(){
			System.out.println("모델명 : "+ modelName);
			System.out.println("가격 : "+ carPrice);
		
			// 인스턴스에 저장된 필드 값 출력
			// Engine 인스턴스가 존재하지 않을 경우  NullPointerException 발생
			System.out.println("엔진 타입 : "+ carEngine.getEngineType() );
			System.out.println("배기량(cc) : "+ carEngine.getDisplacement());
			
//			carEngine.displayEngine();
		}
		// 클래스 외부에서 엔진 인스턴스를 전달받아 포함 -> 권장사항 ( 위는 권장 X)
		public Car(String modelName, int carPrice, Engine carEngine) {
			super();
			this.modelName = modelName;
			this.carPrice = carPrice;
			this.carEngine = carEngine;
		}
		
		
	
}
