package com.dio.Beerstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    LAGER("Lager"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    IPA("IPA"),
    STOUT("Stout");
	
	// O construtor automatico não funciona?
	BeerType(String desc) {
		this.description = desc;
	}

	@SuppressWarnings("unused")
	private final String description;
}
