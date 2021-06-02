package com.company.ada;

public class Auto{
    private Motor motor;
    private String patente;
    private Integer cantidad_puertas;

    public Auto(Motor motor, String patente, Integer cantidad_puertas) {
        this.motor = motor;
        this.patente = patente;
        this.cantidad_puertas = cantidad_puertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(MotorFord motor) {
        this.motor = motor;
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
                ", patente='" + patente + '\'' +
                ", cantidad_puertas=" + cantidad_puertas +
                '}';
    }

    public void hacerEncender() {
        motor.encender();
    }

    public void acelera() {
        motor.acelerar();
    }
}
