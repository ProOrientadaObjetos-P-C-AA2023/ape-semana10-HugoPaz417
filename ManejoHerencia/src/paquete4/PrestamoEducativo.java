package Taller.paquete4;

import Taller.paquete5.Persona;
import Taller.paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    public String nivelEstudio;
    public InstitutoEducativo centroEducativo;
    public double valorCarrera;
    public double valorMesPrestamoCarrera;

    public PrestamoEducativo() {
    }

    public PrestamoEducativo(String nivelEstudio, InstitutoEducativo centroEducativo, double valorCarrera) {
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    public PrestamoEducativo(Persona beneficiario, double timePrestamoMes, String ciudadPrestamo, String nivelEstudio,
                             InstitutoEducativo centroEducativo, double valorCarrera) {
        super(beneficiario, timePrestamoMes, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitutoEducativo getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitutoEducativo centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void calcularValorMesPrestamoCarrera() {
        this.valorMesPrestamoCarrera = (valorCarrera / timePrestamoMes) - (0.1 * (valorCarrera / timePrestamoMes));
    }

    @Override
    public String toString() {
        return super.toString() + "Prestamo Educativo" +
                "\nNivel de estudio: " + nivelEstudio +
                "\nValor de la carrera: " + valorCarrera +
                "\nValor de la carrera por el prestamo en meses: " + valorMesPrestamoCarrera;
    }
}
