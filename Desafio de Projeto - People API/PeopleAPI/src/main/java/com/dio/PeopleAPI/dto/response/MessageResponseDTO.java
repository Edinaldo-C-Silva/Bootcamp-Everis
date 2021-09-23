package com.dio.PeopleAPI.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    @SuppressWarnings("unused")
	private String message;
}