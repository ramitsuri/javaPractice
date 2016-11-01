package com.ramitsuri.javapractice;

/**
 * Created by ramit on 11/19/2015.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Elevators {

    //Your submission should *ONLY* use the following class name

        public static void main(String[] args)
        {

            Scanner stdin = new Scanner(System.in);
            ArrayList<Elevator> elevators = new ArrayList<Elevator>();
            int numOfFloors = 0;
            int numOfElev = 0;
            int startFloor = 0;
            int endFloor = 0;
            boolean cannotBeDone = true;
            while(stdin.hasNextLine())
            {

                String input = stdin.nextLine();
                String[] inputs = input.split(" ");


                 numOfFloors = Integer.parseInt(inputs[0]);
                 numOfElev = Integer.parseInt(inputs[1]);
                 startFloor = Integer.parseInt(inputs[2]);
                 endFloor = Integer.parseInt(inputs[3]);
                for(int i=0; i<numOfElev; i++){
                    String newLine = stdin.nextLine();
                    int x = Integer.parseInt(newLine.split(" ")[0]);
                    int y = Integer.parseInt(newLine.split(" ")[1]);
                    Elevator elevator =  new Elevator(x, y, numOfFloors);
                    if(elevator.floorsThatCanBeReached.contains(startFloor))
                        cannotBeDone = false;
                    elevators.add(elevator);
                }
            }
            if(cannotBeDone)
                System.out.println("0");
            else
                System.out.println(CheckIfPossible(numOfFloors, numOfElev, startFloor, endFloor, elevators));



            stdin.close();
        }
    public static boolean CheckIfPossible(int f, int e, int a, int b, ArrayList<Elevator> elevators){


        return false;
    }


    public static class Elevator{
        int everyXFloor;
        int baseFloor;
        ArrayList<Integer> floorsThatCanBeReached = new ArrayList<>();
        public Elevator(int x, int y, int f) {
            this.everyXFloor = x;
            this.baseFloor = y;
            int floorReached = y;
            while(floorReached<=f){
                floorsThatCanBeReached.add(floorReached);
                floorReached = floorReached + x;
            }
        }
    }

}


