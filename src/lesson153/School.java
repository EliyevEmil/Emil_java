package lesson153;

import java.util.ArrayList;
import java.util.List;

public class School implements Subject {
    private List<Observer> students = new ArrayList<>();
    private String announcement;

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer student : students) {
            student.update(announcement);
        }
    }
}