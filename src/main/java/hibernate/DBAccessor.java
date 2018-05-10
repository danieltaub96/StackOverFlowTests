package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class DBAccessor {

    private Session currentSession;

    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();

        // entitie
        configuration.addAnnotatedClass(A.class);
        configuration.addAnnotatedClass(B.class);
        configuration.addAnnotatedClass(C.class);
        configuration.addAnnotatedClass(D.class);


        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public <T> void persist(T entity) {
        getCurrentSession().save(entity);
    }

    public <T> void merge(T entity) {
        getCurrentSession().merge(entity);
    }

    public <T> void update(T entity) {
        getCurrentSession().update(entity);
    }

    public <T> T findById(Class<T> clazz, String id) {
        T entity = (T) getCurrentSession().get(clazz, id);
        return entity;
    }

    public <T> void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findAll(Class<T> clazz) {
        List<T> entities = (List<T>) getCurrentSession().createQuery("from " + clazz.getSimpleName()).list();
        return entities;
    }

    public <T> void deleteAll(Class<T> clazz) {
        List<T> entityList = findAll(clazz);
        for (T entity : entityList) {
            delete(entity);
        }
    }
}