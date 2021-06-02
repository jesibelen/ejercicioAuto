package com.company.ada;

public class Auto {
    MotorFord motor;
    MotorPeugeot motorP;
    MotorAudi motorA;
    String patente;
    Integer cantidad_puertas;

    public Auto(MotorFord motor, String patente, Integer cantidad_puertas) {
        this.motor = motor;
        this.patente = patente;
        this.cantidad_puertas = cantidad_puertas;
    }
    public Auto(MotorAudi motorA, String patente, Integer cantidad_puertas) {
        this.motorA = motorA;
        this.patente = patente;
        this.cantidad_puertas = cantidad_puertas;
    }
    public Auto(MotorPeugeot motorP, String patente, Integer cantidad_puertas) {
        this.motorP = motorP;
        this.patente = patente;
        this.cantidad_puertas = cantidad_puertas;
    }

    public MotorFord getMotor() {
        return motor;
    }

    public void setMotor(MotorFord motor) {
        this.motor = motor;
    }

    public MotorPeugeot getMotorP() {
        return motorP;
    }

    public void setMotorP(MotorPeugeot motorP) {
        this.motorP = motorP;
    }

    public MotorAudi getMotorA() {
        return motorA;
    }

    public void setMotorA(MotorAudi motorA) {
        this.motorA = motorA;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getCantidad_puertas() {
        return cantidad_puertas;
    }

    public void setCantidad_puertas(Integer cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "motor=" + motor +
                ", motorP=" + motorP +
                ", motorA=" + motorA +
                ", patente='" + patente + '\'' +
                ", cantidad_puertas=" + cantidad_puertas +
                '}';
    }
}
