package casev2.student;

public class MySqlStudentRepository implements StudentRepository {
    @Override
    public void save(Student student) {
        System.out.println("INSERT INTO mysql students ...");
    }
}