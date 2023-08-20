package com.mathias.ec3_mathiastrasmonte.views.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.mathias.ec3_mathiastrasmonte.R;

public class ClotheDetailFragmentDirections {
  private ClotheDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionClotheDetailFragmentToClotheFavoriteFragment() {
    return new ActionOnlyNavDirections(R.id.action_clotheDetailFragment_to_clotheFavoriteFragment);
  }
}
