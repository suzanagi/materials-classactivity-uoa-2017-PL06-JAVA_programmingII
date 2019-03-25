class Car{
    int horsePower;      //horsePower (hp)
    int speed;           //speed (km/h)
    float fuelConsumption; //fuelConsumption (km/liter)
    float gasTank;         //gasTank (liter)
    int travelledTime;   //travelledTime (h)

    /*Constructor*/
    Car(){
	horsePower = 90;
	speed = 0;
	fuelConsumption = 10.1f;
	gasTank = 40.0f;
	travelledTime = 0;
    }

    /*SpeedUp*/
    void speedUp(int increaseSpeed){
	speed += increaseSpeed;
    }

    /*ApplyBrakes*/
    void applyBrakes(int decreaseSpeed){
	speed -= decreaseSpeed;
    }

    /*TravelledTimeUp*/
    void travelledTimeUp(int increaseTime){
	travelledTime += increaseTime;
    }

    /*PrintStateTank*/
    void printStateTank(){
	float usedFuel;
	usedFuel = (float)travelledTime * ((float)speed / fuelConsumption);
	System.out.print("Gas tank: ");
	System.out.print(String.format("%.2f",gasTank - usedFuel));
	System.out.println("liter remaining.");
    }
}

class CarDemo{
    public static void main(String[] args){
	Car car1 = new Car();
	Car car2 = new Car();
	Car car3 = new Car();

	car1.speedUp(70);
	car2.speedUp(90);
	car3.speedUp(50);
	car1.travelledTimeUp(2);
	car2.travelledTimeUp(4);
	car3.travelledTimeUp(5);

	System.out.print("Car1 ");
	car1.printStateTank();
	System.out.print("Car2 ");
	car2.printStateTank();
	System.out.print("Car3 ");
	car3.printStateTank();
    }
}
