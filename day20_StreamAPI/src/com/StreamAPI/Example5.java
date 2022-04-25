package com.StreamAPI;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class Example5 {
	@Test
	void display() {
		// TODO Auto-generated method stub
		
		List<String>values=Arrays.asList("Soujan","Soujan","Soujan","Soujan","Soujan");
		//Optional<String>var=values.stream().findAny();
		//assertTrue(var.isPresent());
		//assertThat(var.get());
		values.stream().findAny().equals(values);
		System.out.println(values);
	
	}
}
