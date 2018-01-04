package association;

public class Engine {
		private String engineType;// Engine type( using energy )
		private int displacement;// 배기량( cc )
		
		public Engine() {
			// TODO Auto-generated constructor stub
		}
		
		public Engine(String engineType, int displacement) {
			super();
			this.engineType = engineType;
			this.displacement = displacement;
		}
		public String getEngineType() {
			return engineType;
		}
		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		public int getDisplacement() {
			return displacement;
		}
		public void setDisplacement(int displacement) {
			this.displacement = displacement;
		}
		public void displayEngine(){
			System.out.println("엔진 타입 :   "+ engineType);
			System.out.println("배기량 (cc) :  "+ displacement);
		}
}
