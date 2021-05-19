package com.wavemoney.appcommandcenter.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "app_config")
@Builder
@Getter
@Setter
public class AppConfig {

	@Id
	private String id;

	private String app; //Wave Pay or partner
	
	private Long version;
	
	@Field
    private Map<String, Object> config;
}
