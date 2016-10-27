package universe.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import universe.dao.interfaces.GroupDAO;
import universe.model.Group;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by macaque on 22.10.2016.
 */
@Component
public class GroupDAOImpl implements GroupDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public GroupDAOImpl() {
    }

    @Override
    public List<Group> getAll(int position, int offset) {
        return null;
    }

    @Override
    public Group updateInstance(Group entity) {
        return null;
    }

    @Override
    public Group addInstance(Group entity) {
        return null;
    }

    @Override
    public Group deleteInstance(Group entity) {
        return null;
    }

    @Override
    @Transactional
    public Group findInstance(Group group) {
        entityManager.find(Group.class,group.getId());
        return group;
    }
}
