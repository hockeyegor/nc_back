package com.example.aviasales2.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransport is a Querydsl query type for Transport
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransport extends EntityPathBase<Transport> {

    private static final long serialVersionUID = -491432984L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransport transport = new QTransport("transport");

    public final QCompany company;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> passengerCapacity = createNumber("passengerCapacity", Integer.class);

    public final NumberPath<Long> transportId = createNumber("transportId", Long.class);

    public final SetPath<Trip, QTrip> trips = this.<Trip, QTrip>createSet("trips", Trip.class, QTrip.class, PathInits.DIRECT2);

    public QTransport(String variable) {
        this(Transport.class, forVariable(variable), INITS);
    }

    public QTransport(Path<? extends Transport> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransport(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransport(PathMetadata metadata, PathInits inits) {
        this(Transport.class, metadata, inits);
    }

    public QTransport(Class<? extends Transport> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.company = inits.isInitialized("company") ? new QCompany(forProperty("company")) : null;
    }

}

