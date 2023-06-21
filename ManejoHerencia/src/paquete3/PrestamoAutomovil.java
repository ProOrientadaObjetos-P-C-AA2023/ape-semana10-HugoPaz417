package Taller.paquete3;

import Taller.paquete5.Persona;
import Taller.paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    public String tipoAuto;
    public String marcaAuto;
    public Persona garante1;
    public double valorAuto;
    public double valorAutoPrestamoAuto;

    public PrestamoAutomovil(String tipoAuto, String marcaAuto, Persona garante1, double valorAuto) {
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public double calcularValorAutoPrestamo() {
        this.valorAutoPrestamoAuto = valorAuto / timePrestamoMes;
        return valorAutoPrestamoAuto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Prestamo Automovil" +
                "\ntipoAuto: " + tipoAuto +
                "\nmarcaAuto: " + marcaAuto +
                "\ngarante1: " + garante1 +
                "\nvalorAuto: " + valorAuto +
                "\nValor del auto con el prestamo de meses: " + valorAutoPrestamoAuto;
    }
}
