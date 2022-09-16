package restusers.service;

import restusers.model.Course;
import restusers.repository.CourseRepository;

import java.util.Optional;
import java.util.Set;

public class CourseService implements ICourse{

    private CourseRepository repo;

    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }




    @Override
    public Set<Course> findAll() {
        return null;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void delete(Course object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Course> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void change(Long aLong) {

    }
}
