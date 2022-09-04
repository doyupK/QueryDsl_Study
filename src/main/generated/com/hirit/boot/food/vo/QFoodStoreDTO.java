package com.hirit.boot.food.vo;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * com.hirit.boot.food.vo.QFoodStoreDTO is a Querydsl Projection type for FoodStoreDTO
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QFoodStoreDTO extends ConstructorExpression<FoodStoreDTO> {

    private static final long serialVersionUID = -1293602434L;

    public QFoodStoreDTO(com.querydsl.core.types.Expression<Integer> id, com.querydsl.core.types.Expression<String> storeName, com.querydsl.core.types.Expression<Integer> rate, com.querydsl.core.types.Expression<String> ownerName, com.querydsl.core.types.Expression<String> foodTypeName, com.querydsl.core.types.Expression<Integer> foodOrder) {
        super(FoodStoreDTO.class, new Class<?>[]{int.class, String.class, int.class, String.class, String.class, int.class}, id, storeName, rate, ownerName, foodTypeName, foodOrder);
    }

}

