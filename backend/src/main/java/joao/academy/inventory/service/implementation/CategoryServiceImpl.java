package joao.academy.inventory.service.implementation;

import java.util.List;
import joao.academy.inventory.domain.DTO.CategoryDTO;
import joao.academy.inventory.domain.entity.CategoryEntity;
import joao.academy.inventory.service.contracts.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    
    // TODO
    @Override
    public List<CategoryDTO> getAllCategories() {
        return List.of();
    }
    
    // TODO
    @Override
    public CategoryDTO getCategoryById(Long categoryId) {
        return null;
    }
    
    // TODO
    @Override
    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        return null;
    }
    
    // TODO
    @Override
    public CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO) {
        return null;
    }
    
    // TODO
    @Override
    public void deleteCategory(Long categoryId) {
        
    }
    
    // TODO
    @Override
    public String getCategoryPath(CategoryEntity category) {
        return "";
    }
}
