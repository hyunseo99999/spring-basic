package hello.core.member;

public class Member {

    Long id;
    Grade Grade;
    String name;

    public Member(Long id, Grade grade, String name) {
        this.id = id;
        Grade = grade;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grade getGrade() {
        return Grade;
    }

    public void setGrade(Grade grade) {
        Grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
