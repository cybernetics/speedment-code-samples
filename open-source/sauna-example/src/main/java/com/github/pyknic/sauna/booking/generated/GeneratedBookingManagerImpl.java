package com.github.pyknic.sauna.booking.generated;

import com.github.pyknic.sauna.booking.Booking;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * The generated base implementation for the manager of every {@link
 * com.github.pyknic.sauna.booking.Booking} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedBookingManagerImpl extends AbstractManager<Booking> implements GeneratedBookingManager {
    
    private final TableIdentifier<Booking> tableIdentifier;
    
    protected GeneratedBookingManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("db0", "sauna", "booking");
    }
    
    @Override
    public TableIdentifier<Booking> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Booking>> fields() {
        return Stream.of(
            Booking.ID,
            Booking.BOOKING_ID,
            Booking.EVENT_TYPE,
            Booking.TENANT,
            Booking.SAUNA,
            Booking.BOOKED_FROM,
            Booking.BOOKED_TO
        );
    }
    
    @Override
    public Stream<Field<Booking>> primaryKeyFields() {
        return Stream.of(
            Booking.ID
        );
    }
}