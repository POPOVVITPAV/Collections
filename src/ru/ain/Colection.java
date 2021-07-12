package ru.ain;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Colection {
	
	public static void main(String[] args) {
		ArrayDeque<String> states = new ArrayDeque<String>();
		states.add("Germany");//стандартное добавление элементов
		states.addFirst("France");//добавляем элемент в самое начало
		states.push("ddddd");//добавляем элемент в самое начало
		states.addLast("jhibhhvb");//добавляем элемент в конец коллекции
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
		
		LinkedList<String>statesLink = new LinkedList<String>();
		
		statesLink.add("erererverv");
		statesLink.add("iueivbiebvierbv");
		statesLink.addLast("hbervihbevberbv");
		statesLink.addFirst("uehuheg");
		statesLink.add(1, "Haha");
		System.out.println(statesLink.size());
		System.out.println(statesLink.get(1));
		statesLink.set(1, "YYYYYY");
		for(String sl:statesLink) {
			System.out.println(sl);
		}
		if(statesLink.contains("YYYYYY")) {
			System.out.println("Vay!!!!!");
		}
		statesLink.remove("iueivbiebvierbv");
		statesLink.removeFirst();
		statesLink.removeLast();
		
		LinkedList<Person> peopleL = new LinkedList<Person>();
		peopleL.add(new Person("Alisa"));
		peopleL.addFirst(new Person("Vitaly"));
		peopleL.addLast(new Person("GDH"));
		peopleL.remove(2);
		
		for(Person prL:peopleL) {
			System.out.println(prL.getName());
		}
		Person first = peopleL.getFirst();
		System.out.println(first.getName());
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
