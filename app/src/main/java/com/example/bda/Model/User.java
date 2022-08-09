package com.example.bda.Model;

public class User {
    String name,bloodgroup,id,email,idnumber,phonenumber,profilepictureurl,search,type;

    public User() {
    }

    public User(String name, String bloodgroup, String id, String email, String idnumber, String phonenumber, String profilepictureurl, String search, String type) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.id = id;
        this.email = email;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
        this.profilepictureurl = profilepictureurl;
        this.search = search;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getProfilepictureurl() {
        return profilepictureurl;
    }

    public String getSearch() {
        return search;
    }

    public String getType() {
        return type;
    }
}
