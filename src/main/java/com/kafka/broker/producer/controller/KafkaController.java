package com.kafka.broker.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.broker.producer.TopicProducer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	private final TopicProducer topicProducer;

	@GetMapping(value = "/send")
	public void send(@RequestParam String message) {
		topicProducer.send(message);
	}
}
