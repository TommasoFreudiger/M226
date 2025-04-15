public class Patient {
    private String name;
    private Integer age;
    private patientType PatientType;
    private String gender;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public patientType getType() {
        return PatientType;
    }

    public String getGender() {
        if (gender.equals("M") || gender.equals("F")) {
            return gender;
        }
        else{
            gender = "Non valido";
            return gender;
        }
    }

    public String getInfo() {
        return "Patient{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Type=" + PatientType +
                ", Gender=" + gender +
                '}';
    }

    public Patient(String name, Integer age, patientType PatientType,String gender) {
        this.name = name;
        this.age = age;
        this.PatientType = PatientType;
        this.gender = gender;
    }
}
