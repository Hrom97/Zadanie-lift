public class Elevator {

    boolean LiftRun = false;
    boolean OpenDoor = false;

    public void pressButton(int storey){

    int floor = storey;
    String CurrentFloor;
    switch(floor){
        case 1: CurrentFloor = "1 'этаж";
        if (floor==storey){
            OpenDoor = false;
            LiftRun = false;
        }
        else{
            OpenDoor = false;
            LiftRun = true;
        }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 2: CurrentFloor = "2 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 3: CurrentFloor = "3 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 4: CurrentFloor = "4 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 5: CurrentFloor = "5 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 6: CurrentFloor = "6 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 7: CurrentFloor = "7 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 8: CurrentFloor = "8 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        case 9: CurrentFloor = "9 'этаж";
            if (floor==storey){
                OpenDoor = false;
                LiftRun = false;
            }
            else{
                OpenDoor = false;
                LiftRun = true;
            }
            System.out.println("Вы прибыли на" + storey + "этаж");
            break;
        default: CurrentFloor = "Такого этажа нет";
            LiftRun = false;
            OpenDoor = false;
            break;
    }

}
}
