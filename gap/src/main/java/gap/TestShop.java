package gap;

interface Shop {
	public void selectGoods();

	public void payment();

	public void shipment();
	
	
	public default void reedemPoints() {
		System.out.println("The points can be redeemed");
	}
	
	public static void registration() {
		System.out.println("Shop registration is done...");
	}
	
}

class VillageShop implements Shop {

	@Override
	public void selectGoods() {
		System.out.println("goods are selected from shop");
	}

	@Override
	public void payment() {
		System.out.println("cash payment is accepted");
	}

	@Override
	public void shipment() {
		System.out.println("goods are delivered on thier own risk");
	}
}

class CityShop implements Shop {

	public void selectGoods() {
		System.out.println("goods are selected from www.shops.com");
	}

	public void payment() {
		System.out.println("Online payments are accepted");
	}

	public void shipment() {
		System.out.println("goods are delivered through bluedart courier");
	}
	
}

public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop.registration();
		VillageShop v = new VillageShop();
		
		v.selectGoods();
		v.payment();
		v.shipment();
		v.reedemPoints();
		
		CityShop c = new CityShop();
		c.selectGoods();
		c.payment();
		c.shipment();
		c.reedemPoints();
		
		

	}

}
