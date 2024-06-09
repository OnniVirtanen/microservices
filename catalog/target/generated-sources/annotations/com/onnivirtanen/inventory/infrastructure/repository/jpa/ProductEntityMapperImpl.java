package com.onnivirtanen.inventory.infrastructure.repository.jpa;

import com.onnivirtanen.inventory.domain.model.aggregate.Product;
import com.onnivirtanen.inventory.domain.model.entity.Category;
import com.onnivirtanen.inventory.domain.model.valueobject.Discount;
import com.onnivirtanen.inventory.domain.model.valueobject.EANBarcode;
import com.onnivirtanen.inventory.domain.model.valueobject.Price;
import com.onnivirtanen.inventory.domain.model.valueobject.Quantity;
import com.onnivirtanen.inventory.domain.model.valueobject.ShelfLocation;
import com.onnivirtanen.inventory.infrastructure.repository.jpa.entity.ProductEntity;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-09T09:48:23+0300",
    comments = "version: 1.5.0.Beta1, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class ProductEntityMapperImpl implements ProductEntityMapper {

    @Override
    public ProductEntity toEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( product.getId() );
        productEntity.setBarcode( eanBarcodeToString( product.getBarcode() ) );
        productEntity.setPrice( priceToBigDecimal( product.getPrice() ) );
        productEntity.setCategory( categoryToCategoryEntity( product.getCategory() ) );
        productEntity.setLocation( shelfLocationToString( product.getLocation() ) );
        productEntity.setDiscount( discountToInteger( product.getDiscount() ) );
        productEntity.setQuantity( quantityToLong( product.getQuantity() ) );

        return productEntity;
    }

    @Override
    public Product toProduct(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        UUID id = null;
        EANBarcode barcode = null;
        Price price = null;
        Category category = null;
        ShelfLocation location = null;
        Discount discount = null;
        Quantity quantity = null;

        id = productEntity.getId();
        barcode = stringToEanBarcode( productEntity.getBarcode() );
        price = bigDecimalToPrice( productEntity.getPrice() );
        category = categoryEntityToCategory( productEntity.getCategory() );
        location = stringToShelfLocation( productEntity.getLocation() );
        discount = integerToDiscount( productEntity.getDiscount() );
        quantity = longToQuantity( productEntity.getQuantity() );

        Product product = new Product( id, barcode, price, category, location, discount, quantity );

        return product;
    }
}
