import java.io.*;
import java.util.Scanner;

public class passenger {
    public static void initialise(FuelQueue pump[]) { //Initialize array
        for (int x = 0; x < 6; x++ ){
            pump[x] = new FuelQueue();
        }
    }
    public static FuelQueue [] vfq(FuelQueue pump[]){
        for(int a = 0; a < 6; a++){
            System.out.println(pump[a].firstname[a]);
        }
        return pump;
    }
    public static FuelQueue [] add(FuelQueue pump[] ,int n) {
                int y = pump[n].setname("empty",n);
                if (y == 0){
                    pump[n].setSecondname("empty",n);
                    pump[n].setVehiclenumber(n);
                    pump[n].setNoliter(n);
                    System.out.println("Custom added successfully ");
                }
                else {
                    System.out.println("Pump is full....Please enter a new pump!!!!!");
                }
        return pump;
    }
    public static void empty(int x){
        for (int c = 0; c<6; c++){
            if (c>=x){
                int d=c+1;
                System.out.println("Queues"+ d);
            }
        }
    }
    public static FuelQueue [] delete(FuelQueue delete[] , String name){
        for(int c = 0; c<6; c++){
            if(delete[c].firstname[c].equals(name)){
                delete[c].firstname[c]="empty";
            }
        }
        return delete;
    }
    public static FuelQueue [] delete2(FuelQueue delete[] ){
        delete[0].firstname[0]="empty";
        return delete;
    }
    public static FuelQueue [] craetefile(FuelQueue pump1[],FuelQueue pump2[],FuelQueue pump3[],FuelQueue pump4[],FuelQueue pump5[]){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("Queues_Details.txt")); //Create a file
            writer.write("---Customers Details---\n");
            writer.write("---Pump1---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump1[c].firstname[c] );
            }
            writer.write("\n---Pump2---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump2[c].firstname[c] );
            }
            writer.write("\n---Pump3---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump3[c].firstname[c] );
            }
            writer.write("\n---Pump4---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump4[c].firstname[c] );
            }
            writer.write("\n---Pump5---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump5[c].firstname[c] );
            }
            writer.close();
        }catch (IOException e){  //handling errors
            e.printStackTrace();
        }
        return pump1;
    }
    public static void read(){
        try {
            BufferedReader reader= new BufferedReader(new FileReader("Queues_Details.txt"));
            String line;
            while ((line=reader.readLine()) != null){  //Read the file line by line
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){       //handling errors
            e.printStackTrace();
        }
    }
    public static FuelQueue[] sort(FuelQueue[] pump_1,FuelQueue[] pump_2,FuelQueue[] pump_3,FuelQueue[] pump_4 ,FuelQueue[] pump_5){    //https://www.softwaretestinghelp.com/sort-arrays-in-java/
        Scanner sc= new Scanner(System.in);//sort customers name in alphabetical order
        try{
            System.out.print("Enter Queue number to sort :");
            int queue_no=sc.nextInt();
            if (queue_no==1){
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_1[i].firstname[i].compareTo(pump_1[j].firstname[j]) > 0){
                            temp = pump_1[i].firstname[i];
                            pump_1[i].firstname[i] = pump_1[j].firstname[j];
                            pump_1[j].firstname[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_1[i].firstname[i]);
                }
                System.out.println(" ");
            } else if (queue_no==2) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_2[i].firstname[i].compareTo(pump_2[j].firstname[j]) > 0) {
                            temp = pump_2[i].firstname[i];
                            pump_2[i].firstname[i] = pump_2[j].firstname[j];
                            pump_2[j].firstname[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_2[i].firstname[i]);
                }
                System.out.println(" ");

            } else if (queue_no==3) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_3[i].firstname[i].compareTo(pump_3[j].firstname[j]) > 0) {
                            temp = pump_3[i].firstname[i];
                            pump_3[i].firstname[i] = pump_3[j].firstname[j];
                            pump_3[j].firstname[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_3[i].firstname[i]);
                }
                System.out.println(" ");

            } else if (queue_no==4) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_4[i].firstname[i].compareTo(pump_4[j].firstname[j]) > 0) {
                            temp = pump_4[i].firstname[i];
                            pump_4[i].firstname[i] = pump_4[j].firstname[j];
                            pump_4[j].firstname[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_4[i].firstname[i]);
                }
                System.out.println(" ");

            } else if (queue_no==5) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_5[i].firstname[i].compareTo(pump_5[j].firstname[j]) > 0) {
                            temp = pump_5[i].firstname[i];
                            pump_5[i].firstname[i] = pump_5[j].firstname[j];
                            pump_5[j].firstname[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_5[i].firstname[i]);
                }
                System.out.println(" ");

            }
            else {
                System.out.println("Invalid queue number!!!");
            }
        }catch (Exception e){
            System.out.println("Enter a Integer!");
        }

        return new FuelQueue[0];
    }
    public static void main(String[] args) {
        String choice;
        int x =0,d = 0,f = 0,y=0,z = 0;
        int cusno = 0;
        int fuel = 6000;
        Scanner inputs = new Scanner(System.in);
        FuelQueue [] pump1 = new FuelQueue [6];   //Create a array
        FuelQueue [] pump2 = new FuelQueue [6];   //Create a array
        FuelQueue [] pump3 = new FuelQueue [6];   //Create a array
        FuelQueue [] pump4 = new FuelQueue [6];   //Create a array
        FuelQueue [] pump5 = new FuelQueue [6];   //Create a array
        initialise(pump1);
        initialise(pump2);
        initialise(pump3);
        initialise(pump4);
        initialise(pump5);
        do{
            System.out.println("      Welcome Fuel system");
            System.out.println("-----------------------------------");
            if (fuel <= 500){
                System.out.println("\n !!!!!!!!Fuel limit is reached to 500 liters!!!!!!!! ");
            }
            System.out.println("100 or VFQ: View all Fuel Queues ");
            System.out.println("101 or VEQ: View all Empty Queues ");
            System.out.println("102 or ACQ: Add customer to a Queue ");
            System.out.println("103 or RCQ: Remove a customer from a Queue ");
            System.out.println("104 or PCQ: Remove a served customer ");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order ");
            System.out.println("106 or SPD: Store Program Data into file ");
            System.out.println("107 or LPD: Load Program Data from file ");
            System.out.println("108 or STK: View Remaining Fuel Stock ");
            System.out.println("109 or AFS: Add Fuel Stock ");
            System.out.println("110 or IFQ: Income of each Fuel queue ");
            System.out.println("999 or EXT: Exit the Program ");
            choice = inputs.nextLine();
            switch (choice) {
                case "100":
                case "VFQ":
                    System.out.println("All Fuel Queues");
                    System.out.println("---Pump1---");
                    vfq(pump1);
                    System.out.println("---Pump2---");
                    vfq(pump2);
                    System.out.println("---pump3---");
                    vfq(pump3);
                    System.out.println("---pump4---");
                    vfq(pump4);
                    System.out.println("---pump5---");
                    vfq(pump5);
                    break;
                case "101":
                case "VEQ":
                    System.out.println("All Empty Queues");
                    System.out.println("---Pump1---");
                    empty(x);
                    System.out.println("---Pump2---");
                    empty(y);
                    System.out.println("---Pump3---");
                    empty(z);
                    System.out.println("---Pump4---");
                    empty(f);
                    System.out.println("---Pump5---");
                    empty(d);
                    break;
                case "102":
                case "ACQ":
                    while (true){
                        System.out.println("Select your pump number! ");
                        try{
                            int number = inputs.nextInt();
                            if (number == 1) {
                                add(pump1, x);
                                x += 1;
                                cusno += 1;
                            } else if (number == 2) {
                                add(pump2, y);
                                y += 1;
                                cusno += 1;
                            } else if (number == 3) {
                                add(pump3, z);
                                z += 1;
                                cusno += 1;
                            } else if (number == 4) {
                                add(pump4,f);
                                f += 1;
                                cusno += 1;
                            } else if (number == 5) {
                                add(pump5, d);
                                d += 1;
                                cusno += 1;
                            } else {
                                System.out.println("please enter correct number");
                                continue;
                            }break;
                        }catch (Exception e){
                            System.out.println("Invalid Input ");
                        }
                    }
                    break;
                case "103":
                case "RCQ":
                    while (true){
                        System.out.println("Enter customer name:");
                        String cusname = inputs.nextLine();
                        System.out.println("Enter pump no(1 to 5):");
                        int pnom = inputs.nextInt();
                        if (pnom == 1){
                            delete(pump1,cusname);
                        } else if (pnom == 2) {
                            delete(pump2,cusname);
                        } else if (pnom == 3) {
                            delete(pump3, cusname);
                        } else if (pnom == 4) {
                            delete(pump4,cusname);
                        } else if (pnom == 5) {
                            delete(pump5, cusname);
                        }
                        else{
                            System.out.println("please enter correct number");
                            continue;
                        }break;
                    }System.out.println("Deletion successful.\n");
                    break;
                case "104":
                case "PCQ":
                    System.out.println("Enter pump no:");
                    int pnum = inputs.nextInt();
                    if (pnum == 1){
                        delete2(pump1);
                    } else if (pnum == 2) {
                        delete2(pump2);
                    } else if (pnum == 3) {
                        delete2(pump3);
                    } else if (pnum == 4) {
                        delete2(pump4);
                    } else if (pnum == 5) {
                        delete2(pump5);
                    } else{
                        System.out.println("please enter correct number");
                    }
                    System.out.println("Deletion successful.\n");
                    System.out.println("Remove a served customer");
                    break;
                case "105":
                case "VCS":
                    System.out.println("Customers in alphabetical order");
                    sort(pump1,pump2,pump3,pump4,pump5);
                    break;
                case "106":
                case "SPD":
                    craetefile(pump1,pump2,pump3,pump4,pump5);
                    System.out.println("Successfully stored Data into file");
                    break;
                case "107":
                case "LPD":
                    System.out.println("Program Data from file");
                    read();
                    break;
                case "108":
                case "STK":
                    fuel = fuel-(cusno*10);
                    System.out.println("Remaining Fuel Stock is:"+fuel +"liters");
                    break;
                case "109":
                case "AFS":
                    System.out.println("Enter the new fuel Stock");
                    int nstock = inputs.nextInt();
                    fuel = fuel+nstock;
                    System.out.println("All fuel stock is :" + fuel + "liters");
                    break;
                case "110":
                case "IFQ":
                    System.out.println("Income of Pump1 is- rs:" + x*430.00);
                    System.out.println("Income of Pump2 is- rs:" + y*430.00);
                    System.out.println("Income of Pump3 is- rs:" + z*430.00);
                    System.out.println("Income of Pump4 is- rs:" + f*430.00);
                    System.out.println("Income of Pump5 is- rs:" + d*430.00);
                    break;
                case "999":
                case "EXIT":
                    choice="999";
                    break;
                default:
                    break;
            }
        }while(!choice.equals("999"));

    }
}