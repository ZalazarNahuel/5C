import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class misTests {



    @Test
    void addPilaVacia(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("ADD");

        r1.addInstruccion(i1);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }

    @Test
    void addPilaCon0(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",0);
        Instruccion i2 = new Instruccion("ADD");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }

    @Test
    void addPilaCon3Numeros(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",2);
        Instruccion i2 = new Instruccion("PUSH",5);
        Instruccion i3 = new Instruccion("PUSH",4);
        Instruccion i4 = new Instruccion("ADD");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        r1.addInstruccion(i4);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(9, c1.getPilaUltimo());
    }

    @Test
    void subPilaVacia(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("SUB");

        r1.addInstruccion(i1);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }

    @Test
    void subPilaCon0(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",0);
        Instruccion i2 = new Instruccion("SUB");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }

    @Test
    void subPilaCon3NumerosNegativos(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",-3);
        Instruccion i2 = new Instruccion("PUSH",-2);
        Instruccion i3 = new Instruccion("PUSH",-5);
        Instruccion i4 = new Instruccion("SUB");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        r1.addInstruccion(i4);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(3, c1.getPilaUltimo());
    }

    @Test
    void subPilaCon3NumerosPositivos(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",2);
        Instruccion i2 = new Instruccion("PUSH",2);
        Instruccion i3 = new Instruccion("PUSH",5);
        Instruccion i4 = new Instruccion("SUB");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        r1.addInstruccion(i4);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(-3, c1.getPilaUltimo());
    }
    @Test
    void mulPilaVacia(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("MUL");

        r1.addInstruccion(i1);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }

    @Test
    void mulPilaCon0(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",0);
        Instruccion i2 = new Instruccion("MUL");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }

    @Test
    void mulPilaCon3NumerosNegativos(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",-3);
        Instruccion i2 = new Instruccion("PUSH",-2);
        Instruccion i3 = new Instruccion("PUSH",-5);
        Instruccion i4 = new Instruccion("MUL");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        r1.addInstruccion(i4);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(10, c1.getPilaUltimo());
    }

    @Test
    void mulPilaCon3NumerosPositivos(){
        Calculadora c1 = new Calculadora();

        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",2);
        Instruccion i2 = new Instruccion("PUSH",2);
        Instruccion i3 = new Instruccion("PUSH",5);
        Instruccion i4 = new Instruccion("MUL");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        r1.addInstruccion(i4);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(10, c1.getPilaUltimo());
    }

    @Test
    void writePilaVacia(){
        Calculadora c1 = new Calculadora();
        c1.addMemoria("Y",4);
        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("WRITE","Y");

        r1.addInstruccion(i1);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getValor("Y"));
    }

    @Test
    void writePilaCon2(){
        Calculadora c1 = new Calculadora();
        c1.addMemoria("Y",4);
        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("PUSH",7);
        Instruccion i2 = new Instruccion("PUSH",4);
        Instruccion i3 = new Instruccion("WRITE","Y");

        r1.addInstruccion(i1);
        r1.addInstruccion(i2);
        r1.addInstruccion(i3);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(4, c1.getValor("Y"));
    }

    @Test
    void readVariableExiste(){
        Calculadora c1 = new Calculadora();
        c1.addMemoria("Y",4);
        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("READ","Y");

        r1.addInstruccion(i1);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(4, c1.getPilaUltimo());
    }

    @Test
    void readVariableNoExiste(){
        Calculadora c1 = new Calculadora();
        Programa p1 = new Programa();

        Rutina r1 = new Rutina("rutinaA");
        Instruccion i1 = new Instruccion("READ","Y");

        r1.addInstruccion(i1);
        p1.agregarRutina(r1);
        c1.cargarPrograma(p1);
        c1.ejecutar("rutinaA");

        assertEquals(0, c1.getPilaUltimo());
    }
}
