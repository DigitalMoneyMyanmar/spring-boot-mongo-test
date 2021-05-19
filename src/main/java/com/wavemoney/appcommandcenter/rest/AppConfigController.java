package com.wavemoney.appcommandcenter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavemoney.appcommandcenter.dao.AppConfigRepository;
import com.wavemoney.appcommandcenter.dto.AppConfigDto;
import com.wavemoney.appcommandcenter.model.AppConfig;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AppConfigController {

	@Autowired AppConfigRepository repo;
	
	@GetMapping("/health-check")
	String healtCheck()
	{
		return "Fine";
	}
	@GetMapping("/api/config/{app}")
	Object getConfig(@PathVariable("app") String app)
	{
	
		return this.repo.findByApp(app);
	}
	
	@PostMapping("/api/config")
	  public ResponseEntity save(@RequestBody final AppConfigDto dto) {
		System.out.println("API ");
		AppConfig config = getConfig(dto);
	    AppConfig newConfig = repo.save(config);
	    return ResponseEntity.ok(AppConfigDto.builder()
	    		.id(newConfig.getId())
	    		.app(newConfig.getApp())
				.version(newConfig.getVersion())
				.config(newConfig.getConfig())
	        .build());
	  }
	
	AppConfig getConfig(AppConfigDto dto)
	{
		return AppConfig.builder()
				.app(dto.getApp())
				.version(dto.getVersion())
				.config(dto.getConfig())
				.build();
	}
}
