package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "asset")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Asset {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "asset_type_id")
	private AssetType assetType;
	
	@ManyToOne
	@JoinColumn(name = "issuer_id")
	private Issuer issuer;

	public void setId(int id) {
		this.id = id;
	}

	public Issuer getIssuer() {
		return issuer;
	}

	public void setIssuer(Issuer issuer) {
		this.issuer = issuer;
	}

	public int getId() {
		return id;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

}
