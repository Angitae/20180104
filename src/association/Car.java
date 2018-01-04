package association;

public class Car {
		private String modelName;// �𵨸�
		private int carPrice;// ����
		private Engine carEngine;// ����  -> ���� ���� ( has a ����) < Direct Association>
		// ->  car Ŭ������ Engine Ŭ������ ���԰���
		public Car() {
			// TODO Auto-generated constructor stub
		}
		
		// ���� ������ ���޹޾� ���� �ν��Ͻ��� �����Ͽ� ����
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
			System.out.println("�𵨸� : "+ modelName);
			System.out.println("���� : "+ carPrice);
		
			// �ν��Ͻ��� ����� �ʵ� �� ���
			// Engine �ν��Ͻ��� �������� ���� ���  NullPointerException �߻�
			System.out.println("���� Ÿ�� : "+ carEngine.getEngineType() );
			System.out.println("��ⷮ(cc) : "+ carEngine.getDisplacement());
			
//			carEngine.displayEngine();
		}
		// Ŭ���� �ܺο��� ���� �ν��Ͻ��� ���޹޾� ���� -> ������� ( ���� ���� X)
		public Car(String modelName, int carPrice, Engine carEngine) {
			super();
			this.modelName = modelName;
			this.carPrice = carPrice;
			this.carEngine = carEngine;
		}
		
		
	
}
