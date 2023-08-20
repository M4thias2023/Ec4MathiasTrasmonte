package com.mathias.ec3_mathiastrasmonte.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/mathias/ec3_mathiastrasmonte/data/repository/ClotheRepository;", "", "clotheDao", "Lcom/mathias/ec3_mathiastrasmonte/data/db/ClotheDao;", "(Lcom/mathias/ec3_mathiastrasmonte/data/db/ClotheDao;)V", "getClotheDao", "()Lcom/mathias/ec3_mathiastrasmonte/data/db/ClotheDao;", "addFavorite", "", "clothe", "Lcom/mathias/ec3_mathiastrasmonte/model/Clothe;", "(Lcom/mathias/ec3_mathiastrasmonte/model/Clothe;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClothes", "Lcom/mathias/ec3_mathiastrasmonte/data/response/ApiResponse;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavorites", "removeFavorite", "app_debug"})
public final class ClotheRepository {
    @org.jetbrains.annotations.Nullable()
    private final com.mathias.ec3_mathiastrasmonte.data.db.ClotheDao clotheDao = null;
    
    public ClotheRepository() {
        super();
    }
    
    public ClotheRepository(@org.jetbrains.annotations.Nullable()
    com.mathias.ec3_mathiastrasmonte.data.db.ClotheDao clotheDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mathias.ec3_mathiastrasmonte.data.db.ClotheDao getClotheDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getClothes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mathias.ec3_mathiastrasmonte.data.response.ApiResponse<java.util.List<com.mathias.ec3_mathiastrasmonte.model.Clothe>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addFavorite(@org.jetbrains.annotations.NotNull()
    com.mathias.ec3_mathiastrasmonte.model.Clothe clothe, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object removeFavorite(@org.jetbrains.annotations.NotNull()
    com.mathias.ec3_mathiastrasmonte.model.Clothe clothe, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mathias.ec3_mathiastrasmonte.model.Clothe> getFavorites() {
        return null;
    }
}