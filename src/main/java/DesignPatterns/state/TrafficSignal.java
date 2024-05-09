package DesignPatterns.state;

interface SignalState {
    void changeSignal();
}

class RedSignal implements SignalState {
    @Override
    public void changeSignal() {
        System.out.println("Color changed to Red!");
    }
}

class YellowSignal implements SignalState {
    @Override
    public void changeSignal() {
        System.out.println("Color changed to Yellow!");
    }
}

class GreenSignal implements SignalState {
    @Override
    public void changeSignal() {
        System.out.println("Color changed to Green!");
    }
}

class TrafficLight {
    private SignalState state;
    TrafficLight() {
        state = new RedSignal(); // Initial Signal Red
    }

    public void setState(SignalState newSignalState) {
        state = newSignalState;
    }

    public void change() {
        state.changeSignal();
    }
}

class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.change();
        light.setState(new YellowSignal());
        light.change();
        light.setState(new GreenSignal());
        light.change();
    }
}


