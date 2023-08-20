package com.mathias.ec3_mathiastrasmonte.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\fH\u0002J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/mathias/ec3_mathiastrasmonte/views/AddClotheActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/mathias/ec3_mathiastrasmonte/databinding/ActivityAddClotheBinding;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "selectedImageUri", "Landroid/net/Uri;", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "cleanTextFields", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openImageSelector", "uploadImageAndClotheData", "title", "", "price", "description", "Companion", "app_debug"})
public final class AddClotheActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.mathias.ec3_mathiastrasmonte.databinding.ActivityAddClotheBinding binding;
    private com.google.firebase.firestore.FirebaseFirestore firestore;
    private com.google.firebase.storage.FirebaseStorage storage;
    private android.net.Uri selectedImageUri;
    @org.jetbrains.annotations.NotNull()
    public static final com.mathias.ec3_mathiastrasmonte.views.AddClotheActivity.Companion Companion = null;
    private static final int IMAGE_PICKER_REQUEST = 123;
    
    public AddClotheActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void uploadImageAndClotheData(java.lang.String title, java.lang.String price, java.lang.String description) {
    }
    
    private final void openImageSelector() {
    }
    
    private final void cleanTextFields() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mathias/ec3_mathiastrasmonte/views/AddClotheActivity$Companion;", "", "()V", "IMAGE_PICKER_REQUEST", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}