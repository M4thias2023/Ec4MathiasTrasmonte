package com.mathias.ec3_mathiastrasmonte.views.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.mathias.ec3_mathiastrasmonte.R;
import com.mathias.ec3_mathiastrasmonte.model.Clothe;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ClotheFavoriteFragmentDirections {
  private ClotheFavoriteFragmentDirections() {
  }

  @NonNull
  public static ActionClotheFavoriteFragmentToClotheDetailFragment actionClotheFavoriteFragmentToClotheDetailFragment(
      @NonNull Clothe clothe) {
    return new ActionClotheFavoriteFragmentToClotheDetailFragment(clothe);
  }

  public static class ActionClotheFavoriteFragmentToClotheDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionClotheFavoriteFragmentToClotheDetailFragment(@NonNull Clothe clothe) {
      if (clothe == null) {
        throw new IllegalArgumentException("Argument \"clothe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("clothe", clothe);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionClotheFavoriteFragmentToClotheDetailFragment setClothe(@NonNull Clothe clothe) {
      if (clothe == null) {
        throw new IllegalArgumentException("Argument \"clothe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("clothe", clothe);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("clothe")) {
        Clothe clothe = (Clothe) arguments.get("clothe");
        if (Parcelable.class.isAssignableFrom(Clothe.class) || clothe == null) {
          __result.putParcelable("clothe", Parcelable.class.cast(clothe));
        } else if (Serializable.class.isAssignableFrom(Clothe.class)) {
          __result.putSerializable("clothe", Serializable.class.cast(clothe));
        } else {
          throw new UnsupportedOperationException(Clothe.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_clotheFavoriteFragment_to_clotheDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Clothe getClothe() {
      return (Clothe) arguments.get("clothe");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionClotheFavoriteFragmentToClotheDetailFragment that = (ActionClotheFavoriteFragmentToClotheDetailFragment) object;
      if (arguments.containsKey("clothe") != that.arguments.containsKey("clothe")) {
        return false;
      }
      if (getClothe() != null ? !getClothe().equals(that.getClothe()) : that.getClothe() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getClothe() != null ? getClothe().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionClotheFavoriteFragmentToClotheDetailFragment(actionId=" + getActionId() + "){"
          + "clothe=" + getClothe()
          + "}";
    }
  }
}
