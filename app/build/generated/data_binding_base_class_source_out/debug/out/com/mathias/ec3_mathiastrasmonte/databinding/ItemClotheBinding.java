// Generated by view binder compiler. Do not edit!
package com.mathias.ec3_mathiastrasmonte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mathias.ec3_mathiastrasmonte.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemClotheBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Guideline guidelineMiddle;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView txtPrecio;

  @NonNull
  public final TextView txtTitulo;

  private ItemClotheBinding(@NonNull CardView rootView, @NonNull Guideline guidelineMiddle,
      @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView txtPrecio,
      @NonNull TextView txtTitulo) {
    this.rootView = rootView;
    this.guidelineMiddle = guidelineMiddle;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
    this.txtPrecio = txtPrecio;
    this.txtTitulo = txtTitulo;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemClotheBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemClotheBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_clothe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemClotheBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline_middle;
      Guideline guidelineMiddle = ViewBindings.findChildViewById(rootView, id);
      if (guidelineMiddle == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.txt_Precio;
      TextView txtPrecio = ViewBindings.findChildViewById(rootView, id);
      if (txtPrecio == null) {
        break missingId;
      }

      id = R.id.txt_Titulo;
      TextView txtTitulo = ViewBindings.findChildViewById(rootView, id);
      if (txtTitulo == null) {
        break missingId;
      }

      return new ItemClotheBinding((CardView) rootView, guidelineMiddle, imageView, linearLayout,
          txtPrecio, txtTitulo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
