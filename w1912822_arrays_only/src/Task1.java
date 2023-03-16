import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void initialise(String pump[]) { //Initialize array
        for (int x = 0; x < 6; x++ ){
            pump[x] = "Empty Customer"; 
        }
    }
    public static void vfq(String pump[]){
        for(int a = 0; a < 6; a++){
            System.out.println(pump[a]);
        }
    }
    public static int add(String pump[] ,int n) {
        Scanner meth = new Scanner(System.in);
        if (n>=6){
            System.out.println("Queue is full....Please choose another pump!!!");
        }
        else{
            System.out.println("enter customer name");
            String name = meth.nextLine();
            pump[n] = name;
        }
        return n;
    }
    public static void empty(int n){
        for (int c = 0; c<7; c++){
            if (c>n){
                System.out.println("Queues"+ c);
            }
        }
    }
    public static void delete(String delete[] , String name){
        for(int c = 0; c<6; c++){
            if(delete[c].equals(name)){
                delete[c]="Empty Customer";
            }
        }
    }
    public static void delete2(String delete[] ){
        delete[0]="Empty Customer";
    }
    public static void craetefile(String pump1[],String pump2[],String pump3[]){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("Queues_Details.txt")); //Create a file
            writer.write("---Customers Details---\n");
            writer.write("---Pump1---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump1[c] );
            }
            writer.write("\n---Pump2---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump2[c] );
            }
            writer.write("\n---Pump3---");//Input data into file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + pump3[c] );
            }
            writer.close();
        }catch (IOException e){  //handling errors
            e.printStackTrace();
        }
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
    public static void sort(String[] pump_1,String[] pump_2 ,String[] pump_3){  //https://www.softwaretestinghelp.com/sort-arrays-in-java/
        Scanner sc= new Scanner(System.in);//sort customers name in alphabetical order
        try{
            System.out.print("Enter Queue number to sort :");
            int queue_no=sc.nextInt();
            if (queue_no==1){
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_1[i].compareTo(pump_1[j]) > 0) {
                            temp = pump_1[i];
                            pump_1[i] = pump_1[j];
                            pump_1[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_1[i]);
                }
                System.out.println(" ");
            } else if (queue_no==2) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_2[i].compareTo(pump_2[j]) > 0) {
                            temp = pump_2[i];
                            pump_2[i] = pump_2[j];
                            pump_2[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_2[i]);
                }
                System.out.println(" ");

            } else if (queue_no==3) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_3[i].compareTo(pump_3[j]) > 0) {
                            temp = pump_3[i];
                            pump_3[i] = pump_3[j];
                            pump_3[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_3[i]);
                }
                System.out.println(" ");

            }else {
                System.out.println("Invalid queue number!!!");
            }
        }catch (Exception e){
            System.out.println("Enter a Integer!");
        }

    }
    public static void main(String[] args) {
        String choice;
        int x = 0;
        int y = 0;
        int z = 0;
        int cusno = 0;
        int fuel = 6000;
        Scanner inputs = new Scanner(System.in);
        String [] pump1 = new String [6];   //Create a array
        String [] pump2 = new String [6];   //Create a array
        String [] pump3 = new String [6];   //Create a array
        initialise(pump1);
        initialise(pump2);
        initialise(pump3);
        do{
            System.out.println("      Welcome Fuel system");
            System.out.println("-----------------------------------");
            if (fuel<=500){
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
                    break;
                case "102":
                case "ACQ":
                    while (true){
                        System.out.println("Select your pump number! ");
                        int pnumber = inputs.nextInt();
                        if (pnumber == 1) {
                            add(pump1, x);
                            x += 1;
                            cusno += 1;
                        } else if (pnumber == 2) {
                            add(pump2, y);
                            y += 1;
                            cusno += 1;
                        } else if (pnumber == 3) {
                            add(pump3, z);
                            z += 1;
                            cusno += 1;
                        } else {
                            System.out.println("please enter correct number");
                            continue;
                        }break;
                    }
                    break;
                case "103":
                case "RCQ":
                    while (true){
                        System.out.println("Enter customer name:");
                        String cusname = inputs.nextLine();
                        System.out.println("Enter pump no:");
                        int pnom = inputs.nextInt();
                        if (pnom == 1){
                            delete(pump1,cusname);
                        } else if (pnom == 2) {
                            delete(pump2,cusname);
                        } else if (pnom == 3) {
                            delete(pump3,cusname);
                        } else{
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
                    } else{
                        System.out.println("please enter correct number");
                    }
                    System.out.println("Deletion successful.\n");
                    System.out.println("Remove a served customer");
                    break;
                case "105":
                case "VCS":
                    System.out.println("Customers in alphabetical order");

                    sort(pump1,pump2,pump3);
                    break;
                case "106":
                case "SPD":
                    craetefile(pump1,pump2,pump3);
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
