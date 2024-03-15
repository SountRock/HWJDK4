package org.example;

import java.util.Objects;

public class WorkerKey {
    private final int ID;
    private String name;
    private int experience;

    public WorkerKey(int ID, String name, int experience) {
        this.ID = ID;
        this.name = name;
        this.experience = experience;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerKey workerKey = (WorkerKey) o;
        return ID == workerKey.ID && experience == workerKey.experience && Objects.equals(name, workerKey.name);
    }

    @Override
    public String toString() {
        return "{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
