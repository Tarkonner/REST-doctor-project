package Scripts;

public class MedicalJournal {
    public String name;
    public int socialSecurityMumber;
    
    public MedicalJournal(String patiantName, int patientsSocialSecurityNumber)
    {
        name = patiantName;
        socialSecurityMumber = patientsSocialSecurityNumber;
    }
}