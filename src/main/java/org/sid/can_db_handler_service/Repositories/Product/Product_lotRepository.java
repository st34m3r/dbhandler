package org.sid.can_db_handler_service.Repositories.Product;

import org.sid.can_db_handler_service.Entities.Product.Product_lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Product_lotRepository extends JpaRepository<Product_lot,Integer> {
}
