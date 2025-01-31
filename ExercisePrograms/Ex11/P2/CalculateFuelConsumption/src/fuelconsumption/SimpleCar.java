package fuelconsumption;
/*SimpleCarはエアコンなし*/
public class SimpleCar {
	protected String maker;           //メーカー名
    protected float fuelEconomy;      //燃費
    protected int drivedDistance;     //運転距離
    protected float usedFuel;         //使った燃料

    /*SimpleCarのコンストラクタはSimpleCar(メーカー名, 燃費)*/
    public SimpleCar(String name, float fuelConsumption){
	maker = name;
	fuelEconomy = fuelConsumption;
    }
    public void setData(int distance){
	drivedDistance = distance;
    }
    public float calculateFuelConsumptionOldRegulations(){
	usedFuel = (float)drivedDistance / fuelEconomy;
	return usedFuel;
    }
    public float calculateFuelConsumptionNewRegulations(){
	usedFuel = (float)drivedDistance / fuelEconomy;
	return usedFuel;
    }
}
