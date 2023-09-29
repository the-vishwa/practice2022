package vishwa_assign;

public class Product {

	private Integer productId;
	private String productName;
	private String productType;
	private Integer productPrize;

	public Product() {
	}

	  public Product(Integer productId, String productName, String productType, Integer productPrize) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productPrize = productPrize;
	}

	public Integer getProductPrize() {
		return productPrize;
	}

	public void setProductPrize(Integer productPrize) {
		this.productPrize = productPrize;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productPrize=" + productPrize + "]";
	}

}
