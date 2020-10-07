package PaqueteEjemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlumnoTest {

    //private Alumno alumno = new Alumno("Krujitos"); Se puede poner como un objeto general.

    @Test                                                                       //-----------------------------------------------------//
    void getNombre() {                                                          //-----------------------------------------------------//
        Alumno alumno = new Alumno("Krujitos"); //Creacion de objeto.   //-------------------PRUEBAS UNITARIAS------------------//
                                                                                //-----------------------------------------------------//
        Assertions.assertEquals("Krujitos", alumno.getNombre());        //-----------------------------------------------------//
    }                                                                           //-----------------------------------------------------//

    @Test
    void setNombre() {
        Alumno alumno = new Alumno("AbsoluteZero"); //Creacion de objeto.
        alumno.setNombre("Ricardo");

        Assertions.assertEquals("Ricardo", alumno.getNombre()); //Hace el test entre expect y actual. "Ricardo y alumno.getNombre() <- tiene Ricardo."
    }

    @Test
    void testToString() {
        Alumno alumno = new Alumno("no. 21"); //Creacion de objeto.

        Assertions.assertEquals("Alumno{nombre='no. 21'}", alumno.toString());

    }
}