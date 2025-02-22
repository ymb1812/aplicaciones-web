package edu.utvt.springboot;

import edu.utvt.springboot.data.entities.Administrativo;
import edu.utvt.springboot.data.entities.Alumno;
import edu.utvt.springboot.data.repositories.AdministrativoRepository;
import edu.utvt.springboot.data.repositories.AlumnoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;

@SpringBootTest
public class CasosTest {

        @Autowired
        private AlumnoRepository alumnoRepository;

        @Test
        void insertAlumno() {
            Alumno alumno = new Alumno();
            alumno.setNombre("Yerely");
            alumno.setApellido("Martinez");
            alumno.setEmail("yerely@example.com");
            alumno.setFechaNacimiento(LocalDate.of(2000, 5, 25));
            alumnoRepository.save(alumno);


        }

        @Autowired
        private AdministrativoRepository administrativoRepository;

        @Test
        void insertAdministrativo() {
            Administrativo administrativo = new Administrativo();
            administrativo.setNombre("Aldo");
            administrativo.setApellido("Gonzalez");
            administrativo.setEmail("aldo@gmail.com");
            administrativo.setFechaNacimiento(LocalDate.of(2000, 5, 25));
            administrativo.setSalario(Double.parseDouble("2020"));
            administrativoRepository.save(administrativo);
        }
    }









