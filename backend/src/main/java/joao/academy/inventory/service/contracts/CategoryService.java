package joao.academy.inventory.service.contracts;

import java.util.List;
import joao.academy.inventory.domain.DTO.CategoryDTO;
import joao.academy.inventory.domain.entity.CategoryEntity;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    
    /**
     * Get all categories with their full category path
     */
    List<CategoryDTO> getAllCategories();
    
    /**
     * Get a category by ID
     */
    CategoryDTO getCategoryById(Long categoryId);
    
    /**
     * Add a new category
     */
    CategoryDTO addCategory(CategoryDTO categoryDTO);
    
    /**
     * Update an existing category
     */
    CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO);
    
    /**
     * Delete a category
     */
    void deleteCategory(Long categoryId);
    
    /**
     * Retrieve full category path
     */
    String getCategoryPath(CategoryEntity category);
}
