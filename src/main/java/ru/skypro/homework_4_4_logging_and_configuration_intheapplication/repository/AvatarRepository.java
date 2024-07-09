package ru.skypro.homework_4_4_logging_and_configuration_intheapplication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.skypro.homework_4_4_logging_and_configuration_intheapplication.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {

    Optional<Avatar> findByStudentId(Long studentId);
}
