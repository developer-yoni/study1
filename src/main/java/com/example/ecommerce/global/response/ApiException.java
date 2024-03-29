package com.example.ecommerce.global.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class ApiException extends RuntimeException {
	
	private ApiCode apiCode;
	private String internalMessage;
}
