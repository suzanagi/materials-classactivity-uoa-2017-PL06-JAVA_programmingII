package fuelconsumption;

public class AdvancedCar extends SimpleCar {
	protected float airConFuelEconomy; //エアコン効率
    protected int workTime;            //運用時間
    
    /*AdvancedCarのコンストラクタはAdvancedCar(メーカー名, 燃費, エアコン効率)*/
    public AdvancedCar(String name, float fuelEconomy, float airCon){
	super(name, fuelEconomy);
	this.airConFuelEconomy = airCon;
    }
    public void setData(int beginTime, int finishTime, int distance){
        super.setData(distance);
	workTime = finishTime - beginTime;
    }
    public float calculateFuelConsumptionOldRegulations(){
	usedFuel = super.calculateFuelConsumptionNewRegulations()
	    + (float)workTime / airConFuelEconomy;
	return usedFuel;
    }
    public float calculateFuelConsumptionNewRegulations(){
	usedFuel = super.calculateFuelConsumptionNewRegulations()
	    + (float)workTime / airConFuelEconomy;
	return usedFuel;
    }
}
