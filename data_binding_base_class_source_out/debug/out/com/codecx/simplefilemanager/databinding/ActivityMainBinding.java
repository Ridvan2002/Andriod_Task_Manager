// Generated by view binder compiler. Do not edit!
package com.codecx.simplefilemanager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.codecx.simplefilemanager.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton btnCancel;

  @NonNull
  public final ImageView btnCopy;

  @NonNull
  public final ImageView btnDelete;

  @NonNull
  public final ImageView btnMove;

  @NonNull
  public final FloatingActionButton btnPaste;

  @NonNull
  public final RecyclerView fileRecycler;

  @NonNull
  public final ConstraintLayout floatingLayout;

  @NonNull
  public final LinearLayout menuLayout;

  @NonNull
  public final TextView tvMessage;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton btnCancel, @NonNull ImageView btnCopy,
      @NonNull ImageView btnDelete, @NonNull ImageView btnMove,
      @NonNull FloatingActionButton btnPaste, @NonNull RecyclerView fileRecycler,
      @NonNull ConstraintLayout floatingLayout, @NonNull LinearLayout menuLayout,
      @NonNull TextView tvMessage) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnCopy = btnCopy;
    this.btnDelete = btnDelete;
    this.btnMove = btnMove;
    this.btnPaste = btnPaste;
    this.fileRecycler = fileRecycler;
    this.floatingLayout = floatingLayout;
    this.menuLayout = menuLayout;
    this.tvMessage = tvMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancel;
      FloatingActionButton btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btnCopy;
      ImageView btnCopy = ViewBindings.findChildViewById(rootView, id);
      if (btnCopy == null) {
        break missingId;
      }

      id = R.id.btnDelete;
      ImageView btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btnMove;
      ImageView btnMove = ViewBindings.findChildViewById(rootView, id);
      if (btnMove == null) {
        break missingId;
      }

      id = R.id.btnPaste;
      FloatingActionButton btnPaste = ViewBindings.findChildViewById(rootView, id);
      if (btnPaste == null) {
        break missingId;
      }

      id = R.id.fileRecycler;
      RecyclerView fileRecycler = ViewBindings.findChildViewById(rootView, id);
      if (fileRecycler == null) {
        break missingId;
      }

      id = R.id.floatingLayout;
      ConstraintLayout floatingLayout = ViewBindings.findChildViewById(rootView, id);
      if (floatingLayout == null) {
        break missingId;
      }

      id = R.id.menuLayout;
      LinearLayout menuLayout = ViewBindings.findChildViewById(rootView, id);
      if (menuLayout == null) {
        break missingId;
      }

      id = R.id.tvMessage;
      TextView tvMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvMessage == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnCancel, btnCopy, btnDelete,
          btnMove, btnPaste, fileRecycler, floatingLayout, menuLayout, tvMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
