package testBeerstock.builder;

import lombok.Builder;
import beerstock.dto.BeerDTO;
import beerstock.enums.BeerType;

@Builder
public class BeerDTOBuilder {   

    @Builder()
    public BeerDTOBuilder() {
    }
    public static Object builder() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
        
    @Builder.Default
    private final Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private int max = 50;

    @Builder.Default
    private int quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(id,
                name,
                brand,
                max,
                quantity,
                type);
    }
    
    
}
