package Taller.paquete2;
import Taller.paquete5.Persona;

public class Prestamo {
    public Persona beneficiario;
    public double tiempoPrestamo;
    public String ciudad;

    public Prestamo() {
    }

    public Prestamo(Persona beneficiario, double tiempoPrestamo, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public double getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setTiempoPrestamo(double tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "BENEFICIARIO: " + beneficiario +
                "\nTIEMPO PRESTAMO (MESES): " + tiempoPrestamo +
                "\nCIUDAD DONDE FUE EL PRESTAMO: " + ciudad;
    }
}
