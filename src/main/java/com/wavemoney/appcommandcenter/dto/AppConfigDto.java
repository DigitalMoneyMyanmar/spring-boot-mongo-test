package com.wavemoney.appcommandcenter.dto;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppConfigDto {
	private String id;

	private String app; //Wave Pay or partner
	
	private Long version;
	
    private Map<String, Object> config;
}
