class FuelConsumptionCalculation {
    private double fuelConsumptionOldRegulation = 0;
    private double fuelConsumptionNewRegulation = 0;
    private SimpleCar[] cars;
    private static int carNum = 4;
    
    public static void main(String[] args){
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
    
    private void calculateFuelConsumption() {
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
    float getFuelConsumptionOldRegulations() {
	/* すべての車のOldRegulationsの消費燃料の合計を出す */
	float usedFuel = 0.0f;
	for(int i = 0; i < carNum; i++)
	    usedFuel += cars[i].calculateFuelConsumptionOldRegulations();
	return usedFuel;
    }
    float getFuelConsumptionNewRegulations() {
	/* すべての車のNewRegulationsの消費燃料の合計を出す */
	float usedFuel = 0.0f;
	for(int i = 0; i < carNum; i++)
	    usedFuel += cars[i].calculateFuelConsumptionNewRegulations();
	return usedFuel;
    }
}

/*SimpleCarはエアコンなし*/
class SimpleCar{
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

class AdvancedCar extends SimpleCar{
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

class DeluxeCar extends AdvancedCar{
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
