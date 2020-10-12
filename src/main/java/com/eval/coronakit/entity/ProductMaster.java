package com.eval.coronakit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products")
public class ProductMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "pname")
	@NotNull(message = "Name is required.")
	@NotBlank(message = "Name can't be blank.")
	@Size(min = 2, max = 40, message = "Product name must not be empty and should have min 2 chars")
	private String productName;

	@Column(name = "price")
	@NotNull(message = "price is required.")
	@Min(value = 10, message = "Product price must be more then equals to 10")
	private Integer price;

	@Column(name = "description")
	@NotNull(message = "Description is required.")
	@NotBlank(message = "Description can't be blank.")
	@Size(min = 5, max = 40, message = "Product Description must not be empty and should have min 5 chars")
	private String productDescription;

	public ProductMaster() {
		// TODO Auto-generated constructor stub
	}

	public ProductMaster(int id, String productName, Integer price, String productDescription) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.productDescription = productDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "ProductMaster [id=" + id + ", productName=" + productName + ", price=" + price + ", productDescription=" + productDescription + "]";
	}

}
