package casev2.student;

public interface StudentRepository {
    Student findById(String id);
    void save(Student student);
    boolean exists(String id);
}