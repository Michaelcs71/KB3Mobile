// Generated by view binder compiler. Do not edit!
package com.example.kuisbesarmobileketiga.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.kuisbesarmobileketiga.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button category1;

  @NonNull
  public final Button category2;

  @NonNull
  public final Button category3;

  @NonNull
  public final Button category4;

  @NonNull
  public final Button category5;

  @NonNull
  public final HorizontalScrollView coming;

  @NonNull
  public final ImageView coming1;

  @NonNull
  public final ImageView coming2;

  @NonNull
  public final ImageView coming3;

  @NonNull
  public final ImageView coming4;

  @NonNull
  public final ImageView imagerekom1;

  @NonNull
  public final ImageView imagerekom2;

  @NonNull
  public final ImageView imagerekom3;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ImageView profilhome;

  @NonNull
  public final EditText searchHome;

  @NonNull
  public final TextView textcategory;

  @NonNull
  public final TextView textcoming1;

  @NonNull
  public final TextView textcoming2;

  @NonNull
  public final TextView textcoming3;

  @NonNull
  public final TextView textcoming4;

  @NonNull
  public final TextView texthome1;

  @NonNull
  public final TextView texthome2;

  @NonNull
  public final TextView texthome3;

  @NonNull
  public final TextView texthome4;

  @NonNull
  public final TextView textrekom;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull Button category1,
      @NonNull Button category2, @NonNull Button category3, @NonNull Button category4,
      @NonNull Button category5, @NonNull HorizontalScrollView coming, @NonNull ImageView coming1,
      @NonNull ImageView coming2, @NonNull ImageView coming3, @NonNull ImageView coming4,
      @NonNull ImageView imagerekom1, @NonNull ImageView imagerekom2,
      @NonNull ImageView imagerekom3, @NonNull ConstraintLayout main, @NonNull ImageView profilhome,
      @NonNull EditText searchHome, @NonNull TextView textcategory, @NonNull TextView textcoming1,
      @NonNull TextView textcoming2, @NonNull TextView textcoming3, @NonNull TextView textcoming4,
      @NonNull TextView texthome1, @NonNull TextView texthome2, @NonNull TextView texthome3,
      @NonNull TextView texthome4, @NonNull TextView textrekom) {
    this.rootView = rootView;
    this.category1 = category1;
    this.category2 = category2;
    this.category3 = category3;
    this.category4 = category4;
    this.category5 = category5;
    this.coming = coming;
    this.coming1 = coming1;
    this.coming2 = coming2;
    this.coming3 = coming3;
    this.coming4 = coming4;
    this.imagerekom1 = imagerekom1;
    this.imagerekom2 = imagerekom2;
    this.imagerekom3 = imagerekom3;
    this.main = main;
    this.profilhome = profilhome;
    this.searchHome = searchHome;
    this.textcategory = textcategory;
    this.textcoming1 = textcoming1;
    this.textcoming2 = textcoming2;
    this.textcoming3 = textcoming3;
    this.textcoming4 = textcoming4;
    this.texthome1 = texthome1;
    this.texthome2 = texthome2;
    this.texthome3 = texthome3;
    this.texthome4 = texthome4;
    this.textrekom = textrekom;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category1;
      Button category1 = ViewBindings.findChildViewById(rootView, id);
      if (category1 == null) {
        break missingId;
      }

      id = R.id.category2;
      Button category2 = ViewBindings.findChildViewById(rootView, id);
      if (category2 == null) {
        break missingId;
      }

      id = R.id.category3;
      Button category3 = ViewBindings.findChildViewById(rootView, id);
      if (category3 == null) {
        break missingId;
      }

      id = R.id.category4;
      Button category4 = ViewBindings.findChildViewById(rootView, id);
      if (category4 == null) {
        break missingId;
      }

      id = R.id.category5;
      Button category5 = ViewBindings.findChildViewById(rootView, id);
      if (category5 == null) {
        break missingId;
      }

      id = R.id.coming;
      HorizontalScrollView coming = ViewBindings.findChildViewById(rootView, id);
      if (coming == null) {
        break missingId;
      }

      id = R.id.coming1;
      ImageView coming1 = ViewBindings.findChildViewById(rootView, id);
      if (coming1 == null) {
        break missingId;
      }

      id = R.id.coming2;
      ImageView coming2 = ViewBindings.findChildViewById(rootView, id);
      if (coming2 == null) {
        break missingId;
      }

      id = R.id.coming3;
      ImageView coming3 = ViewBindings.findChildViewById(rootView, id);
      if (coming3 == null) {
        break missingId;
      }

      id = R.id.coming4;
      ImageView coming4 = ViewBindings.findChildViewById(rootView, id);
      if (coming4 == null) {
        break missingId;
      }

      id = R.id.imagerekom1;
      ImageView imagerekom1 = ViewBindings.findChildViewById(rootView, id);
      if (imagerekom1 == null) {
        break missingId;
      }

      id = R.id.imagerekom2;
      ImageView imagerekom2 = ViewBindings.findChildViewById(rootView, id);
      if (imagerekom2 == null) {
        break missingId;
      }

      id = R.id.imagerekom3;
      ImageView imagerekom3 = ViewBindings.findChildViewById(rootView, id);
      if (imagerekom3 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.profilhome;
      ImageView profilhome = ViewBindings.findChildViewById(rootView, id);
      if (profilhome == null) {
        break missingId;
      }

      id = R.id.search_home;
      EditText searchHome = ViewBindings.findChildViewById(rootView, id);
      if (searchHome == null) {
        break missingId;
      }

      id = R.id.textcategory;
      TextView textcategory = ViewBindings.findChildViewById(rootView, id);
      if (textcategory == null) {
        break missingId;
      }

      id = R.id.textcoming1;
      TextView textcoming1 = ViewBindings.findChildViewById(rootView, id);
      if (textcoming1 == null) {
        break missingId;
      }

      id = R.id.textcoming2;
      TextView textcoming2 = ViewBindings.findChildViewById(rootView, id);
      if (textcoming2 == null) {
        break missingId;
      }

      id = R.id.textcoming3;
      TextView textcoming3 = ViewBindings.findChildViewById(rootView, id);
      if (textcoming3 == null) {
        break missingId;
      }

      id = R.id.textcoming4;
      TextView textcoming4 = ViewBindings.findChildViewById(rootView, id);
      if (textcoming4 == null) {
        break missingId;
      }

      id = R.id.texthome1;
      TextView texthome1 = ViewBindings.findChildViewById(rootView, id);
      if (texthome1 == null) {
        break missingId;
      }

      id = R.id.texthome2;
      TextView texthome2 = ViewBindings.findChildViewById(rootView, id);
      if (texthome2 == null) {
        break missingId;
      }

      id = R.id.texthome3;
      TextView texthome3 = ViewBindings.findChildViewById(rootView, id);
      if (texthome3 == null) {
        break missingId;
      }

      id = R.id.texthome4;
      TextView texthome4 = ViewBindings.findChildViewById(rootView, id);
      if (texthome4 == null) {
        break missingId;
      }

      id = R.id.textrekom;
      TextView textrekom = ViewBindings.findChildViewById(rootView, id);
      if (textrekom == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, category1, category2, category3,
          category4, category5, coming, coming1, coming2, coming3, coming4, imagerekom1,
          imagerekom2, imagerekom3, main, profilhome, searchHome, textcategory, textcoming1,
          textcoming2, textcoming3, textcoming4, texthome1, texthome2, texthome3, texthome4,
          textrekom);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
