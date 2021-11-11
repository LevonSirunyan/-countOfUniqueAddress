package am.springbatch.mapper;

import am.springbatch.entity.Address;
import lombok.SneakyThrows;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.boot.context.properties.bind.BindException;

public class AddressMapper implements FieldSetMapper<Address> {

    @SneakyThrows
    @Override
    public Address mapFieldSet(FieldSet fieldSet) throws BindException {
        return Address.builder()
                .addressValue(fieldSet.getValues()[0])
                .build();
    }

}