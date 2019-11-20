package com.lxx.test.model;

public class t_user {
    private String id;

    private String name;

    private String age;

    public t_user(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public t_user() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}