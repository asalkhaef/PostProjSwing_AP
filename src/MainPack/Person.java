package MainPack;

public class Person extends Data<Integer> {
    private String name;
    private String familyName;
    private Integer nationalCode;
    private String birthPlace;
    //.....Constructor...................
    public Person(String name, String familyName, Integer nationalCode, String birthPlace) {
        super(nationalCode);
        this.name = name;
        this.familyName = familyName;
        this.nationalCode = nationalCode;
        this.birthPlace = birthPlace;
    }
    //.....Setter&Getter...................
    public String getName() {
        return name;
    }
    public String getFamilyName() {
        return familyName;
    }
    public Integer getNationalCode() {
        return nationalCode;
    }
    public String getBirthPlace() {
        return birthPlace;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
    }
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
    //......toString........................
    @Override
    public String toString() {
        return "MainPack.Person{" +
                "\n  key=" + key +
                "\n  name='" + name + '\'' +
                "\n  familyName='" + familyName + '\'' +
                "\n  nationalCode=" + nationalCode +
                "\n  birthPlace='" + birthPlace + '\'' +
                '}';
    }
}
