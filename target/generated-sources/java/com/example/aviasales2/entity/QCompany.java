package com.example.aviasales2.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompany is a Querydsl query type for Company
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompany extends EntityPathBase<Company> {

    private static final long serialVersionUID = 515357948L;

    public static final QCompany company = new QCompany("company");

    public final NumberPath<java.math.BigDecimal> commentRating = createNumber("commentRating", java.math.BigDecimal.class);

    public final ListPath<Comment, QComment> comments = this.<Comment, QComment>createList("comments", Comment.class, QComment.class, PathInits.DIRECT2);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath companyName = createString("companyName");

    public final NumberPath<Double> rating = createNumber("rating", Double.class);

    public final SetPath<Tour, QTour> tours = this.<Tour, QTour>createSet("tours", Tour.class, QTour.class, PathInits.DIRECT2);

    public final NumberPath<Integer> transportCount = createNumber("transportCount", Integer.class);

    public final SetPath<Transport, QTransport> transportId = this.<Transport, QTransport>createSet("transportId", Transport.class, QTransport.class, PathInits.DIRECT2);

    public QCompany(String variable) {
        super(Company.class, forVariable(variable));
    }

    public QCompany(Path<? extends Company> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompany(PathMetadata metadata) {
        super(Company.class, metadata);
    }

}

