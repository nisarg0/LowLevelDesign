package DesignPatterns.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class Person {
    private String name;
    private String id;
    private String address;
}

class Orchestrator {
    public static void main(String[] args) {
        Person person = Person.builder().name("Nisarg").id("123").build();
        System.out.println("Person name : " + person.getName() + ", address : " + person.getAddress() + ", id : " + person.getId()) ;
    }
}