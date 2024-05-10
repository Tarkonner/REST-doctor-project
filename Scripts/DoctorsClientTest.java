package Scripts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DoctorsClientTest {
    private DoctorsClient client;
    private Server server; 

    @BeforeEach
    void setUp() {
        // Initialize your HospitalService here
        server = new Server();
        client = new DoctorsClient();
    }

    @Test
    void testDoctorAccessToSameDepartment() {
        // Assuming you have a method to add doctors and patients to the system
        client.AddDoctor(new Doctor("Iran", 123, "Bones"));
    }

    @Test
    void testDoctorAccessToDifferentDepartment() {
    }
}
