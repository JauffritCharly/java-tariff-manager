package dev.wcs.nad.tariffmanager.department;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import dev.wcs.nad.tariffmanager.persistence.entity.Department;
import dev.wcs.nad.tariffmanager.persistence.entity.Tariff;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class DepartmentTest extends JpaRepository<> {

    @Test
    public void tariffTest(){
        Tariff tariff = new Tariff();

        tariff.setId(1L);
        tariff.setName("name1");

        Department department = new Department();

        department.setId(1L);
        department.setName("namedepartment");
        
        tariff.setDepartment(department);


        assertThat(tariff.getDepartment()).isEqualTo(department);
    }

    
}
