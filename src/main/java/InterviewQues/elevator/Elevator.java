package InterviewQues.elevator;

import java.util.*;
class Display {
    int floor;
    Direction direction;
}

enum Direction {
    UP, DOWN
}

class InternalButton {
    List<Integer> floorNumber;
    boolean fanState;
    InternalButtonDispatcher dispatcher; // Dispatcher manages the request

    void pressButton(int button){};

}

public class Elevator {
    int id;
    Display display;
    InternalButton buttons;
    ElevatorState state;
    int currentFloor;

    boolean move(int destination, Direction direction){ return true;}; // It's a dumb object, it'll start moving in the direction and stop at dest
}

enum ElevatorState {
    IDLE, MOVING, DOOR_OPEN, DOOR_CLOSED
}

class ElevatorController {

    Elevator elevation; // Elevator controller has a elevator(1 controller per elevator)
    boolean acceptNewReq(int desFloor, Direction dir){ return true;}
    void controlElevator(){}; // This method controls the elevator
}

class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllers;
    void pressButton(int floorButton, int liftId){};
}

// External Button dispatcher will be similar
// but pressButton(floor, direction) // this will change
// we can use strategy design pattern to allow different strategies of lift allocation
// It'll take care of logic






