package Taller.paquete5;
public class Persona {
    public String nombrePersona;
    public String apellidosPersona;
    public String userNamePersona;

    public Persona() {
    }

    public Persona(String nomPersona, String apellidosPersona, String userPersona) {
        this.nombrePersona = nomPersona;
        this.apellidosPersona = apellidosPersona;
        this.userNamePersona = userPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nombrePersona = nomPersona;
    }

    public void setApellidosPersona(String apellidosPersona) {
        this.apellidosPersona = apellidosPersona;
    }

    public void setUserPersona(String userPersona) {
        this.userNamePersona = userPersona;
    }

    public String getNomPersona() {
        return nombrePersona;
    }

    public String getApellidosPersona() {
        return apellidosPersona;
    }

    public String getUserPersona() {
        return userNamePersona;
    }

    @Override
    public String toString() {
        return "Nombre del beneficiario: " + nombrePersona +
                "\nApellidos del beneficiario: " + apellidosPersona +
                "\nUsuario del beneficiario: " + userNamePersona;
    }
}
