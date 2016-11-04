package universe.utils.db;

import org.springframework.beans.factory.annotation.Autowired;
import universe.model.Group;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by macaque on 04.11.2016.
 */
public class DBChecker {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean checkGroup(Group group){
        List<Group> groupList = entityManager.createQuery("SELECT g FROM Group g WHERE g.name LIKE :groupName ")
                .setParameter("groupName",group.getName()).getResultList();
        return groupList.isEmpty();
    }
}
