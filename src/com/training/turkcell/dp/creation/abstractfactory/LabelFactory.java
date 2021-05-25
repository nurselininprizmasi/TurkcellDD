package com.training.turkcell.dp.creation.abstractfactory;

public class LabelFactory {
	public static ILabelRender createLabelRender(int themeType) {
		switch (themeType) {
		case IThemeConst.BLUE_THEME:
			return new BlueLabel();
		case IThemeConst.RED_THEME:
			return new RedLabel();
		default:
			return new BlueLabel();
		}
	}

}
