package Taller.paquete1;

import Taller.paquete5.Persona;
import Taller.paquete2.Prestamo;
import Taller.paquete3.PrestamoAutomovil;
import Taller.paquete4.InstitutoEducativo;
import Taller.paquete4.PrestamoEducativo;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prestamo[] prestamos = new Prestamo[500];
        int cantidadPrestamos = 0;
        boolean ingresarDatos = true; // Bandera para iniciar
        while (ingresarDatos) {
            System.out.println("Seleccione la opción de préstamo que desea realizar");
            System.out.println("1 para PRESTAMO AUTOMÓVIL");
            System.out.println("2 para PRESTAMO EDUCATIVO");
            System.out.println("3 para SALIDA");
            System.out.println("OPCION: ");
            int opcionSeleccionada = sc.nextInt();
            sc.nextLine();
            switch (opcionSeleccionada) {
                case 1:
                    // Adquirir datos del beneficiario
                    System.out.println("Escriba el nombre del beneficiario");
                    String nombreBeneficiario = sc.nextLine();
                    System.out.println("Escriba los apellidos beneficiario");
                    String apellidosBeneficiario = sc.nextLine();
                    System.out.println("Escriba el UserName Beneficiario");
                    String userNameBeneficiario = sc.nextLine();
                    // Crea el beneficiario con los parámetros/datos adquiridos
                    Persona beneficiario = new Persona(nombreBeneficiario, apellidosBeneficiario, userNameBeneficiario);

                    // Prestamo Automovil
                    System.out.println("Tiempo para el préstamo en meses");
                    double tiempoPrestamoMes = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ciudad donde fue el préstamo");
                    String ciudadPrestamo = sc.nextLine().toLowerCase();

                    // Datos del automóvil
                    System.out.println("Indique el tipo de automóvil");
                    String tipoAuto = sc.nextLine();
                    System.out.println("Indique la marca del automóvil");
                    String marcaAuto = sc.nextLine();
                    System.out.println("Indique el valor del automóvil");
                    double valorAuto = sc.nextDouble();
                    sc.nextLine();

                    // Adquirir datos del garante
                    System.out.println("Nombre Garante");
                    String nomGarante = sc.nextLine();
                    System.out.println("Apellido Garante");
                    String apellidoGarante = sc.nextLine();
                    System.out.println("User del garante");
                    String userGarante = sc.nextLine();
                    Persona garante1 = new Persona(nomGarante, apellidoGarante, userGarante);

                    // Crear objeto PrestamoAutomovil y establecer valores
                    PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(tipoAuto, marcaAuto, garante1, valorAuto);
                    prestamoAutomovil.beneficiario = beneficiario;
                    prestamoAutomovil.tiempoPrestamo = tiempoPrestamoMes;
                    prestamoAutomovil.setCiudad(ciudadPrestamo);
                    prestamoAutomovil.calcularValorAutoPrestamo();

                    // Agregar préstamo al arreglo de préstamos
                    prestamos[cantidadPrestamos] = prestamoAutomovil;
                    cantidadPrestamos++;
                    break;

                case 2:
                    System.out.println("Ingrese los datos para el préstamo educativo");

                    // Adquirir datos del beneficiario
                    System.out.println("Nombre beneficiario");
                    String nomBeneficiarioEdu = sc.nextLine();
                    System.out.println("Apellidos beneficiario");
                    String apellidosBeneficiarioEdu = sc.nextLine();
                    System.out.println("User Beneficiario");
                    String userBeneficiarioEdu = sc.nextLine();

                    // Crea el beneficiario con los parámetros/datos adquiridos
                    Persona beneficiarioEdu = new Persona(nomBeneficiarioEdu, apellidosBeneficiarioEdu, userBeneficiarioEdu);

                    // Prestamo Educativo
                    System.out.println("Tiempo para el préstamo en meses");
                    double tiempoPrestamoMesEdu = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Ciudad donde fue el préstamo");
                    String ciudadPrestamoEdu = sc.nextLine().toUpperCase();
                    System.out.println("Ingrese el nivel de estudio");
                    String nivelEdu = sc.nextLine();
                    System.out.println("Nombre de la institución");
                    String nomInst = sc.nextLine();
                    System.out.println("Siglas de la institución");
                    String siglasInst = sc.nextLine();
                    System.out.println("Valor carrera");
                    double valorCarreraEdu = sc.nextDouble();
                    sc.nextLine();

                    // Crear objeto InstitutoEducativo
                    InstitutoEducativo institutoEdu = new InstitutoEducativo(nomInst, siglasInst);

                    // Crear objeto PrestamoEducativo y establecer valores
                    PrestamoEducativo prestamoEdu = new PrestamoEducativo(beneficiarioEdu, tiempoPrestamoMesEdu,
                            ciudadPrestamoEdu, nivelEdu, institutoEdu, valorCarreraEdu);
                    prestamoEdu.calcularValorPorMesPrestamoCarrera();
                    prestamoEdu.beneficiario = beneficiarioEdu;
                    prestamoEdu.tiempoPrestamo = tiempoPrestamoMesEdu;

                    // Agregar préstamo al arreglo de préstamos
                    prestamos[cantidadPrestamos] = prestamoEdu;
                    cantidadPrestamos++;
                    break;

                case 3:
                    ingresarDatos = false;
                    break;
            }
        }
        System.out.println("Lista de préstamos");
        for (int i = 0; i < cantidadPrestamos; i++) {
            System.out.println(prestamos[i]);
        }
    }
}