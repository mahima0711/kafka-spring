package com.kafka.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.kafka.demo.constant.AppConstant;

@Configuration
public class KafkaConfig {


	
	@Bean
	NewTopic newTopic()
	{
		return TopicBuilder.name(AppConstant.CAB_LOCATION)
				.build();
	}
}
