public class TestsPersona {
    public static void main(String[] args){



        Persona p1 = new Persona();
        Persona p2 = new Persona();


        System.out.println("TEST esMayorDeEdad. Caso con persona mayor de edad");
        p1.setEdad(18);
        boolean valorEsperado = true;
        boolean valorObtenido = p1.esMayorDeEdad();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST esMayorDeEdad. Caso con persona menor de edad");
        p1.setEdad(15);
         valorEsperado = false;
         valorObtenido = p1.esMayorDeEdad();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST sonLaMismaPersona. Caso con personas iguales");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Nahuel");
        p2.setEdad(18);
        p2.setDni(44123456);
        p2.setTelefono(1120003476);
        p2.setDireccion("Epecuen 5432");
        valorEsperado = true;
        valorObtenido = p1.sonLaMismaPersona(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST sonLaMismaPersona. Caso con personas distintas");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Franco");
        p2.setEdad(18);
        p2.setDni(43980281);
        p2.setTelefono(11987654);
        p2.setDireccion("Ceretti 5432");
        valorEsperado = false;
        valorObtenido = p1.sonLaMismaPersona(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST tienenLaMismaEdad. Caso con edades iguales");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Franco");
        p2.setEdad(18);
        p2.setDni(43980281);
        p2.setTelefono(11987654);
        p2.setDireccion("Ceretti 5432");
         valorEsperado = true;
         valorObtenido = p1.tienenLaMismaEdad(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST tienenLaMismaEdad. Caso con edades distintas");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Franco");
        p2.setEdad(20);
        p2.setDni(43980281);
        p2.setTelefono(11987654);
        p2.setDireccion("Ceretti 5432");
         valorEsperado = false;
         valorObtenido = p1.tienenLaMismaEdad(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST tienenElMismoNombre. Caso con nombres iguales");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Nahuel");
        p2.setEdad(20);
        p2.setDni(43980281);
        p2.setTelefono(11987654);
        p2.setDireccion("Ceretti 5432");
        valorEsperado = true;
        valorObtenido = p1.tienenElMismoNombre(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST tienenElMismoNombre. Caso con nombres distintos");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Franco");
        p2.setEdad(20);
        p2.setDni(43980281);
        p2.setTelefono(11987654);
        p2.setDireccion("Ceretti 5432");
        valorEsperado = false;
        valorObtenido = p1.tienenElMismoNombre(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST TelefonoIgual. Caso con telefonos iguales");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Franco");
        p2.setEdad(20);
        p2.setDni(43980281);
        p2.setTelefono(1120003476);
        p2.setDireccion("Ceretti 5432");
        valorEsperado = true;
        valorObtenido = p1.TelefonoIgual(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST TelefonoIgual. Caso con telefonos distintos");
        p1.setNombre("Nahuel");
        p1.setEdad(18);
        p1.setDni(44123456);
        p1.setTelefono(1120003476);
        p1.setDireccion("Epecuen 5432");
        p2.setNombre("Franco");
        p2.setEdad(20);
        p2.setDni(43980281);
        p2.setTelefono(1130007564);
        p2.setDireccion("Ceretti 5432");
        valorEsperado = false;
        valorObtenido = p1.TelefonoIgual(p2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");
    }
}
