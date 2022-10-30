package de.uni.koeln.se;


public class Elevator{

    public static int current_Floor=5;
    int dest_Floor;

    private Elv_States State = new Elv_States();

    public Elevator (int dest_floor)
    {
        this.dest_Floor=dest_floor;
        System.out.println("*** Destination floor is: "+ dest_Floor);
        arrive_atFloor();


    }

    private void arrive_atFloor() {
        while (current_Floor != dest_Floor) {
            if (current_Floor < dest_Floor) {
                current_Floor=current_Floor+1;
                System.out.println(State.getMoving_up());

            }
            if (current_Floor > dest_Floor) {
                current_Floor=current_Floor-1;
                System.out.println(State.getMoving_down());

            }
            if (current_Floor == dest_Floor) {
                System.out.println("Arrive to Floor: "+dest_Floor);

            }

        }
        System.out.println(State.getExit());

    }

}