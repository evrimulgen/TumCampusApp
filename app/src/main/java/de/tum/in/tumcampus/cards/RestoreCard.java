package de.tum.in.tumcampus.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import de.tum.in.tumcampus.R;
import de.tum.in.tumcampus.models.managers.CardManager;

/**
 * Card that allows the user to reset the dismiss state of all cards
 */
public class RestoreCard extends Card {

    public RestoreCard(Context context) {
        super(context);
    }

    @Override
    public int getTyp() {
        return CardManager.CARD_RESTORE;
    }

    @Override
    public View getCardView(Context context, ViewGroup parent) {
        super.getCardView(context, parent);
        return mInflater.inflate(R.layout.card_restore, parent, false);
    }

    @Override
    public boolean isDismissable() {
        return false;
    }
}
