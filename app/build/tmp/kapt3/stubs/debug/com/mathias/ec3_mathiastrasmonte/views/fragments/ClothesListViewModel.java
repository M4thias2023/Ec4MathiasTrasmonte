package com.mathias.ec3_mathiastrasmonte.views.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/mathias/ec3_mathiastrasmonte/views/fragments/ClothesListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_clothesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/mathias/ec3_mathiastrasmonte/model/Clothe;", "clothesList", "Landroidx/lifecycle/LiveData;", "getClothesList", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/mathias/ec3_mathiastrasmonte/data/repository/ClotheRepository;", "getClothesFromService", "", "app_debug"})
public final class ClothesListViewModel extends androidx.lifecycle.ViewModel {
    private final com.mathias.ec3_mathiastrasmonte.data.repository.ClotheRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.mathias.ec3_mathiastrasmonte.model.Clothe>> _clothesList = null;
    
    public ClothesListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.mathias.ec3_mathiastrasmonte.model.Clothe>> getClothesList() {
        return null;
    }
    
    public final void getClothesFromService() {
    }
}