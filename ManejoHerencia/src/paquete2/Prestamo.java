package Taller.paquete2;
import Taller.paquete5.Persona;

public class Prestamo {
    public Persona beneficiario;
    public double timePrestamoMes;
    public String ciudadPrestamo;

    public Prestamo() {
    }

    public Prestamo(Persona beneficiario, double timePrestamoMes, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.timePrestamoMes = timePrestamoMes;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public double getTimePrestamoMes() {
        return timePrestamoMes;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTimePrestamoMes(double timePrestamoMes) {
        this.timePrestamoMes = timePrestamoMes;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }

    @Override
    public String toString() {
        return "BENEFICIARIO: " + beneficiario +
                "\nTIEMPO PRESTAMO (MESES): " + timePrestamoMes +
                "\nCIUDAD DONDE FUE EL PRESTAMO: " + ciudadPrestamo;
    }
}
