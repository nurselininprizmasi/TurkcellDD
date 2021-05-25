package com.training.turkcell.dp.creation.abstractfactory;

public class RenderFactory {
	public static IRender createRender(final int themeType) {
		switch (themeType) {
		case IThemeConst.BLUE_THEME:
			return new BlueAbstractFactory();
		case IThemeConst.RED_THEME:
			return new RedAbstractFactory();
		default:
			return new BlueAbstractFactory();
		}
	}

}
