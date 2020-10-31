package qa;

public class Stickers {
	private int batmanPrice;
	private int supermanPrice;
	private int total;
	public int getBatmanPrice() {
		return batmanPrice;
	}
	public void setBatmanPrice(int batmanPrice) {
		this.batmanPrice = batmanPrice;
	}
	public int getSupermanPrice() {
		return supermanPrice;
	}
	public void setSupermanPrice(int supermanPrice) {
		this.supermanPrice = supermanPrice;
	}
	
	public int total(int batmanPrice,int supermanPrice) {
		
		total = batmanPrice+supermanPrice;
		
		return total;
		
	}

}
