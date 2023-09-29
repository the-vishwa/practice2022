package treeMap;

public class Items {
	Integer itemId;
	String itemName;
	double prizPerItem;
	Integer qnty;
	double totalPrize;

	public Items() {
	}

	public Items(Integer itemId, String itemName, double prizPerItem, Integer qnty) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.prizPerItem = prizPerItem;
		this.qnty = qnty;
		this.totalPrize =prizPerItem * qnty;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrizPerItem() {
		return prizPerItem;
	}

	public void setPrizPerItem(double prizPerItem) {
		this.prizPerItem = prizPerItem;
	}

	public Integer getQnty() {
		return qnty;
	}

	public void setQnty(Integer qnty) {
		this.qnty = qnty;
	}

//	private void setTotalPrice() {
//		if (this.qnty != 0 && this.prizPerItem != 0.0) {
//			this.totalPrize = this.qnty * this.prizPerItem;
//		}
//	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", prizPerItem=" + prizPerItem + ", qnty=" + qnty
				+ ", totalPrize=" + totalPrize + "]";
	}

}
