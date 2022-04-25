package com.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>values=Arrays.asList("Soujan","Soujan","Soujan","Soujan","Soujan");
		@SuppressWarnings("unused")
		Optional<String>var=values.stream().findAny();
		//assertTrue(var.isPresent());
		//assertThat(var.get());
		//values.stream().findAny(5).forEach(i->System.out.println(i));
	
	}
}
