package state;

import constants.Constants;
import field.FieldTown;
import jdk.nashorn.internal.objects.Global;

import java.util.Random;

public class GlobalState {

    public static GlobalState globalState = new GlobalState();

    public FieldTown currentField;

    public GlobalState () {
        this.currentField = new FieldTown(
                Constants.FIELD_WIDTH,
                Constants.FIELD_HEIGHT);

    }

    public void init() {
        Random random = new Random();

    }



}
