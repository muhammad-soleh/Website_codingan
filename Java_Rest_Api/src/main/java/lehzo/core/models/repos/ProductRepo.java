package lehzo.core.models.repos;

import lehzo.core.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Long>{
    List<Product> findByNamaContains(String nama);
}
