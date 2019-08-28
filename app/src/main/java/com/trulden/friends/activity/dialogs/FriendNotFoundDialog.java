package com.trulden.friends.activity.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.trulden.friends.activity.AddInteractionActivity;

public class FriendNotFoundDialog extends DialogFragment {

    private String name;

    public FriendNotFoundDialog(String name){
        this.name = name;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("You don't have friend named «" + name + "»") // TODO set name
               .setPositiveButton("Create", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       ((AddInteractionActivity)getActivity()).createFriendByName(name);
                   }
               })
               .setNeutralButton("I'll edit", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       // TODO do nothing, actually
                   }
               })
               .setNegativeButton("Forget", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       // TODO remove a friend
                   }
               });

        return builder.create();
    }
}
