package fuelconsumption;
public class FuelConsumptionCalculation {

	private double fuelConsumptionOldRegulation = 0;
    private double fuelConsumptionNewRegulation = 0;
    private SimpleCar[] cars;
    private static int carNum = 4;
	
	public static void main(String[] args) {
		FuelConsumptionCalculation f = new FuelConsumptionCalculation();
		f.calculateFuelConsumption();
	}

	public FuelConsumptionCalculation() {
		/* 配列を作成 */
		cars = new SimpleCar[carNum];
		/*指定されたデータでインスタンス化*/
		cars[0] = new DeluxeCar("Honda", 14.0f, 10.5f);
		cars[1] = new AdvancedCar("Toyota", 15.5f, 9.5f);
		cars[2] = new SimpleCar("Nissan", 13.0f);
		cars[3] = new DeluxeCar("Van(Nissan)", 10.5f, 6.0f);
		/*指定されたデータをセッターで代入*/
		((DeluxeCar)cars[0]).setData(7, 18, 300, 10);
		((AdvancedCar)cars[1]).setData(7, 18, 200);
		((SimpleCar)cars[2]).setData(350);
		((DeluxeCar)cars[3]).setData(7, 18, 400, 7);
	 }
	
	 public FuelConsumptionCalculation(SimpleCar[] cars) {
	      this.cars = cars;
	   } 
	    
	 public void calculateFuelConsumption() {
		/* your code to calculate values of
		   fuelConsumptionOldRegulation and
		   fuelConsumptionNewRegulation is here */
		System.out.println("In Old Regulations, It costs " 
				   + getFuelConsumptionOldRegulations() + " Liters.");
		System.out.println("In New Regulations, It costs "
				   + getFuelConsumptionNewRegulations() + " Liters.");
		System.out.println("It can save " + (getFuelConsumptionOldRegulations() 
						     - getFuelConsumptionNewRegulations()) 
				   + " Liters per day.");
	    }
	    double getFuelConsumptionOldRegulations() {
	    		/* すべての車のOldRegulationsの消費燃料の合計を出す */
	    	fuelConsumptionOldRegulation = 0.0;
	    	for(int i = 0; i < cars.length; i++)
	    		fuelConsumptionOldRegulation += cars[i].calculateFuelConsumptionOldRegulations();
	    	return fuelConsumptionOldRegulation;
	    }
	    double getFuelConsumptionNewRegulations() {
	    		/* すべての車のNewRegulationsの消費燃料の合計を出す */
	    	fuelConsumptionNewRegulation = 0.0;
	    	for(int i = 0; i < cars.length; i++)
	    		fuelConsumptionNewRegulation += cars[i].calculateFuelConsumptionNewRegulations();
	    	return fuelConsumptionNewRegulation;
	    }
}
