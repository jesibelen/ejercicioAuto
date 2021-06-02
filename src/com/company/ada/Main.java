package com.company.ada;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto miAuto1 = new Auto(new MotorAudi(),"AAA123",4);
        Auto miAuto2 = new Auto(new MotorFord(),"ABV234",2);
        Auto miAuto3 = new Auto(new MotorPeugeot(),"CDE542",4);

        miAuto1.hacerEncender();
        miAuto1.acelera();
        miAuto2.hacerEncender();

        System.out.println(miAuto1+"\n"+miAuto2+"\n"+miAuto3);
    }
}
