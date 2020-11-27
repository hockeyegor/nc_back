package com.example.aviasales2.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTrip is a Querydsl query type for Trip
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTrip extends EntityPathBase<Trip> {

    private static final long serialVersionUID = 2019482630L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTrip trip = new QTrip("trip");

    public final QCity cityDest;

    public final QCity cityFrom;

    public final DateTimePath<java.sql.Timestamp> dateDest = createDateTime("dateDest", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> dateFrom = createDateTime("dateFrom", java.sql.Timestamp.class);

    public final NumberPath<Integer> fullCountSeats = createNumber("fullCountSeats", Integer.class);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final QTransport transport;

    public final NumberPath<Long> tripId = createNumber("tripId", Long.class);

    public QTrip(String variable) {
        this(Trip.class, forVariable(variable), INITS);
    }

    public QTrip(Path<? extends Trip> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTrip(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTrip(PathMetadata metadata, PathInits inits) {
        this(Trip.class, metadata, inits);
    }

    public QTrip(Class<? extends Trip> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cityDest = inits.isInitialized("cityDest") ? new QCity(forProperty("cityDest")) : null;
        this.cityFrom = inits.isInitialized("cityFrom") ? new QCity(forProperty("cityFrom")) : null;
        this.transport = inits.isInitialized("transport") ? new QTransport(forProperty("transport"), inits.get("transport")) : null;
    }

}

