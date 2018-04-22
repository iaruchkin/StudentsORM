package dbService.dao;

import dbService.dataSets.StudentsDataSet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.List;

public class StudentsDAO {

    private Session session;

    public StudentsDAO(Session session) {
        this.session = session;
    }

    public StudentsDataSet get(long id) throws HibernateException {
        return (StudentsDataSet) session.get(StudentsDataSet.class, id);
    }

    public List getAll() throws HibernateException {
        Criteria criteria = session.createCriteria(StudentsDataSet.class);
        return criteria.list();
    }

    public long insertStudent(String name, String surname, String midname, String birthdate, String group) throws HibernateException {
        return (Long) session.save(new StudentsDataSet(name, surname, midname, birthdate, group));

    }
}
