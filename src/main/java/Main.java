import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double optimalSpeed = 60; //km/h
        double maxAcceptableSpeed = optimalSpeed + 20; //km/h
        double criminalSpeed = 120; //km/h
/*        За каждые + 20 км
        штраф увеличивается на 500 руб.*/
        double sumFine = 500; //rub
        System.out.println("Введите скорость автомобиля: ");
        double realSpeed = new Scanner(System.in).nextInt();

        if (realSpeed >= criminalSpeed) {
            System.out.println("Ваш штраф составляет 5000 руб. и Вы лишаетесь подительских прав!");
        } else if (realSpeed > maxAcceptableSpeed) {
            double differenceSpeed = realSpeed - maxAcceptableSpeed;
            double stepFine = differenceSpeed / 20;
            int roundStepFine = 0;
            if (stepFine % 2 > 0) {
                roundStepFine = (int) stepFine;
                roundStepFine++;
            } else if ((int) stepFine == 0) {
                roundStepFine = 1;
            }

            System.out.println("Ваш штраф составляет " + (int) (roundStepFine * sumFine) + " руб.!");
        } else {
            System.out.println("Скорость не превышена :)");
        }
    }
}
