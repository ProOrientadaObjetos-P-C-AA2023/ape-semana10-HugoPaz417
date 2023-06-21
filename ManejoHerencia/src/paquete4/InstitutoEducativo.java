package Taller.paquete4;
public class InstitutoEducativo {
    public String nombreInstitucion;
    public String siglasInstitucion;

    public InstitutoEducativo() {
    }

    public InstitutoEducativo(String nomInst, String siglasInst) {
        this.nombreInstitucion = nomInst;
        this.siglasInstitucion = siglasInst;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getSiglasInstitucion() {
        return siglasInstitucion;
    }

    public void setSiglasInstitucion(String siglasInstitucion) {
        this.siglasInstitucion = siglasInstitucion;
    }

    @Override
    public String toString() {
        return "NOMBRE INSTITUTO: " + nombreInstitucion +
                "\nSIGLAS INSTITUTO: " + siglasInstitucion;
    }
}
