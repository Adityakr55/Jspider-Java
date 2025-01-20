import java.util.Scanner;
class Decision1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
		String carName = sc.next();
		c.setName(carName);
		String carModel= sc.next();
		c.setModel(carModel);
		int carSpeed = sc.nextInt();
		c.setSpeed(carSpeed);
		System.out.println("Car name:"+c.getName());
		System.out.println("Car model:"+c.getModel());
		System.out.println("Car speed:"+c.getSpeed());
	}
}
class Car{
	String Name;
	String Model;
	int Speed;
	public void setName(String carName){
		this.Name = carName;
	}
	public void setModel(String carModel){
		this.Model = carModel;
	}
	public void setSpeed(int carSpeed){
		this.Speed = carSpeed;
	}
	public String getName(){
		return Name;
	}
	public String getModel(){
		return Model;
	}
	public int getSpeed(){
		return Speed;
	}
}