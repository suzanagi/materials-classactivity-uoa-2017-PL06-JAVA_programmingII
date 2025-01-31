package fuelconsumption;
public class DeluxeCar extends AdvancedCar {
	private int drivedWithPassHour;  //搭乗者を乗せて運転した時間
		
	/*DeluxeCarのコンストラクタはDeluxeCar(メーカー名, 燃費, エアコン効率)*/
    public DeluxeCar(String name, float fuelEconomy, float airCon){
    	super(name, fuelEconomy, airCon);
    }
    public void setData(int beginTime, int finishTime, int distance, int passHour){
    	super.setData(beginTime, finishTime, distance);
    	drivedWithPassHour = passHour;
    }
    public float calculateFuelConsumptionNewRegulations(){
    	usedFuel = super.calculateFuelConsumptionNewRegulations()
    			- (this.workTime - drivedWithPassHour) / this.airConFuelEconomy;
    	return usedFuel;
    }
}
