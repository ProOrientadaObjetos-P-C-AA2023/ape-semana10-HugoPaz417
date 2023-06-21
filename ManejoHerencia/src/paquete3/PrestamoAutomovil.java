package Taller.paquete3;

import Taller.paquete5.Persona;
import Taller.paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    public String tipoAutomovil;
    public String marcaAutomovi;
    public Persona garante;
    public double valorAutomovil;
    public double valorPrestamo;

    public PrestamoAutomovil(String tipoAutomovil, String marcaAutomovi, Persona garante, double valorAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovi = marcaAutomovi;
        this.garante = garante;
        this.valorAutomovil = valorAutomovil;
    }

    public String getTipoAuto() {
        return tipoAutomovil;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAutomovil = tipoAuto;
    }

    public String getMarcaAuto() {
        return marcaAutomovi;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAutomovi= marcaAuto;
    }

    public Persona getGarante1() {
        return garante;
    }

    public void setGarante1(Persona garante1) {
        this.garante = garante1;
    }

    public double getValorAuto() {
        return valorAutomovil;
    }

    public double calcularValorAutoPrestamo() {
        this.valorPrestamo = valorAutomovil / tiempoPrestamo;
        return valorPrestamo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Prestamo Automovil" +
                "\ntipoAuto: " + tipoAutomovil +
                "\nmarcaAuto: " + marcaAutomovi +
                "\ngarante1: " + garante +
                "\nvalorAuto: " + valorAutomovil +
                "\nValor del auto con el prestamo de meses: " + valorPrestamo;
    }
}
