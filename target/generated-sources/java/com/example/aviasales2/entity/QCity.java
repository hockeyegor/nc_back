package com.example.aviasales2.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCity is a Querydsl query type for City
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCity extends EntityPathBase<City> {

    private static final long serialVersionUID = 2018967884L;

    public static final QCity city = new QCity("city");

    public final NumberPath<Long> cityId = createNumber("cityId", Long.class);

    public final StringPath cityName = createString("cityName");

    public final StringPath country = createString("country");

    public final ListPath<Hotel, QHotel> hotels = this.<Hotel, QHotel>createList("hotels", Hotel.class, QHotel.class, PathInits.DIRECT2);

    public final StringPath image = createString("image");

    public final StringPath lat = createString("lat");

    public final StringPath lng = createString("lng");

    public final NumberPath<Long> population = createNumber("population", Long.class);

    public final SetPath<Tour, QTour> tours = this.<Tour, QTour>createSet("tours", Tour.class, QTour.class, PathInits.DIRECT2);

    public final SetPath<Trip, QTrip> trip_dest = this.<Trip, QTrip>createSet("trip_dest", Trip.class, QTrip.class, PathInits.DIRECT2);

    public final SetPath<Trip, QTrip> trip_from = this.<Trip, QTrip>createSet("trip_from", Trip.class, QTrip.class, PathInits.DIRECT2);

    public QCity(String variable) {
        super(City.class, forVariable(variable));
    }

    public QCity(Path<? extends City> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCity(PathMetadata metadata) {
        super(City.class, metadata);
    }

}

