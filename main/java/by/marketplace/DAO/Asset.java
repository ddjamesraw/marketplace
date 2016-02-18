package by.marketplace.DAO;

public class Asset {

	private int id;
	
	private int assetTypeId;
	
	private int issuerId;

	public void setId(int id) {
		this.id = id;
	}

	public void setAssetTypeId(int assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public void setIssuerId(int issuerId) {
		this.issuerId = issuerId;
	}

	public int getId() {
		return id;
	}

	public int getAssetTypeId() {
		return assetTypeId;
	}

	public int getIssuerId() {
		return issuerId;
	}

}
