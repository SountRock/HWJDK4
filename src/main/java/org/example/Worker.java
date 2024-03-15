package org.example;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private WorkerKey key;
    private List<String> phones;

    public Worker(int ID, String name, int experience, String phone) {
        key = new WorkerKey(ID, name, experience);
        phones = new ArrayList<>();
        phones.add(phone);
    }

    public Worker(int ID, String name, int experience, List<String> phones) {
        key = new WorkerKey(ID, name, experience);
        this.phones = phones;
    }

    public int getID() {
        return key.getID();
    }

    public String getName() {
        return key.getName();
    }

    public void setName(String name) {
        key.setName(name);
    }

    public int getExperience() {
        return key.getExperience();
    }

    public void setExperience(int experience) {
        key.setExperience(experience);
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhone(String phone) {
        phones.add(phone);
    }

    public WorkerKey getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", phones=" + phones +
                '}';
    }
}
