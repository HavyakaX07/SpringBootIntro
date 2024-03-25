package com.learn.springBoot.springBootPractice.Controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springBoot.springBootPractice.Util.LoadConfigureProperties;
import com.learn.springBoot.springPractice.models.Course;

@RestController
public class ConfigurationController {
	
	@Autowired
	private LoadConfigureProperties loadConfigureProperties;
	
	//Auto wire loaded configuration property.
	/*
	public void setLoadConfigureProperties(LoadConfigureProperties loadConfigureProperties) {
		this.loadConfigureProperties = loadConfigureProperties;
	}
	*/
	// API end-point to show the currently active configuration.
	@RequestMapping("/show-config")
	public LoadConfigureProperties getLoadedConfig(){
		return loadConfigureProperties;
				
	}

}
