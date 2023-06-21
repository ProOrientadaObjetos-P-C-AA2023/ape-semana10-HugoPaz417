package Taller.paquete4;

import Taller.paquete5.Persona;
import Taller.paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    public String nivelDeEstudio;
    public InstitutoEducativo centroDeEducacion;
    public double valorCarrera;
    public double valorPorMesPrestamoCarrera;

    public PrestamoEducativo() {
    }

    public PrestamoEducativo(String nivelEstudio, InstitutoEducativo centroDeEducacion, double valorPorMesPrestamoCarrera) {
        this.nivelDeEstudio = nivelEstudio;
        this.centroDeEducacion = centroDeEducacion;
        this.valorPorMesPrestamoCarrera = valorPorMesPrestamoCarrera;
    }

    public PrestamoEducativo(Persona beneficiario, double timePrestamoMes, String ciudadPrestamo, String nivelDeEstudio,
                             InstitutoEducativo centroDeEducacion, double valorPorMesPrestamoCarrera) {
        super(beneficiario, timePrestamoMes, ciudadPrestamo);
        this.nivelDeEstudio = nivelDeEstudio;
        this.centroDeEducacion = centroDeEducacion;
        this.valorPorMesPrestamoCarrera = valorPorMesPrestamoCarrera;
    }

    public String getNivelDeEstudio() {
        return nivelDeEstudio;
    }

    public void setNivelDeEstudio(String nivelDeEstudio) {
        this.nivelDeEstudio = nivelDeEstudio;
    }

    public InstitutoEducativo getCentroDeEducacion() {
        return centroDeEducacion;
    }

    public void setCentroDeEducacion(InstitutoEducativo centroDeEducacion) {
        this.centroDeEducacion = centroDeEducacion;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void calcularValorPorMesPrestamoCarrera() {
        this.valorPorMesPrestamoCarrera = (valorCarrera / tiempoPrestamo) - (0.1 * (valorCarrera / tiempoPrestamo));
    }

    @Override
    public String toString() {
        return super.toString() + "Prestamo Educativo" +
                "\nNivel de estudio: " + nivelDeEstudio +
                "\nValor de la carrera: " + valorCarrera +
                "\nValor de la carrera por el prestamo en meses: " + valorPorMesPrestamoCarrera;
    }
}
