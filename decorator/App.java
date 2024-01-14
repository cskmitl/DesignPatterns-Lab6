public class App {
	public static void main(String[] args) {
		// สร้างเครื่องดื่มธรรมดา
		Beverage plainBeverage = new PlainBeverage();

		// ใส่นมและน้ำตาล
		plainBeverage = new MilkDecorator(plainBeverage);
		plainBeverage = new SugarDecorator(plainBeverage);

		// แสดงรายละเอียดและราคา
		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());
	}
}
