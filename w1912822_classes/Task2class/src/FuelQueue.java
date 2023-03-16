import java.util.Scanner;

public class FuelQueue {
    String [] firstname = {"empty","empty","empty","empty","empty","empty"};
    String [] secondname = {"empty","empty","empty","empty","empty","empty"};
    int [] vehiclenumber = new int[6];
    int [] noliter = new int[6];

    public int setname (String empty,int v) {
        Scanner input = new Scanner(System.in);
        for (int i=0; i< firstname.length; i++){
            if (firstname[i]=="empty"){
                System.out.println("Enter the first name of the passenger : ");
                String name = input.next();
                firstname[v] = name;
                return 0;
            }
        }
        return 1;
    }

    public void setSecondname (String empty,int v){
        Scanner input = new Scanner(System.in);
        for (int i=0; i< secondname.length; i++){
            if (secondname[i]=="empty"){
                System.out.println("Enter the second name of the passenger : ");
                String name = input.next();
                secondname[v] = name;
                return;
            }
        }
    }

    public void setVehiclenumber (int v){
        Scanner input = new Scanner(System.in);
        for (int i=0; i< vehiclenumber.length; i++){
            if (vehiclenumber[i]==0){
                System.out.println("Enter the vehicle number : ");
                int no = input.nextInt();
                vehiclenumber[v] = no;
                return;
            }
        }
    }

    public void setNoliter (int v) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < noliter.length; i++) {
            if (noliter[i] == 0) {
                System.out.println("Enter the required no of liters : ");
                int no = input.nextInt();
                noliter[v] = no;
                return;
            }
        }
    }
}
