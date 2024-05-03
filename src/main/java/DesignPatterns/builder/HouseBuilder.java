package DesignPatterns.builder;

public class HouseBuilder {
// show me example of what we can not do with this string
    String name;
    String address;
    String city;
    String state;

    public HouseBuilder addName(String name) {
        this.name = name;
        return this;
    }

    public HouseBuilder addAddress(String address) {
        this.address = address;
        return this;
    }

    public HouseBuilder addCity(String city) {
        this.city = city;
        return this;
    }

    public HouseBuilder addState(String state) {
        this.state = state;
        return this;
    }

    public House build() {
        return new House(this);
    }

}

class House {

    String name;
    String address;
    String city;
    String state;

    House(HouseBuilder builder) {
        name = builder.name;
        address = builder.address;
        city = builder.city;
        state = builder.state;
    }
}

class Orchestrator1 {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        House house = builder.addName("Niwas").addAddress("Spurti").addCity("Warora").build();

        System.out.println("Home Name : " + house.name + " Addresses : " + house.address + " City : " + house.city + " State :" + house.state);

    }
}