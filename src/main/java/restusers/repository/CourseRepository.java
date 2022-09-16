package restusers.repository;

import org.springframework.data.repository.CrudRepository;
import restusers.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
