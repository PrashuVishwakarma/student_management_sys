import java.sql.*;

public class StudentDAO {
    Connection conn = DBConnection.getConnection();

    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO students (name, roll_number, course, contact) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, student.getName());
        stmt.setString(2, student.getRollNumber());
        stmt.setString(3, student.getCourse());
        stmt.setString(4, student.getContact());
        stmt.executeUpdate();
        System.out.println("Student added successfully!");
    }

    // Other CRUD methods like viewStudents(), updateStudent(), deleteStudent()
}

