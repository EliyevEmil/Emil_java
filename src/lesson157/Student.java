package lesson157;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
    private LocalDateTime examDate;

    public Student(String name, LocalDateTime examDate) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.examDate = examDate;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public boolean isPassed() {
        return getAverage() > 60;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", examDate=" + examDate +
                ", average=" + getAverage() +
                ", passed=" + isPassed() +
                '}';
    }
}