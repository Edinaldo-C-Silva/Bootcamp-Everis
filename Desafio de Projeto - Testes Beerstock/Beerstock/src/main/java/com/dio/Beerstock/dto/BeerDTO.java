package com.dio.Beerstock.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.dio.Beerstock.enums.BeerType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    @SuppressWarnings("unused")
	private Long id;

    @NotNull
    @Size(min = 1, max = 200)
    private String name;

    @NotNull
    @Size(min = 1, max = 200)
    private String brand;

    @NotNull
    @Max(500)
    private Integer max;

    @NotNull
    @Max(100)
    private Integer quantity;

    @Enumerated(EnumType.STRING)
    @NotNull
    private BeerType type;
    
    // Auto construtor...
	public BeerDTO(Long id, @NotNull @Size(min = 1, max = 200) String name,
			@NotNull @Size(min = 1, max = 200) String brand, @NotNull @Max(500) Integer max,
			@NotNull @Max(100) Integer quantity, @NotNull BeerType type) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.max = max;
		this.quantity = quantity;
		this.type = type;
	}

	// Auto getter não funcionou...?
	public String getBrand() {
		return brand;
	}

	// Auto setter não funcionou...?
	public void setBrand(String brand) {
		this.brand = brand;
	}

	// Auto getter não funcionou...?
	public BeerType getType() {
		return type;
	}

	// Auto getter não funcionou...?
	public Integer getMax() {
		return max;
	}
	
	// Auto getter não funcionou...?
	public Integer getQuantity() {
		return quantity;
	}
	
	// Auto setter não funcionou...?
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	// Auto getter não funcionou...?
	public String getName() {
		return name;
	}

	// Auto getter não funcionou...?
	public Long getId() {
		return id;
	}
}
