package com.mathias.ec3_mathiastrasmonte.views.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.mathias.ec3_mathiastrasmonte.model.Clothe;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ClotheDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ClotheDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ClotheDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static ClotheDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ClotheDetailFragmentArgs __result = new ClotheDetailFragmentArgs();
    bundle.setClassLoader(ClotheDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("clothe")) {
      Clothe clothe;
      if (Parcelable.class.isAssignableFrom(Clothe.class) || Serializable.class.isAssignableFrom(Clothe.class)) {
        clothe = (Clothe) bundle.get("clothe");
      } else {
        throw new UnsupportedOperationException(Clothe.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (clothe == null) {
        throw new IllegalArgumentException("Argument \"clothe\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("clothe", clothe);
    } else {
      throw new IllegalArgumentException("Required argument \"clothe\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ClotheDetailFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ClotheDetailFragmentArgs __result = new ClotheDetailFragmentArgs();
    if (savedStateHandle.contains("clothe")) {
      Clothe clothe;
      clothe = savedStateHandle.get("clothe");
      if (clothe == null) {
        throw new IllegalArgumentException("Argument \"clothe\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("clothe", clothe);
    } else {
      throw new IllegalArgumentException("Required argument \"clothe\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Clothe getClothe() {
    return (Clothe) arguments.get("clothe");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("clothe")) {
      Clothe clothe = (Clothe) arguments.get("clothe");
      if (Parcelable.class.isAssignableFrom(Clothe.class) || clothe == null) {
        __result.set("clothe", Parcelable.class.cast(clothe));
      } else if (Serializable.class.isAssignableFrom(Clothe.class)) {
        __result.set("clothe", Serializable.class.cast(clothe));
      } else {
        throw new UnsupportedOperationException(Clothe.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ClotheDetailFragmentArgs that = (ClotheDetailFragmentArgs) object;
    if (arguments.containsKey("clothe") != that.arguments.containsKey("clothe")) {
      return false;
    }
    if (getClothe() != null ? !getClothe().equals(that.getClothe()) : that.getClothe() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getClothe() != null ? getClothe().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ClotheDetailFragmentArgs{"
        + "clothe=" + getClothe()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ClotheDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Clothe clothe) {
      if (clothe == null) {
        throw new IllegalArgumentException("Argument \"clothe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("clothe", clothe);
    }

    @NonNull
    public ClotheDetailFragmentArgs build() {
      ClotheDetailFragmentArgs result = new ClotheDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setClothe(@NonNull Clothe clothe) {
      if (clothe == null) {
        throw new IllegalArgumentException("Argument \"clothe\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("clothe", clothe);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Clothe getClothe() {
      return (Clothe) arguments.get("clothe");
    }
  }
}
