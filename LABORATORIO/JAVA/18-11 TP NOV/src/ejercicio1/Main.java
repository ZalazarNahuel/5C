package ejercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Sistema sistema = new Sistema();
        Scanner escanerString = new Scanner(System.in);
        boolean loop = true;
        System.out.println("BIENVENIDOS");
        while (loop){
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1 ---- Dar Alta Mascota");
            System.out.println("2 ---- Dar Baja Mascota");
            System.out.println("3 ---- Modificar Mascota");
            System.out.println("4 ---- Alimentar Mascota");
            System.out.println("5 ---- Saludar Mascota");
            System.out.println("6 ---- Salir");
            Scanner escaner = new Scanner(System.in);
            int opcion = escaner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su nombre");
                    String nombre = escanerString.nextLine();
                    System.out.println("¿Que tipo de mascota desea dar de alta?");
                    System.out.println("1 ---- Perro");
                    System.out.println("2 ---- Gato");
                    System.out.println("3 ---- Pez");
                    System.out.println("4 ---- Pajarito");
                    opcion = escaner.nextInt();
                    System.out.println("Ingrese el nombre de su mascota");
                    String nombreMascota = escanerString.nextLine();
                    while (!sistema.checkNombre(nombreMascota)){
                        System.out.println("Ese nombre ya esta usado, ingrese otro");
                        nombreMascota = escanerString.nextLine();
                    }
                    Mascota mascota;
                    switch (opcion){
                        case 1:
                            mascota = new Perro(nombreMascota,nombre);
                            sistema.altaMascota(mascota);
                            break;
                        case 2:
                            mascota = new Gato(nombreMascota,nombre);
                            sistema.altaMascota(mascota);
                            break;
                        case 3:
                            mascota = new Pez(nombreMascota,nombre);
                            sistema.altaMascota(mascota);
                            break;
                        case 4:
                            System.out.println("¿Desea agregarle un canto a su pajarito?(y/n)");
                            String op = escanerString.nextLine();
                            while (!op.equalsIgnoreCase("Y") && !op.equalsIgnoreCase("n") ){
                                System.out.println("Ingrese un caracter correcto(y/n)");
                                op = escanerString.nextLine();
                            }
                            if(op.equalsIgnoreCase("y")){
                                System.out.println("Ingrese su canto");
                                String canto = escanerString.nextLine();
                                mascota = new Pajarito(nombreMascota,nombre,canto);
                                sistema.altaMascota(mascota);
                            }
                            else {
                                mascota = new Pajarito(nombreMascota,nombre);
                                sistema.altaMascota(mascota);
                            }
                            break;
                    }
                    System.out.println("Se dio de alta tu mascota con exito!");
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Ingrese su nombre");
                    nombre = escanerString.nextLine();
                    if(sistema.getMascotasNombre(nombre).size()==0){
                        System.out.println("No cuenta con ninguna mascota");
                    }
                    else{
                        System.out.println("Elija su mascota a modificar");
                        for(int i = 0;i<sistema.getMascotasNombre(nombre).size();i++){
                            System.out.println((i+1)+" --- "+sistema.getMascotasNombre(nombre).get(i).getNombre());
                        }
                        int opMascota = escaner.nextInt();
                        System.out.println("¿Que quiere hacer con su mascota");
                        System.out.println("1 ---- Modificar nombre");
                        System.out.println("2 ---- Modificar dueño");
                        int operacion = escaner.nextInt();
                        while (operacion!=1 && operacion!=2){
                            operacion = escaner.nextInt();
                            System.out.println("Ingrese un caracter correcto");
                            System.out.println("1 ---- Modificar nombre");
                            System.out.println("2 ---- Modificar dueño");
                        }
                        switch (operacion){
                            case 1:
                                System.out.println("Ingrese su nuevo nombre");
                                String nuevoNombre = escanerString.nextLine();
                                sistema.modificarNombreMascota(sistema.getMascotasNombre(nombre).get(opMascota-1),nuevoNombre);
                                System.out.println("Se modifico su nuevo nombre con exito!");
                                break;
                            case 2:
                                System.out.println("Ingrese su nuevo dueño");
                                String nuevoDueno = escanerString.nextLine();
                                sistema.modificarDuenoMascota(sistema.getMascotasNombre(nombre).get(opMascota-1),nuevoDueno);
                                System.out.println("Se modifico el dueño con exito!");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la mascota");
                    nombreMascota = escanerString.nextLine();
                    if(sistema.checkNombre(nombreMascota)){
                        System.out.println("No existe ningun perro con ese nombre");
                    }
                    else{
                        System.out.println("Ingrese su nombre");
                        nombre = escanerString.nextLine();
                        if(sistema.esElDueno(nombre,nombreMascota)){
                            sistema.alimentar(sistema.getMascotaNombre(nombreMascota));
                            System.out.println("Se alimento a la mascota con exito!");
                        }
                        else{
                            System.out.println("No puedes alimentar a la mascota, no eres el dueño");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre de la mascota");
                    nombreMascota = escanerString.nextLine();
                    if(sistema.checkNombre(nombreMascota)){
                        System.out.println("No existe ningun perro con ese nombre");
                    }
                    else{
                        System.out.println("Ingrese su nombre");
                        nombre = escanerString.nextLine();
                        sistema.saludar(sistema.getMascotaNombre(nombreMascota),nombre);
                    }
                    break;
                case 6:
                    loop = false;
                    break;
            }
        }

    }
}
