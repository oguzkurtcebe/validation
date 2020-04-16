package com.oguzkurtcebe.organization.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface JpaFactory {
EntityManager getEntityManager();
EntityTransaction getTransaction();
}
