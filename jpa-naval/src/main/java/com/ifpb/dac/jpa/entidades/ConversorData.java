package com.ifpb.dac.jpa.entidades;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConversorData implements AttributeConverter<LocalDate, Date>{

    @Override
    public Date convertToDatabaseColumn(LocalDate x) {
        if(x == null){
            return null;
        } else {
            return Date.valueOf(x);
        }
    }

    @Override
    public LocalDate convertToEntityAttribute(Date y) {
        if(y == null){
            return null;
        } else {
            return y.toLocalDate();
        }
    }
    
}
