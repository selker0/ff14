package com.example.demo1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Television {
	private String vendor;
	@Setter
	private String model;
	@Setter
	private long channel;
	private long volume;
}
