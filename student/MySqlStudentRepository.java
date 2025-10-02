package casev2.student;

public class MySqlStudentRepository implements StudentRepository {
    
    @Override
    public Student findById(String id) {
        // Simulate database lookup
        System.out.println("MySqlStudentRepository: Finding student with ID: " + id);
        return new Student(id, "Student from MySQL");
    }
    
    @Override
    public void save(Student student) {
        System.out.println("MySqlStudentRepository: Saving student: " + student);
    }
    
    @Override
    public boolean exists(String id) {
        System.out.println("MySqlStudentRepository: Checking if student exists: " + id);
        return true; // Simulate student exists
    }
}