	import fuelconsumption.AdvancedCar;
	import fuelconsumption.DeluxeCar;
	import fuelconsumption.FuelConsumptionCalculation;
	import fuelconsumption.SimpleCar;

	public class TestPackage {
	    private SimpleCar[] cars;
	    private static int carNum = 5;
		
		public static void main(String[] args) {
			TestPackage t = new TestPackage();
			t.execute();
		}

		public TestPackage() {
			/* 配列を作成 */
			cars = new SimpleCar[carNum];
			/*指定されたデータでインスタンス化*/
			cars[0] = new DeluxeCar("Honda", 14.0f, 10.5f);
			cars[1] = new AdvancedCar("Toyota", 15.5f, 9.5f);
			cars[2] = new SimpleCar("Nissan", 13.0f);
			/*BusTaxiを追加する場合*/
			cars[3] = new BusTaxi("Mercedes", 6.6f, 11.5f);
			cars[4] = new BusTaxi("Mercedes", 6.6f, 11.5f);
			 
			/*指定されたデータをセッターで代入*/
			((DeluxeCar)cars[0]).setData(7, 18, 300, 10);
			((AdvancedCar)cars[1]).setData(7, 18, 200);
			((SimpleCar)cars[2]).setData(350);
			/*BusTaxiを追加する場合*/
			((BusTaxi)cars[3]).setData(7, 18, 200, 10);
			((BusTaxi)cars[4]).setData(7, 18, 200, 10);
			 
		  }
		
		public void execute(){
			/*FuelConsumptionCalculationを生成しオブジェクトを渡す*/
			FuelConsumptionCalculation f = new FuelConsumptionCalculation(cars);
			/*FuelConsumptionCalculationを用いて計算し表示する*/
			f.calculateFuelConsumption();
		}
}



