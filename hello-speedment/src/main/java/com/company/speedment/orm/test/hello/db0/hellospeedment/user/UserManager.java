package com.company.speedment.orm.test.hello.db0.hellospeedment.user;

import com.speedment.orm.config.model.Column;
import com.speedment.orm.config.model.Table;
import com.speedment.orm.core.manager.SqlManager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ManagerComponent;
import com.speedment.orm.platform.component.ProjectComponent;
import java.lang.IllegalArgumentException;
import javax.annotation.Generated;

/**
 * A manager representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.user'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface UserManager extends SqlManager<Integer, User, UserBuilder> {
    
    @Override
    default Integer primaryKeyFor(User entity) {
        return entity.getId();
    }
    
    @Override
    default Table getTable() {
        return Platform.get().get(ProjectComponent.class).getProject().findTableByName("db0.hellospeedment.user");
    }
    
    @Override
    default Class<UserManager> getManagerClass() {
        return UserManager.class;
    }
    
    @Override
    default Class<User> getEntityClass() {
        return User.class;
    }
    
    @Override
    default Class<UserBuilder> getBuilderClass() {
        return UserBuilder.class;
    }
    
    @Override
    default Object get(User entity, Column column) {
        switch (column.getName()) {
            case "id" : return entity.getId();
            case "mail" : return entity.getMail();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @SuppressWarnings("unchecked")
    static UserManager get() {
        return (UserManager) Platform.get().get(ManagerComponent.class).manager(UserManager.class);
    }
}