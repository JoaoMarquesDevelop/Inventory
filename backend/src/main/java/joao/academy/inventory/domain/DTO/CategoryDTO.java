package joao.academy.inventory.domain.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CategoryDTO {
    private Long id;
    private String name;
    private String description;
    private String categoryPath;
    private Long parentCategoryId;
}