package joao.academy.inventory.service.contracts;

import java.util.List;
import joao.academy.inventory.domain.DTO.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    
    /**
     * Get all products with their category paths
     */
    List<ProductDTO> getAllProducts();
    
    /**
     * Get a product by ID
     */
    ProductDTO getProductById(Long productId);
    
    /**
     * Add a new product
     */
    ProductDTO addProduct(ProductDTO productDTO);
    
    /**
     * Edit an existing product
     */
    ProductDTO updateProduct(Long productId, ProductDTO productDTO);
    
    /**
     * Delete a product
     */
    void deleteProduct(Long productId);
}
