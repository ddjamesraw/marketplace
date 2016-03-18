package by.marketplace.repository.vo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "asset")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AssetVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asset_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "asset_type_id")
	@NotNull
	private AssetTypeVO assetType;
	
	@ManyToOne
	@JoinColumn(name = "issuer_id")
	@NotNull
	private IssuerVO issuer;

	public void setId(int id) {
		this.id = id;
	}

	public IssuerVO getIssuer() {
		return issuer;
	}

	public void setIssuer(IssuerVO issuer) {
		this.issuer = issuer;
	}

	public int getId() {
		return id;
	}

	public AssetTypeVO getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetTypeVO assetType) {
		this.assetType = assetType;
	}

}
