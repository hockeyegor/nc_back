package com.example.aviasales2.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHotel is a Querydsl query type for Hotel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHotel extends EntityPathBase<Hotel> {

    private static final long serialVersionUID = -1831709197L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHotel hotel = new QHotel("hotel");

    public final StringPath address = createString("address");

    public final QCity city;

    public final NumberPath<java.math.BigDecimal> commentRating = createNumber("commentRating", java.math.BigDecimal.class);

    public final ListPath<Comment, QComment> comments = this.<Comment, QComment>createList("comments", Comment.class, QComment.class, PathInits.DIRECT2);

    public final StringPath country = createString("country");

    public final StringPath description = createString("description");

    public final ListPath<HotelConvenience, EnumPath<HotelConvenience>> hotelConveniences = this.<HotelConvenience, EnumPath<HotelConvenience>>createList("hotelConveniences", HotelConvenience.class, EnumPath.class, PathInits.DIRECT2);

    public final NumberPath<Long> hotelId = createNumber("hotelId", Long.class);

    public final StringPath hotelName = createString("hotelName");

    public final StringPath image = createString("image");

    public final StringPath lat = createString("lat");

    public final StringPath lng = createString("lng");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Short> rating = createNumber("rating", Short.class);

    public final ListPath<Reservation, QReservation> reservations = this.<Reservation, QReservation>createList("reservations", Reservation.class, QReservation.class, PathInits.DIRECT2);

    public final ListPath<Room, QRoom> rooms = this.<Room, QRoom>createList("rooms", Room.class, QRoom.class, PathInits.DIRECT2);

    public final SetPath<RoomType, EnumPath<RoomType>> roomTypes = this.<RoomType, EnumPath<RoomType>>createSet("roomTypes", RoomType.class, EnumPath.class, PathInits.DIRECT2);

    public QHotel(String variable) {
        this(Hotel.class, forVariable(variable), INITS);
    }

    public QHotel(Path<? extends Hotel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHotel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHotel(PathMetadata metadata, PathInits inits) {
        this(Hotel.class, metadata, inits);
    }

    public QHotel(Class<? extends Hotel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.city = inits.isInitialized("city") ? new QCity(forProperty("city")) : null;
    }

}

