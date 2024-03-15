package org.example;

import java.util.*;

public class WorkerPhoneList {
    List<Worker> phones;

    public WorkerPhoneList() {
        phones = new ArrayList<>();
    }

    public WorkerPhoneList(List<Worker> phones) {
        this.phones = phones;
    }

    public void add(int ID, String name, int experience, String phone){
        WorkerKey key = new WorkerKey(ID, name, experience);

        int findIndex = contains(key);
        if(findIndex > -1){
            phones.get(findIndex).addPhone(phone);
        } else {
            phones.add(new Worker(ID, name, experience, phone));
        }
    }

    private int contains(WorkerKey key){
        for (int i = 0; i < phones.size(); i++) {
            if(phones.get(i).getKey().equals(key)){
                return i;
            }
        }

        return -1;
    }


    public List<Worker> findForExperience(int experience){
        List<Worker> neededWorkers = new ArrayList<>();
        for (Worker person : phones) {
            if(person.getExperience() == experience){
                neededWorkers.add(person);
            }
        }

        return neededWorkers;
    }

    public List<String> findForNamePhoneList(String name){
        for (Worker person : phones) {
            if(person.getName().equals(name)){
                return person.getPhones();
            }
        }

        return null;
    }

    public Worker findForID(int ID){
        for (Worker person : phones) {
            if(person.getID() == ID){
                return person;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "WorkerPhoneList{" + phones + '}';
    }
}
