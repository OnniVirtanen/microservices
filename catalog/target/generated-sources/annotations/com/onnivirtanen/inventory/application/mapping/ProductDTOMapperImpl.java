package com.onnivirtanen.inventory.application.mapping;

import com.onnivirtanen.inventory.domain.model.aggregate.Product;
import com.onnivirtanen.inventory.domain.model.entity.Category;
import com.onnivirtanen.inventory.domain.model.valueobject.Discount;
import com.onnivirtanen.inventory.domain.model.valueobject.EANBarcode;
import com.onnivirtanen.inventory.domain.model.valueobject.Price;
import com.onnivirtanen.inventory.domain.model.valueobject.Quantity;
import com.onnivirtanen.inventory.domain.model.valueobject.ShelfLocation;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-09T09:48:23+0300",
    comments = "version: 1.5.0.Beta1, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class ProductDTOMapperImpl implements ProductDTOMapper {

    @Override
    public ProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        UUID id = null;
        EANBarcode barcode = null;
        Price price = null;
        Category category = null;
        ShelfLocation location = null;
        Discount discount = null;
        Quantity quantity = null;

        id = product.getId();
        barcode = product.getBarcode();
        price = product.getPrice();
        category = product.getCategory();
        location = product.getLocation();
        discount = product.getDiscount();
        quantity = product.getQuantity();

        ProductDTO productDTO = new ProductDTO( id, barcode, price, category, location, discount, quantity );

        return productDTO;
    }

    @Override
    public Product fromDTO(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        UUID id = null;
        EANBarcode barcode = null;
        Price price = null;
        Category category = null;
        ShelfLocation location = null;
        Discount discount = null;
        Quantity quantity = null;

        id = productDTO.id();
        barcode = productDTO.barcode();
        price = productDTO.price();
        category = productDTO.category();
        location = productDTO.location();
        discount = productDTO.discount();
        quantity = productDTO.quantity();

        Product product = new Product( id, barcode, price, category, location, discount, quantity );

        return product;
    }
}
