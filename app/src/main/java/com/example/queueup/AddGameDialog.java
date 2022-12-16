package com.example.queueup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class AddGameDialog extends DialogFragment implements DialogInterface.OnClickListener {

    public static int mSelectedIndex;
    private static OnDialogSelectorListener mDialogSelectorCallback;

    public interface OnDialogSelectorListener {
         public void onSelectedOption(int dialogId);
    }

    OnDialogSelectorListener listener;

    @Override
    public void onAttach(Context activity) {
        super.onAttach(activity);
        try {
            mDialogSelectorCallback = (OnDialogSelectorListener)activity;
        } catch (final ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnDialogSelectorListener");
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.add_game)
                .setSingleChoiceItems(R.array.games, 0, this)
                .setPositiveButton(R.string.ok, this)
                .setNegativeButton(R.string.cancel, this);
        // Create the AlertDialog object and return it
        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        switch (which) {
            case Dialog.BUTTON_NEGATIVE:
                dialog.cancel();
                break;

            case Dialog.BUTTON_POSITIVE:
                dialog.dismiss();
                // message selected value to registered callbacks
                mDialogSelectorCallback.onSelectedOption(mSelectedIndex);
                break;

            default: // choice selected click
                mSelectedIndex = which;
                break;
        }

    }
}
