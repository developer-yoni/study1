package com.example.ecommerce.global.response.validation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class ValidationFailForField {
	
	private String defaultMessage;
	private String objectName;
	private String field;
	
	public static ValidationFailForField convert (FieldError fieldError){

		return ValidationFailForField.builder()
									 .defaultMessage(fieldError.getDefaultMessage())
									 .objectName(fieldError.getObjectName())
									 .field(fieldError.getField())
									 .build();
	}
}
