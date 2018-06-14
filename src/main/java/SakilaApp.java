import mw.sda.entities.CategoryEntity;
import mw.sda.hibernate.HibernateHelper;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * Sakila - pobieranie danych z bazy sakila tabela category
 */
public class SakilaApp {
    public static void main(String[] args) {
        System.out.println("Conect to the database");
        HibernateHelper.prepareSessionFactory();
        Session session = HibernateHelper.openSessionFactory();
        byte liczba = 1;
        CategoryEntity categoryEntity = session.get(CategoryEntity.class, liczba);

        System.out.println("odczyt rekordu o id= 1");
        System.out.println(categoryEntity);
        String entityName = "CategoryEntity";

        System.out.println("Odczyt wszystkich rekordów");
        Query query = session.createQuery("from " + entityName);
        System.out.println("executing: " + query.getQueryString());
        for (Object o : query.list()) {
            System.out.println("  " + o);
        }
        System.out.println("zamykanie sesji");
        session.close();
        HibernateHelper.closeSessionFactory();
    }
}