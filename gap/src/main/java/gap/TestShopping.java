package gap;

public class TestShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnlilneShopping cityShop = new OnlilneShopping();
		OnlilneShopping villageShop =new OnlilneShopping();
		
		cityShop.selectGoods();  //
		cityShop.payment();
		cityShop.shipment();
		
		villageShop.selectGoods();
		villageShop.payment();
		villageShop.shipment();

	}

}
