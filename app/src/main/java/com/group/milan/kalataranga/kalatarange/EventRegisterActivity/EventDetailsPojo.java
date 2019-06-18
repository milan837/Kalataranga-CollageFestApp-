package com.group.milan.kalataranga.kalatarange.EventRegisterActivity;

public class EventDetailsPojo {
    public String name;
    public String branch;
    public String number;
    public String year;
    public String message;
    public String eventName;
    public String date;

    public EventDetailsPojo() {
    }

    public EventDetailsPojo(String name, String branch, String number, String year, String message, String eventName,String date) {
        this.name = name;
        this.branch = branch;
        this.number = number;
        this.year = year;
        this.message = message;
        this.eventName = eventName;
        this.date=date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getBranch() {
        return branch;
    }

    public String getEventName() {
        return eventName;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    public String getYear() {
        return year;
    }
}
