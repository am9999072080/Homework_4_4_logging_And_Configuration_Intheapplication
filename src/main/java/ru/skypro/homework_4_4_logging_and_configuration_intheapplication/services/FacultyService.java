package ru.skypro.homework_4_4_logging_and_configuration_intheapplication.services;

import ru.skypro.homework_4_4_logging_and_configuration_intheapplication.model.Faculty;

import java.util.Collection;

public interface FacultyService {
    Faculty add(Faculty faculty);

    Faculty remove(Long id);

    Faculty update(Faculty faculty);

    Faculty get(Long id);

    Collection<Faculty> getByNameOrColor(String name, String color);

    Collection<Faculty> getAll();
}