package joao.academy.inventory.domain.DTO;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private boolean available;
    private String categoryPath;
    private Long categoryId;
}