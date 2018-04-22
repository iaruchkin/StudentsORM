package dbService.dataSets;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "students")
public class StudentsDataSet implements Serializable { // Serializable Important to Hibernate!
    private static final long serialVersionUID = -8706689714326132798L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = false, updatable = true)
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "midname")
    private String midname;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "groupid")
    private String groupid;

    //Important to Hibernate!
    @SuppressWarnings("UnusedDeclaration")
    public StudentsDataSet() {
    }

    @SuppressWarnings("UnusedDeclaration")
    public StudentsDataSet(long id, String name, String surname, String midname, String birthdate, String groupid) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setMidname(midname);
        this.setBirthdate(birthdate);
        this.setGroupid(groupid);
    }

    public StudentsDataSet(String name, String surname, String midname, String birthdate, String groupid) {
        this.setId(-1);
        this.setName(name);
        this.setSurname(surname);
        this.setMidname(midname);
        this.setBirthdate(birthdate);
        this.setGroupid(groupid);
    }

    @SuppressWarnings("UnusedDeclaration")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    @Override
    public String toString() {
        return "StudentsDataSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", groupid='" + groupid + '\'' +
                '}';
    }
}