package by.marketplace.DAO.Entities;

import javax.persistence.*;

@Entity
@Table(name = "asset")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AssetDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "asset_type_id")
	private AssetTypeDAO assetType;
	
	@ManyToOne
	@JoinColumn(name = "issuer_id")
	private IssuerDAO issuer;

	public void setId(int id) {
		this.id = id;
	}

	public IssuerDAO getIssuer() {
		return issuer;
	}

	public void setIssuer(IssuerDAO issuer) {
		this.issuer = issuer;
	}

	public int getId() {
		return id;
	}

	public AssetTypeDAO getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetTypeDAO assetType) {
		this.assetType = assetType;
	}

}
