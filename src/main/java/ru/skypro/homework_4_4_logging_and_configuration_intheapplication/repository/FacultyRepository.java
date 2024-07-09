package ru.skypro.homework_4_4_logging_and_configuration_intheapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework_4_4_logging_and_configuration_intheapplication.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultiesByNameIgnoreCaseOrColorIgnoreCase(String name, String color);
}
