

public class Tests {


    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        c1.addMemoria("Y",4);
        c1.addMemoria("X",6);
        c1.addMemoria("Z",8);

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",9);
        Instruccion i2 = new Instruccion("PUSH",3);
        Instruccion i3 = new Instruccion("ADD");
        Instruccion i4 = new Instruccion("READ","Y");
        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        r1.addInstruccion(i4);
        p1.agregarRutina(r1);

        Rutina r2 = new Rutina("rutinaB");
        Instruccion i5 = new Instruccion("PUSH",5);
        Instruccion i6 = new Instruccion("PUSH",1);
        Instruccion i7 = new Instruccion("SUB");
        Instruccion i8 = new Instruccion("READ","A");
        r2.addInstruccion(i5);
        r2.addInstruccion(i6);
        r2.addInstruccion(i7);
        r2.addInstruccion(i8);
        p1.agregarRutina(r2);

        Rutina r3 = new Rutina("rutinaC");
        Instruccion i9 = new Instruccion("PUSH",2);
        Instruccion i10 = new Instruccion("PUSH",6);
        Instruccion i11 = new Instruccion("MUL");
        Instruccion i12 = new Instruccion("WRITE","X");
        r3.addInstruccion(i9);
        r3.addInstruccion(i10);
        r3.addInstruccion(i11);
        r3.addInstruccion(i12);
        p1.agregarRutina(r3);

        Rutina r4 = new Rutina("rutinaD");
        Instruccion i13 = new Instruccion("WRITE","Z");
        Instruccion i14 = new Instruccion("PUSH",12);
        Instruccion i15 = new Instruccion("PUSH",6);
        Instruccion i16 = new Instruccion("MUL");
        r4.addInstruccion(i13);
        r4.addInstruccion(i14);
        r4.addInstruccion(i15);
        r4.addInstruccion(i16);
        p1.agregarRutina(r4);

        c1.cargarPrograma(p1);

        System.out.println("TEST ejecutarRutinaA.");
        c1.ejecutar("rutinaD");
        System.out.println("MemoriaString: " );
        c1.getMemoriaString();
        System.out.println("MemoriaInt: ");
        c1.getMemoriaInt();
        System.out.println("Pila: ");
        //c1.getPila();

    }
}
