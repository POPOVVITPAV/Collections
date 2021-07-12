package ru.ain;

import java.util.ArrayDeque;

public class Colection {
	
	public static void main(String[] args) {
		ArrayDeque<String> states = new ArrayDeque<String>();
		states.add("Germany");//����������� ���������� ���������
		states.addFirst("France");//��������� ������� � ����� ������
		states.push("ddddd");//��������� ������� � ����� ������
		states.addLast("jhibhhvb");//��������� ������� � ����� ���������
		states.add("ojkherg");
		
		String sFirst = states.getFirst();
		System.out.println(sFirst);
		
		String sLast = states.getLast();
		System.out.println(sLast);
		
		System.out.printf("Quee size: %d \n", states.size());
		
		while(states.peek()!=null) {
			System.out.print(states.pop()+" ");
		}
		System.out.println();
		ArrayDeque<Person> people = new ArrayDeque<Person>();
		people.addFirst(new Person("Tom"));
		people.addLast(new Person("Ann"));
		for(Person p:people) {
			System.out.print(p.getName()+" ");
		}
	}

	
}

class Person{
	private String name;
	public Person(String value) {
		this.name=value;
	}
	String getName() {
		return name;
	}
}
