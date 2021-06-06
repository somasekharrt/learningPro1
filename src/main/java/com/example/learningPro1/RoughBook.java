package com.example.learningPro1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RoughBook {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enterkey :");
		int a= sc.nextInt();
		System.out.println("entervalue :");
		sc.nextLine();
		String k= sc.nextLine();
		Map<Integer,String> map = new HashMap<>();
		map.put(1001,"driver1");
		map.put(a,k);

		Set<Map.Entry< Integer, String>> entries = map.entrySet();
		Stream<Map.Entry<Integer,String>> entriesStream = entries.stream();
		Map<Object, Object> s = entriesStream
				.collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
		System.out.println(s);
	}
	
}
